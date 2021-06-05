package heap;

import java.util.Arrays;

public class MinHeap extends BinaryHeap {
	public void minHeapify(int[] heapArray, int index, int heapSize) {
		int smallest = index;
		while (index < heapSize / 2) {
			int leftIndex = (2 * index) + 1;
			int rightIndex = (2 * index) + 2;
			if (leftIndex < heapSize && heapArray[leftIndex] < heapArray[smallest]) {
				smallest = leftIndex;
			}
			if (rightIndex < heapSize && heapArray[rightIndex] < heapArray[smallest]) {
				smallest = rightIndex;
			}
			if (smallest != index) {
				int temp = heapArray[smallest];
				heapArray[smallest] = heapArray[index];
				heapArray[index] = temp;
				index = smallest;
			} else {
				break;
			}
		}
	}

	public void buildMinHeap(int[] heapArray, int heapSize) {
		for (int i = heapSize / 2; i >= 0; i--) {
			minHeapify(heapArray, i, heapSize);
		}
	}

	public static void main(String[] args) {
		int[] heapArray = { 31, 11, 7, 12, 15, 14, 9, 2, 3, 16 };
		System.out.println("Before heapify: " + Arrays.toString(heapArray));
		new MinHeap().buildMinHeap(heapArray, heapArray.length);
		System.out.println("After heapify: " + Arrays.toString(heapArray));

	}

} 
