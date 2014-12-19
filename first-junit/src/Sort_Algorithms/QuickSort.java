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
        RegrassionSort(0, localArray.length - 1);
	}

	private void RegrassionSort(int low, int high)
	{
		int i = low;
		int j = high;
		int pivot = (int) ((low+(high-low))/2);
		System.out.printf("Low %d : High %d : Pivot %d\n", low, high, pivot);

		while (i <= j) {
			while(localArray[i] < localArray[pivot]) {
				i++;
			}
			while(localArray[j] > localArray[pivot]) {
				j--;
			}
			if (i <= j) {
				int temp = localArray[i];
				localArray[i] = localArray[j];
				localArray[j] = temp;
			}
			if (low < j) {
				RegrassionSort(low, j);
			}
			if (i < high) {
				RegrassionSort(i, high);
			}
		}
	}

	public static void main(String[] args)
	{
		Random rand = new Random();
		QuickSort qs = new QuickSort(rand.nextInt(100));
		qs.sort();
		qs.OutputArray();
	}
}