package heap;

import java.util.Arrays;
//@author Matthew Li 2/17/2021 
//Make an operation counter
//Building a heap is O(n)

public class BinaryHeap {
	int small = 2;
	int big = 20;
	private static int opCount = 0;

	public static int getOpCount() {
		return opCount;
	}

	public boolean isMinHeap(int[] heapArray, int index) {
		boolean retval = true;
		int smallest = index;
		int leftIndex = (2 * index) + 1;
		int rightIndex = (2 * index) + 2;
		if (leftIndex < heapArray.length && heapArray[leftIndex] < heapArray[smallest]) {
			retval = false;
		}
		if (rightIndex < heapArray.length && heapArray[rightIndex] < heapArray[smallest]) {
			retval = false;
		}
		return retval;

	}

	public boolean isMaxHeap(int[] heapArray, int index) {
		boolean retval = true;
		int largest = index;

		int leftIndex = (2 * index) + 1;
		int rightIndex = (2 * index) + 2;
		if (leftIndex < heapArray.length && heapArray[leftIndex] > heapArray[largest]) {
			retval = false;
		}
		if (rightIndex < heapArray.length && heapArray[rightIndex] > heapArray[largest]) {
			retval = false;
		}
		return retval;

	}

	public boolean validateMinHeap(int[] heapArray) {
		boolean isMin = true;
		for (int i = 0; i < heapArray.length; i++) {
			if (!isMinHeap(heapArray, i)) {
				return false;
			}
		}
		return isMin;
	}

	public boolean validateMaxHeap(int[] heapArray) {
		boolean isMax = true;
		for (int i = 0; i < heapArray.length; i++) {
			if (!isMaxHeap(heapArray, i)) {
				return false;
			}
		}
		return isMax;
	}

	public int[] fixArraySize(int[] heapArray) {
		if (heapArray.length < small) {
			int[] fixedArray = new int[heapArray.length * 2];
			for (int i = 0; i < heapArray.length; i++) {
				fixedArray[i] = heapArray[i];
			}
			return fixedArray;

		}
		if (heapArray.length > big) {
			int[] fixedArray = new int[heapArray.length / 2];
			for (int i = 0; i < heapArray.length / 2; i++) {
				fixedArray[i] = heapArray[i];
			}
			return fixedArray;
		}
		return heapArray;
	}

	public void testArray(int[] heapArray) {
		System.out.println(Arrays.toString(heapArray));
		System.out.println("The Array is a MinHeap: " + validateMinHeap(heapArray));
		System.out.println("The Array is a MaxHeap: " + validateMaxHeap(heapArray));
		System.out.println("*******************");
	}


}
