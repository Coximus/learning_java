package tests.LinkedLists;

import static org.junit.Assert.*;
import org.junit.Test;
import LinkedLists.LinkedList;
import LinkedLists.LinkedListNode;
import java.util.Arrays;

public class LinkedListTest
{
    @Test
    public void testCanInstantiate()
    {
        LinkedList list = new LinkedList();
        assertTrue(list instanceof LinkedList);
    }

    @Test
    public void testInitialSizeIsZero()
    {
    	LinkedList list = new LinkedList();
    	int listSize = list.getSize();
    	assertTrue(listSize == 0);
    }

    @Test
    public void testAddingDataIncrementsListSize()
    {
    	LinkedList list = new LinkedList();
    	list.addData(10);
    	int listSize = list.getSize();
    	assertTrue(listSize == 1);
    }

    @Test
    public void testAddingNodeIncrementsListSize()
    {
    	LinkedList list = new LinkedList();
    	LinkedListNode node = new LinkedListNode(10);
    	list.addNode(node);
    	int listSize = list.getSize();
    	assertTrue(listSize == 1);
    }

    @Test
    public void testToArrayReturnsCorrectly()
    {
    	int[] expectedArray = {10, 20};
    	LinkedList list = new LinkedList();
    	list.addData(10);
    	list.addData(20);
    	
    	int listSize = list.getSize();
    	assertTrue(listSize == 2);

    	int[] listArray = list.toArray();
    	assertTrue(Arrays.equals(expectedArray, listArray));
    }

    @Test
    public void testFindByDataReturnsNullIfNoElements()
    {
    	LinkedList list = new LinkedList();
    	assertNull(list.findByData(0));
    }

    @Test
    public void testFindByDataReturnsNullIfElementNotFound()
    {
    	LinkedList list = new LinkedList();
    	list.addData(10);
    	assertNull(list.findByData(0));
    }

    @Test
    public void testFindByDataReturnsCorrectNodeIfElementFound()
    {
    	LinkedList list = new LinkedList();
    	for (int i = 10; i >= 0; i--) {
    		list.addData(i);
    	}
    	LinkedListNode node = list.findByData(0);
    	assertTrue(node instanceof LinkedListNode);
    	assertEquals(0, node.getData());
    }

    @Test
    public void testRemovingRootNodeReturnCorrectly()
    {
    	int[] expectedArray = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
    	LinkedList list = new LinkedList();
    	for (int i = 10; i >= 0; i--) {
    		list.addData(i);
    	}
    	LinkedListNode node = list.findByData(10);
    	list.removeNode(node);
    	int[] listArray = list.toArray();
    	assertTrue(Arrays.equals(expectedArray, listArray));
    }

    @Test
    public void testRemovingLastNodeReturnCorrectly()
    {
    	int[] expectedArray = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
    	LinkedList list = new LinkedList();
    	for (int i = 10; i >= 0; i--) {
    		list.addData(i);
    	}
    	LinkedListNode node = list.findByData(0);
    	list.removeNode(node);
    	int[] listArray = list.toArray();
    	assertTrue(Arrays.equals(expectedArray, listArray));
    }

    @Test
    public void testRemovingNodeReturnCorrectly()
    {
    	int[] expectedArray = {10, 9, 8, 7, 6, 4, 3, 2, 1, 0};
    	LinkedList list = new LinkedList();
    	for (int i = 10; i >= 0; i--) {
    		list.addData(i);
    	}
    	LinkedListNode node = list.findByData(5);
    	list.removeNode(node);
    	int[] listArray = list.toArray();
    	assertTrue(Arrays.equals(expectedArray, listArray));
    }
}