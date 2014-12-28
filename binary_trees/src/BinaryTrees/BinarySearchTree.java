package BinaryTrees;

import BinaryTrees.Node;

public class BinarySearchTree
{
	private Node rootNode;
	private int nodeCount;
	private int[] arrayValue;
	private int populatingIndex;

	public BinarySearchTree()
	{
		nodeCount = 0;
	}

	public boolean isEmpty()
	{
		return nodeCount == 0;
	}

	public int getNodeCount()
	{
		return this.nodeCount;
	}

	public void addNode(Node node)
	{
		if (rootNode == null) {
			rootNode = node;
			nodeCount++;
			return;
		}

		Node currentNode = rootNode;
		while (true) { // dangerous - will change TODO
			if (currentNode.data > node.data) {
				if (currentNode.leftChild == null) {
					currentNode.leftChild = node;
					nodeCount++;
					break;
				} else {
					currentNode = currentNode.leftChild;
					continue;
				}
			} else {
				if (currentNode.rightChild == null) {
					currentNode.rightChild = node;
					nodeCount++;
					break;
				} else {
					currentNode = currentNode.rightChild;
					continue;
				}
			}
		}
	}

	public int[] toArray()
	{
		arrayValue = new int[nodeCount];
		populatingIndex = 0;
		if (rootNode == null) {
			return arrayValue;
		}
		populateArray(rootNode);
		return arrayValue;
	}

	private void populateArray(Node node)
	{
		if (node.leftChild != null) {
			populateArray(node.leftChild);
		}
		arrayValue[populatingIndex] = node.data;
		populatingIndex++;
		if (node.rightChild != null) {
			populateArray(node.rightChild);
		}
	}
}