package tests.LinkedLists;

import static org.junit.Assert.*;
import org.junit.Test;
import LinkedLists.LinkedListNode;

public class LinkedListNodeTest
{
    @Test
    public void testCanInstantiate()
    {
        LinkedListNode node = new LinkedListNode();
        assertTrue(node instanceof LinkedListNode);
    }
    
    @Test
    public void testCanInstantiateWithData()
    {
        LinkedListNode node = new LinkedListNode(1000);
        assertTrue(node instanceof LinkedListNode);
        assertEquals(1000, node.getData());
    }
    
    @Test
    public void testCanSetParentChildRelationsShip()
    {
        LinkedListNode rootNode = new LinkedListNode();
        LinkedListNode childNode = new LinkedListNode();
        childNode.setParent(rootNode);
        rootNode.setChild(childNode);
        assertEquals(childNode, rootNode.getChild());
        assertEquals(rootNode, childNode.getParent());
    }

    @Test
    public void testCanSetDataAfterInstantiation()
    {
        LinkedListNode node = new LinkedListNode();
        node.setData(1000);
        assertEquals(1000, node.getData());
    }
}