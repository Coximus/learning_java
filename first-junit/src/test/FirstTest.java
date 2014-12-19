package test;
 
import static org.junit.Assert.*;
import org.junit.Test;
import SortAlgorithms.QuickSort;
 
public class FirstTest {
    @Test
    public void firstTest() {
    	QuickSort qs = new QuickSort(10);
        assertEquals("First Test (should pass)", 1, 1);
    }
 
    @Test
    public void secondTest() {
         assertEquals("Second Test (should fail)", 1, 2);
    }
}