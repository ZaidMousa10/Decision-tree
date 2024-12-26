package com.example.machinedesiciontree;

import java.util.Arrays;

public class Entity {
    private String[] features;
    private boolean status;   //("edible" or "poisonous")

    public Entity(String[] features, boolean status) {
        this.features = features;
        this.status = status;
    }

    // this method to get a specific feature value by its index
    public String getFeature(int index) {
        return features[index];
    }


	public String[] getFeatures() {
		return features;
	}

	public void setFeatures(String[] features) {
		this.features = features;
	}

	public boolean getStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Entitiy [features=" + Arrays.toString(features) + ", status=" + status + "]";
	}



}
