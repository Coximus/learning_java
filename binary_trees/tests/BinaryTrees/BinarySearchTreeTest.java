package tests.BinaryTrees;

import static org.junit.Assert.*;
import org.junit.Test;
import BinaryTrees.BinarySearchTree;
import BinaryTrees.Node;
import java.util.Arrays;

public class BinarySearchTreeTest
{
	@Test
	public void testCanInstantiateBinarySearchTree()
	{
		BinarySearchTree bst = new BinarySearchTree();
		assertTrue(bst instanceof BinarySearchTree);
	}

	@Test
	public void testNewBinarySearchTreeIsEmpty()
	{
		BinarySearchTree bst = new BinarySearchTree();
		assertTrue(bst.isEmpty());
	}

	@Test
	public void testAddingASingleNodeIncrementsTheNodeCountToBeOne()
	{
		int expectedCount = 1;
		BinarySearchTree bst = new BinarySearchTree();
		Node node = new Node(100);
		bst.addNode(node);
		assertEquals(expectedCount, bst.getNodeCount());
	}

	@Test
	public void testAddingTwoNodesIncrementsTheNodeCountToBeTwo()
	{
		int expectedCount = 2;
		BinarySearchTree bst = new BinarySearchTree();
		bst.addNode(new Node(100));
		bst.addNode(new Node(99));
		assertEquals(expectedCount, bst.getNodeCount());
	}

	@Test
	public void testEasyPathReturnsCorrectlySortedArray()
	{
		int[] expectedArray = {99, 100};
		BinarySearchTree bst = new BinarySearchTree();
		bst.addNode(new Node(100));
		bst.addNode(new Node(99));
		assertTrue(Arrays.equals(expectedArray, bst.toArray()));
	}

	@Test
	public void testBalancedTreeReturnsCorrectlySortedArray()
	{
		int[] expectedArray = {99, 100, 101};
		BinarySearchTree bst = new BinarySearchTree();
		bst.addNode(new Node(100));
		bst.addNode(new Node(99));
		bst.addNode(new Node(101));
		assertTrue(Arrays.equals(expectedArray, bst.toArray()));
	}

	@Test
	public void testUnBalancedTreeReturnsCorrectlySortedArray()
	{
		int[] nodeData = {1, 99, 3, 66, 12, 1000, 45, 23, 93};
		int[] expectedArray = {1, 3, 12, 23, 45, 66, 93, 99, 1000};
		BinarySearchTree bst = new BinarySearchTree();
		for (int i = 0; i < nodeData.length; i++) {
			bst.addNode(new Node(nodeData[i]));
		}
		assertTrue(Arrays.equals(expectedArray, bst.toArray()));
	}
}