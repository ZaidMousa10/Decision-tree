package com.example.machinedesiciontree;

import javafx.application.Application;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Driver extends Application {

	static MyList training_set;
	static MyList test_set;

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) {
		training_set = new MyList();
		primaryStage.setTitle("CSV File Reader");

		Button readButton = new Button("Read CSV");

		readButton.setOnAction(e -> {
			readCSVFile(primaryStage); // Read file and calculate results immediately
		});

		StackPane startStackPane = new StackPane(readButton);
		primaryStage.setScene(new Scene(startStackPane, 400, 200));
		primaryStage.show();
	}

	public static void readCSVFile(Stage stage) {

		MyList all_data = new MyList();
		DataInputStream input = null;

		int count = 0;
		int entities_counter = 0;

		try {
			// Use FileChooser to select the file
			FileChooser fileChooser = new FileChooser();
			fileChooser.setTitle("Select CSV File");
			fileChooser.getExtensionFilters().add(new FileChooser.ExtensionFilter("CSV files", "*.csv"));

			File file = fileChooser.showOpenDialog(stage);
			if (file == null) {
				return;
			}

			input = new DataInputStream(new FileInputStream(file));

			String header = input.readLine(); // to skip the header line
			String line = "";
			count = 0;

			while ((line = input.readLine()) != null) {
				String[] array = line.split(",");
				String[] features = new String[array.length - 1]; // exclude the Edible column
				for (int i = 0; i < features.length; i++) {
					features[i] = array[i + 1];
				}

				if (array.length != 23) { // that means the line (row) read has missing or extra information
					count++;
					continue;
				}

				try {
					boolean status = true;
					if (array[0].equalsIgnoreCase("edible"))
						status = true;
					else if (array[0].equalsIgnoreCase("poisonous"))
						status = false;

					Entity r = new Entity(features, status);
					all_data.addToList(r);
					entities_counter++;

				} catch (IllegalArgumentException ex) {
					count++;
				}
			}

			all_data.shuffle(); // ensures the data is distributed randomly to prevent bias

			training_set = all_data.subList(0, ((70 * all_data.getNumber_of_objects()) / 100));
			test_set = all_data.subList(((70 * all_data.getNumber_of_objects()) / 100), all_data.getNumber_of_objects());

			input.close();

			// Calculate entropy and information gain immediately after reading
			double entropy = calculateEntropy(training_set);
			double infoGain = calculateInformationGain(training_set, 0); // Using feature index 0 as an example

			// Display results in an alert
			Alert alert = new Alert(AlertType.INFORMATION);
			alert.setTitle("Processing Complete");
			alert.setHeaderText("Data Processing Results");
			alert.setContentText("Training Set Size: " + training_set.getNumber_of_objects() + "\n" +
					"Test Set Size: " + test_set.getNumber_of_objects() + "\n" +
					"Rows with Issues: " + count + "\n" +
					"Number of Entities: " + entities_counter + "\n\n" +
					"Entropy: " + entropy + "\n" +
					"Information Gain (Feature Index 0): " + infoGain);
			alert.showAndWait();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	// Method to calculate entropy
	public static double calculateEntropy(MyList data) {
		Map<Boolean, Integer> classCounts = new HashMap<>();
		for (Entity entity : data.getList()) {
			boolean label = entity.getStatus();
			classCounts.put(label, classCounts.getOrDefault(label, 0) + 1);
		}

		int total = data.getNumber_of_objects();
		double entropy = 0.0;

		for (int count : classCounts.values()) {
			double probability = (double) count / total;
			entropy -= probability * log2(probability);
		}

		return entropy;
	}

	// Method to calculate information gain
	public static double calculateInformationGain(MyList data, int featureIndex) {
		// Check for constant or non-varying features
		Set<String> featureValues = new HashSet<>();
		for (Entity entity : data.getList()) {
			featureValues.add(entity.getFeature(featureIndex));
		}

		// If the feature has only one unique value, its information gain is 0
		if (featureValues.size() <= 1) {
			return 0.0;
		}

		double parentEntropy = calculateEntropy(data);

		MyList subsetYes = new MyList();
		MyList subsetNo = new MyList();

		for (Entity entity : data.getList()) {
			if ("yes".equalsIgnoreCase(entity.getFeature(featureIndex))) {
				subsetYes.addToList(entity);
			} else {
				subsetNo.addToList(entity);
			}
		}

		int total = data.getNumber_of_objects();
		double weightedEntropy = 0.0;

		if (subsetYes.getNumber_of_objects() > 0) {
			double weightYes = (double) subsetYes.getNumber_of_objects() / total;
			weightedEntropy += weightYes * calculateEntropy(subsetYes);
		}
		if (subsetNo.getNumber_of_objects() > 0) {
			double weightNo = (double) subsetNo.getNumber_of_objects() / total;
			weightedEntropy += weightNo * calculateEntropy(subsetNo);
		}

		return parentEntropy - weightedEntropy;
	}

	// Log base 2 calculation
	public static double log2(double x) {
		return Math.log(x) / Math.log(2);
	}
}
