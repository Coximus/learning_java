package SortAlgorithms;

import java.util.Random;

public class QuickSort extends SortAbstract implements SortInterface
{
    public QuickSort(int arraySize)
    {
        super.generateRandomArray(arraySize);
    }

    public QuickSort(int[] array)
    {
        localArray = array;
    }

    public void sort()
    {
        RegressionSort(0, localArray.length - 1);
    }

    private void RegressionSort(int low, int high)
    {
        int i = low;
        int j = high;
        int pivot = localArray[low + (high-low)/2];

        while (i <= j) {
            while (localArray[i] < pivot) {
                i++;
            }
            while (localArray[j] > pivot) {
                j--;
            }

            if (i <= j) {
                swapElements(i, j);
                i++;
                j--;
            }
        }
        if (low < j)
            RegressionSort(low, j);
        if (i < high)
            RegressionSort(i, high);
    }

    private void swapElements(int i, int j) {
        int temp = localArray[i];
        localArray[i] = localArray[j];
        localArray[j] = temp;
    }

    public static void main(String[] args)
    {
        Random rand = new Random();
        QuickSort qs = new QuickSort(rand.nextInt(100));
        qs.sort();
        qs.OutputArray();
    }
}