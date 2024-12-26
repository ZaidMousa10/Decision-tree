package com.example.machinedesiciontree;

public class DecisionTreeNode {
    private int featureIndex;         // Index of the feature used to split (only for decision nodes)
    private DecisionTreeNode leftChild;           // Left child (only for decision nodes)
    private DecisionTreeNode rightChild;          // Right child (only for decision nodes)
    private boolean status;        // is edible or not
    private boolean isLeaf;           // this is used to know if this decision tree node is a leaf or not

    //this is used for decision nodes
    public DecisionTreeNode(int featureIndex, DecisionTreeNode leftChild, DecisionTreeNode rightChild) {
        this.featureIndex = featureIndex;
        this.leftChild = leftChild;
        this.rightChild = rightChild;
        this.isLeaf = false;
    }

    //this is used for leaf nodes
    public DecisionTreeNode(boolean status) {
        this.status = status;
        this.isLeaf = true;
    }

    public DecisionTreeNode() {
        this.isLeaf = true;
        this.status = false;
        this.featureIndex = -1;
        this.leftChild = null;
        this.rightChild = null;
    }


    public int getFeatureIndex() {
		return featureIndex;
	}
	public void setFeatureIndex(int featureIndex) {
		this.featureIndex = featureIndex;
	}

	public DecisionTreeNode getLeftChild() {
		return leftChild;
	}
	public void setLeftChild(DecisionTreeNode leftChild) {
		this.leftChild = leftChild;
	}

	public DecisionTreeNode getRightChild() {
		return rightChild;
	}
	public void setRightChild(DecisionTreeNode rightChild) {
		this.rightChild = rightChild;
	}

	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}

	public boolean isLeaf() {
		return isLeaf;
	}
	public void setLeaf(boolean isLeaf) {
		this.isLeaf = isLeaf;
	}
	
	

	public void printTree(String indent) {
        if (this.isLeaf ==true) {
            // If it's a leaf node, print the class label
            System.out.println(indent + "Class: " + isLeaf);
        } else {
            // If it's a decision node, print the feature index and split value
            System.out.println(indent + "Feature " + featureIndex + " = " + featureIndex + "?");
            System.out.println(indent + "Left:");
            leftChild.printTree(indent + "  ");
            System.out.println(indent + "Right:");
            rightChild.printTree(indent + "  ");
        }
    }
	
	
	@Override
    public String toString() {
        if (isLeaf) {
            return "LeafNode{" +"Edible="+status +"}";
        } else {
            return "DecisionNode{" +"featureIndex=" + featureIndex +", leftChild=" + leftChild +", rightChild=" + rightChild +"}";
        }
    }
}
