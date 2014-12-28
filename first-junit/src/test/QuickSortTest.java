package test;
 
import static org.junit.Assert.*;
import org.junit.Test;
import SortAlgorithms.QuickSort;
import java.util.Arrays;

public class QuickSortTest {
    @Test
    public void AlreadyOrdered()
    {
    	int[] inputArray = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
    	int[] expectedArray = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
    	QuickSort qs = new QuickSort(inputArray);
    	qs.sort();
        assertTrue(Arrays.equals(expectedArray, qs.getArray()));
    }

    @Test
    public void orderReversed()
    {
    	int[] inputArray = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
    	int[] expectedArray = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
    	QuickSort qs = new QuickSort(inputArray);
    	qs.sort();
        assertTrue(Arrays.equals(expectedArray, qs.getArray()));
    }

    @Test
    public void oddSizedArray()
    {
    	int[] inputArray = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
    	int[] expectedArray = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    	QuickSort qs = new QuickSort(inputArray);
    	qs.sort();
        assertTrue(Arrays.equals(expectedArray, qs.getArray()));
    }
}