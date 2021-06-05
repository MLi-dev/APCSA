package heap;

import java.util.Arrays;

public class MaxHeap extends BinaryHeap {
	public void maxHeapify(int[] arr, int index, int arrSize) {
		int largest = index;
		while (index < arrSize / 2) {
			// left and right Index must be within loop
			int leftIndex = 2 * index + 1;
			int rightIndex = 2 * index + 2;
			if (leftIndex < arrSize && arr[leftIndex] > arr[largest]) {
				largest = leftIndex;
			}
			if (rightIndex < arrSize && arr[rightIndex] > arr[largest]) {
				largest = rightIndex;
			}
			if (largest != index) {
				int temp = arr[largest];
				arr[largest] = arr[index];
				arr[index] = temp;
				index = largest;
			} else {
				break;
			}
		}
	}

	public void buildMaxHeap(int[] arr) {
		// 0-9, so must be arr.length-1 to get to index 4 (halfway point).
		for (int i = (arr.length - 1) / 2; i >= 0; i--) {
			maxHeapify(arr, i, arr.length);
		}

	}

	public static void main(String[] args) {
		MaxHeap m = new MaxHeap();
		System.out.println("Converts the original array to a MaxHeap");
		int[] testArray = { 2, 3, 7, 11, 15, 14, 9, 12, 31, 16 };
		System.out.println("The original test array is " + Arrays.toString(testArray));
		m.buildMaxHeap(testArray);
		System.out.println("The converted test array is " + Arrays.toString(testArray));
		System.out.println("*******************");
		System.out.println("Tests if array meets requirements of a heap");
		int[] invalidHeapArray = { 31, 11, 7, 12, 15, 14, 9, 2, 3, 16 };
		m.testArray(invalidHeapArray);
		System.out.println("Tests if array meets requirements of a heap (this one is a min heap)");
		int[] validMinHeapArray = { 2, 3, 7, 11, 15, 14, 9, 12, 31, 16 };
		m.testArray(validMinHeapArray);
		System.out.println("Tests what happens when array size is too small");
		int[] smallTestArray = { 1 };
		System.out.println("The fixed Array is: " + Arrays.toString(m.fixArraySize(smallTestArray)));
		System.out.println("*******************");
		System.out.println("Tests what happens when array size is too big");
		int[] bigTestArray = { 31, 11, 7, 12, 15, 14, 9, 2, 3, 16, 100, 30, 40, 50, 19, 200, 16, 17, 18, 20, 21, 30 };
		System.out.println("The fixed Array is: " + Arrays.toString(m.fixArraySize(bigTestArray)));
		System.out.println("*******************");
		System.out.println("Converts array to a MinHeap");
		int[] heapArray = { 31, 11, 7, 12, 15, 14, 9, 2, 3, 16 };
		System.out.println("Before heapify: " + Arrays.toString(heapArray));
		new MinHeap().buildMinHeap(heapArray, heapArray.length);
		System.out.println("After heapify: " + Arrays.toString(heapArray));

	}
}
