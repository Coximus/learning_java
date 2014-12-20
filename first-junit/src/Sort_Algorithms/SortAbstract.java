package SortAlgorithms;

import java.util.Random;

public class SortAbstract
{
	protected int[] localArray;

	protected void generateRandomArray(int arraySize)
	{
		System.out.printf("Generating array of size : %d\n", arraySize);
		Random rand = new Random();
		localArray = new int[arraySize];
		for(int i = 0; i < arraySize; i++) {
			localArray[i] = rand.nextInt(100000);
			System.out.printf("localArray[%d] = %d\n", i, localArray[i]);
		}

	}

	public int[] getArray()
	{
		return localArray;
	}

	public void OutputArray()
	{
		for (int i = 0; i < localArray.length; i++) {
			System.out.printf("localArray[%d] = %d\n", i, localArray[i]);
		}
	}
	
}