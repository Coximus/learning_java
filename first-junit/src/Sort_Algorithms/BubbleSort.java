package SortAlgorithms;

import java.util.Random;

public class BubbleSort extends SortAbstract implements SortInterface
{
	public BubbleSort(int arraySize)
	{
		super.generateRandomArray(arraySize);
	}

	public void sort()
	{
		int j;
		boolean flag = true;
		int temp; 

		while (flag) {
			flag = false;
			for (j = 0; j < localArray.length - 1; j++) {
				if (localArray[j] > localArray[j+1]) {
					temp = localArray[j];
					localArray[j] = localArray[j+1];
					localArray[j+1] = temp;
					flag = true;
				}
			}
		}
	}

	public static void main(String[] args)
	{
		Random rand = new Random();
		BubbleSort bs = new BubbleSort(rand.nextInt(100));
		bs.sort();
		bs.OutputArray();
	}
}