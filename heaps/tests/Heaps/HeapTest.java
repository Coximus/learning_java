package tests.Heaps;

import static org.junit.Assert.*;
import org.junit.Test;
import Heaps.Heap;
import java.util.Arrays;

public class HeapTest
{
	@Test
	public void testAddingDataCorrectly()
	{
		int[] inputArray = {11, 10, 8, 18, 4, 22, 26, 6, 2, 8};
		int[] expectedArray = {26, 11, 22, 10, 8, 8, 18, 6, 2, 4};
		Heap heap = new Heap(10);
		for (int i = 0; i < inputArray.length; i++) {
			heap.add(inputArray[i]);
		}
		assertTrue(Arrays.equals(expectedArray, heap.getHeap()));
	}
	
	@Test
	public void testSortingWorksCorrectly()
	{
		int[] inputArray = {11, 10, 8, 18, 4, 22, 26, 6, 2, 8};
		int[] expectedArray = {2, 4, 6, 8, 8, 10, 11, 18, 22, 26};
		Heap heap = new Heap(10);
		for (int i = 0; i < inputArray.length; i++) {
			heap.add(inputArray[i]);
		}
		System.out.printf(Arrays.toString(heap.getSorted()));
		assertTrue(Arrays.equals(expectedArray, heap.getSorted()));
	}
}