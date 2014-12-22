package tests.LinkedLists;

import static org.junit.Assert.*;
import org.junit.Test;
import LinkedLists.LinkedList;

public class LinkedListTest
{
    @Test
    public void testCanInstantiate()
    {
        LinkedList list = new LinkedList();
        assertTrue(list instanceof LinkedList);
    }
}