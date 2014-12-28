package test;

import static org.junit.Assert.*;
import org.junit.Test;
import SortAlgorithms.MergeSort;
import java.util.Arrays;

public class MergeSortTest
{
	@Test
	public void testCanInstantiate()
	{
		MergeSort ms = new MergeSort(10);
		assertTrue(ms instanceof MergeSort);
	}

	@Test
	public void testSimpleSoirt()
	{
		int[] inputArray = {8, 12, 13, 4, 21, 1, 2};
		int[] expectedArray = {1, 2, 4, 8, 12, 13, 21};
		MergeSort ms = new MergeSort(inputArray);
		ms.sort();
		int[] sortedArray = ms.getArray();
		assertTrue(Arrays.equals(expectedArray, sortedArray));
	}
}