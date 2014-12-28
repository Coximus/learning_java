package SortAlgorithms;

public class MergeSort extends SortAbstract implements SortInterface
{

	private int[] tempMergArr;

	public MergeSort(int arraySize)
	{
		super.generateRandomArray(arraySize);
	}

	public MergeSort(int[] array)
	{
		localArray = array;
	}

	public void sort()
	{
		tempMergArr = new int[localArray.length];
		mergeSort(0, localArray.length -1);
	}

	private void mergeSort(int low, int high)
	{
		if (low < high) {
			int middle = low + (high - low)/2;
			mergeSort(low, middle);
			mergeSort(middle + 1, high);
			mergeParts(low, middle, high);
		}
	}

	private void mergeParts(int low, int middle, int high)
	{
		for (int i = low; i <= high; i++) {
			tempMergArr[i] = localArray[i];
		}
		int i = low;
		int j = middle + 1;
		int k = low;
		while (i <= middle && j <= high) {
			if (tempMergArr[i] <= tempMergArr[j]) {
				localArray[k] = tempMergArr[i];
				i++;
			} else {
				localArray[k] = tempMergArr[j];
				j++;
			}
			k++;
		}
		while (i <= middle) {
			localArray[k] = tempMergArr[i];
			k++;
			i++;
		}
	}
}