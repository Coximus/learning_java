package Heaps;

public class Heap
{
	private int[] heap;
	private int heapSize;

	public Heap(int size)
	{
		heap = new int[size];
		heapSize = 0;
	}

	public int[] getHeap()
	{
		return heap;
	}

	public void add(int data)
	{
		push(data);
	}

	public int[] getSorted()
	{
		int[] sortedArray = new int[heapSize];
		int backIndex = heapSize - 1;
		int frontIndex = 0;

		while(frontIndex < heapSize)
		{
			if ((heap[frontIndex] > heap[frontIndex+1]) && (heap[frontIndex] > heap[frontIndex+2])) { // front is biggest
				sortedArray[backIndex] = heap[frontIndex];
				backIndex--;
				if (heap[frontIndex+1] > heap[frontIndex+2]) {
					sortedArray[backIndex] = heap[frontIndex+1];
					backIndex--;
					sortedArray[backIndex] = heap[frontIndex+2];
					backIndex--;
				} else {
					sortedArray[backIndex] = heap[frontIndex+2];
					backIndex--;
					sortedArray[backIndex] = heap[frontIndex+1];
					backIndex--;
				}
			} else if (heap[frontIndex+1] > heap[frontIndex+2]) { // second is biggest
				sortedArray[backIndex] = heap[frontIndex+1];
				backIndex--;
				if (heap[frontIndex] > heap[frontIndex+2]) {
					sortedArray[backIndex] = heap[frontIndex];
					backIndex--;
					sortedArray[backIndex] = heap[frontIndex+2];
					backIndex--;
				} else {
					sortedArray[backIndex] = heap[frontIndex+2];
					backIndex--;
					sortedArray[backIndex] = heap[frontIndex];
					backIndex--;
				}
			} else { // third is biggest
				sortedArray[backIndex] = heap[frontIndex+2];
				backIndex--;
				if (heap[frontIndex] > heap[frontIndex+1]) {
					sortedArray[backIndex] = heap[frontIndex];
					backIndex--;
					sortedArray[backIndex] = heap[frontIndex+1];
					backIndex--;
				} else {
					sortedArray[backIndex] = heap[frontIndex+1];
					backIndex--;
					sortedArray[backIndex] = heap[frontIndex];
					backIndex--;
				}
			}
			frontIndex+=3;
			// if (frontIndex >= backIndex) {
			// 	break;
			// }
		}

		return sortedArray;
	}

	private int[] getSorted(int start, int count) 
	{
		int[] returnArray = new int[count];
		for (int i = 0; i < count; i++) {
			if ()
		}
	}

	private void push(int data)
	{
		if (heapSize >= heap.length) {
			return;
		}

		heap[heapSize] = data;
		performParentCheck(getParentIndex(heapSize), heapSize);
		heapSize++;
	}

	private void performParentCheck(int parent, int child) {
		if (child > parent) {
			if (heap[child] > heap[parent]) {
				int temp = heap[parent];
				heap[parent] = heap[child];
				heap[child] = temp;
				performParentCheck(getParentIndex(parent), parent);
			}
		}
	}

	private int getParentIndex(int index)
	{
		int parentIndex = (index - 1) / 2;
		return parentIndex;
	}
}

//    0 		 	
//  1   2 			(1 - 1) / 2 = 0, (2 - 1) / 2 = 0
// 3 4 5 6			(3 - 1) / 2 = 1, (4 - 1) / 2 = 1,	(5 - 1) / 2 = 2, (6 - 1) / 2 = 2  