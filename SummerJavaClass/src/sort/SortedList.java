package sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortedList extends ArrayList<Integer> {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public int[] twoWaySort(int[] array) {
		if (array.length == 1) {
			return array;
		}
		int middle = (int) Math.floor(array.length / 2);
		int[] leftArray = Arrays.copyOfRange(array, 0, middle);
		int[] rightArray = Arrays.copyOfRange(array, middle, array.length);
		return mergeTwo(twoWaySort(leftArray), twoWaySort(rightArray));

	}

	public int[] mergeTwo(int[] left, int[] right) {
		int[] result = new int[left.length + right.length];
		int leftIndex = 0;
		int rightIndex = 0;
		int resultIndex = 0;
		while (leftIndex < left.length && rightIndex < right.length) {
			if (left[leftIndex] < right[rightIndex]) {
				result[resultIndex++] = left[leftIndex];
				leftIndex++;
			} else {
				result[resultIndex++] = right[rightIndex];
				rightIndex++;
			}
		}
		System.arraycopy(left, leftIndex, result, resultIndex, left.length - leftIndex);
		resultIndex = resultIndex + left.length - leftIndex;
		System.arraycopy(right, rightIndex, result, resultIndex, right.length - rightIndex);
		return result;

	}

	public int[] threeWaySort(int[] array) {

		if (array.length < 3) {
			return twoWaySort(array);
		}
		int splitPoint1 = (int) Math.floor(array.length / 3);
		int splitPoint2 = 2 * splitPoint1;
		// Splits the array into three segments.
		int[] leftArray = Arrays.copyOfRange(array, 0, splitPoint1);
		int[] centerArray = Arrays.copyOfRange(array, splitPoint1, splitPoint2);
		int[] rightArray = Arrays.copyOfRange(array, splitPoint2, array.length);
		return mergeThree(threeWaySort(leftArray), threeWaySort(centerArray), threeWaySort(rightArray));
	}

	public int[] mergeThree(int[] left, int[] center, int[] right) {
		int[] result = new int[left.length + center.length + right.length];
		int leftIndex = 0;
		int rightIndex = 0;
		int centerIndex = 0;
		int resultIndex = 0;
		// Compares the left, center and right Indexes. If meeting the conditions, will
		// set to minimum.
		while (leftIndex < left.length && centerIndex < center.length && rightIndex < right.length) {
			if (left[leftIndex] <= center[centerIndex] && left[leftIndex] <= right[rightIndex]) {
				result[resultIndex++] = left[leftIndex];
				leftIndex++;

			} else if (center[centerIndex] <= left[leftIndex] && center[centerIndex] <= right[rightIndex]) {
				result[resultIndex++] = center[centerIndex];
				centerIndex++;
			} else if (right[rightIndex] <= center[centerIndex] && right[rightIndex] <= left[leftIndex]) {
				result[resultIndex++] = right[rightIndex];
				rightIndex++;
			}
		}
		while (leftIndex < left.length && centerIndex < center.length) {
			if (left[leftIndex] <= center[centerIndex]) {
				result[resultIndex++] = left[leftIndex];
				leftIndex++;

			} else {
				result[resultIndex++] = center[centerIndex];
				centerIndex++;
			}
		}
		while (leftIndex < left.length && rightIndex < right.length) {
			if (left[leftIndex] <= right[rightIndex]) {
				result[resultIndex++] = left[leftIndex];
				leftIndex++;

			} else {
				result[resultIndex++] = right[rightIndex];
				rightIndex++;
			}

		}
		while (centerIndex < center.length && rightIndex < right.length) {
			if (center[centerIndex] <= right[rightIndex]) {
				result[resultIndex++] = center[centerIndex];
				centerIndex++;

			} else {
				result[resultIndex++] = right[rightIndex];
				rightIndex++;
			}

		}

		System.arraycopy(left, leftIndex, result, resultIndex, left.length - leftIndex);
		// Increments resultIndex, because remaining part of list must added at the end.
		resultIndex = resultIndex + left.length - leftIndex;
		System.arraycopy(center, centerIndex, result, resultIndex, center.length - centerIndex);
		resultIndex = resultIndex + center.length - centerIndex;
		System.arraycopy(right, rightIndex, result, resultIndex, right.length - rightIndex);
		return result;

	}

	public int[] bubbleSort(int[] arr) {
		boolean swapped;
		do {
			swapped = false;
			for (int i = 0; i < arr.length; i++) {
				if (i + 1 < arr.length && i < arr.length && arr[i] > arr[i + 1]) {
					int temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;
					swapped = true;
				}
			}

		} while (swapped);
		return arr;
	}

	public int[] insertionSort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			int temp = arr[i];
			int pivot = i - 1;
			while (pivot >= 0 && arr[pivot] > temp) {
				arr[pivot + 1] = arr[pivot];
				pivot--;
			}
			arr[pivot + 1] = temp;
		}
		return arr;
	}

	public List insertionSort(List<Double> list) {
		for (int i = 0; i < list.size(); i++) {
			double temp = list.get(i);
			int pivot = i - 1;
			while (pivot >= 0 && list.get(pivot) > temp) {
				list.set(pivot + 1, list.get(pivot));
				pivot--;
			}
			list.set(pivot + 1, temp);
		}
		return list;
	}

	public int partitionHoare(int[] array, int lowEnd, int highEnd) {
		int pivotIndex = highEnd;
		int pivot = array[pivotIndex];
		int pointerPosition = lowEnd;
		int copPosition = lowEnd;
		for (int i = lowEnd; i < highEnd; i++) {
			if (array[i] < pivot) {
				int temp = array[pointerPosition];
				array[pointerPosition] = array[i];
				array[i] = temp;
				pointerPosition++;
				copPosition++;
			} else {
				copPosition++;
			}
		}
		int temp = pivot;
		array[pivotIndex] = array[pointerPosition];
		array[pointerPosition] = temp;
		return pointerPosition;
	}

	public int[] quickSort(int[] array, int left, int right) {
		int pivot = partitionHoare(array, left, right);
		if (left < pivot - 1) {
			quickSort(array, left, pivot - 1);
		}
		if (right > pivot) {
			quickSort(array, pivot, right);
		}
		return array;
	}

	public int[] selectionSort(int[] array) {
		int minIndex;
		for (int i = 0; i < array.length; i++) {
			minIndex = i;
			for (int j = i; j < array.length; j++) {
				if (array[j] < array[minIndex]) {
					minIndex = j;
				}
			}
			int temp = array[i];
			array[i] = array[minIndex];
			array[minIndex] = temp;

		}
		return array;
	}

	public int[] countingSort(int[] array, int countLength) {
		int[] countArray = new int[countLength];
		int[] b = new int[array.length];
		for (int i = 0; i < array.length; i++) {
			countArray[array[i]]++;
		}
		for (int i = 1; i < countLength; i++) {
			countArray[i] = countArray[i] + countArray[i - 1];
		}
		for (int i = array.length - 1; i >= 0; i--) {
			b[--countArray[array[i]]] = array[i];

		}
		return b;
	}

	public int[] countingSort(int[] array, int n, int pos) {
		int[] countArray = new int[n + 1];
		int[] b = new int[array.length];
		for (int i = 0; i < array.length; i++) {
			countArray[(array[i] / pos) % 10]++;
		}
		for (int i = 1; i < n + 1; i++) {
			countArray[i] = countArray[i] + countArray[i - 1];
		}
		for (int i = array.length - 1; i >= 0; i--) {
			b[--countArray[(array[i] / pos) % 10]] = array[i];

		}
		for (int i = 0; i < b.length; i++) {
			array[i] = b[i];
		}
		return array;
	}

	public int getMax(int[] array) {
		int max = array[0];
		for (int i = 0; i < array.length; i++) {
			if (array[i] > max) {
				max = array[i];
			}
		}
		return max;
	}

	public int[] radixSort(int[] array, int n) {
		int max = getMax(array);
		for (int pos = 1; (max / pos) > 0; pos *= 10) {
			countingSort(array, n, pos);
		}
		return array;

	}

	public double[] bucketSort(double[] array) {
		int n = array.length;
		List[] buckets = new List[n];
		double[] resultArray = new double[n];
		int resultArrayIndex = 0;
		for (int i = 0; i < array.length; i++) {
			buckets[i] = new ArrayList<Double>();
		}
		for (int i = 0; i < n; i++) {
			int index = (int) Math.floor(n * array[i] / 10);
			buckets[index].add(array[i]);
		}
		for (int i = 0; i < buckets.length; i++) {
			List<Double> sortedBucketList = insertionSort(buckets[i]);
			for (int j = 0; j < sortedBucketList.size(); j++) {
				resultArray[resultArrayIndex++] = sortedBucketList.get(j);
			}
		}
		return resultArray;
	}

	public void minHeapify(int[] array, int index, int heapSize) {
		int smallest = index;
		while (index < heapSize / 2) {
			int leftIndex = 2 * index + 1;
			int rightIndex = 2 * index + 2;
			if (leftIndex < heapSize && array[leftIndex] < array[index]) {
				smallest = leftIndex;
			}
			if (rightIndex < heapSize && array[rightIndex] < array[smallest]) {
				smallest = rightIndex;
			}
			if (smallest != index) {
				int temp = array[smallest];
				array[smallest] = array[index];
				array[index] = temp;
				smallest = index;
			} else {
				break;
			}
		}

	}

	public void buildHeap(int[] array) {
		int index = array.length / 2;
		for (int i = index; i >= 0; i--) {
			minHeapify(array, i, array.length);
		}
	}

	public static void main(String[] args) {
		SortedList s = new SortedList();
		// Tests when array length does not divide perfectly by 3.
		int[] arr1 = { 6, 5, 3, 1, 8, 7, 2, 4, 9, 5, 10 };
		System.out.println(Arrays.toString(s.threeWaySort(arr1)));
		// Tests when array has length less than 3.
		int[] arr2 = { 5 };
		System.out.println(Arrays.toString(s.threeWaySort(arr2)));
//		int[] arr3 = { 6, 3 };
//		System.out.println(Arrays.toString(s.threeWaySort(arr3)));
		// Tests when there are duplicate values in the array.
		int[] arr4 = { 6, 5, 3, 10, 8, 7, 2, 4, 9, 5, 10, 1 };
		System.out.println(Arrays.toString(s.threeWaySort(arr4)));
//		// Meeting conditions of array length dividing by 3.
		int[] arr5 = { 6, 5, 3, 9, 7 };
		System.out.println(Arrays.toString(s.threeWaySort(arr5)));
		System.out.println(Arrays.toString(s.bubbleSort(arr5)));
		int[] arr6 = { 6, 9, 2, 5, 1, 3 };
		System.out.println(Arrays.toString(s.insertionSort(arr6)));
		int[] arr7 = { 17, 41, 5, 22, 54, 6, 29, 3, 13 };
		System.out.println((Arrays.toString(s.quickSort(arr7, 0, 8))));
		int[] arr8 = { 2, 6, 4, 1, 5, 3 };
		System.out.println((Arrays.toString(s.selectionSort(arr8))));
		int[] arr9 = { 4, 2, 1, 8, 5, 1, 2 };
		System.out.println(Arrays.toString(s.countingSort(arr9, 9)));
		double[] arr10 = { 5.2, 1.8, 4.8, 5.9, 2.3, 6.5, 2.2 };
		System.out.println(Arrays.toString(s.bucketSort(arr10)));
		int[] sampleArray = { 3, 4, 8, 9, 7, 10, 9, 15, 20, 13, 9 };
		s.buildHeap(sampleArray);
		System.out.println(Arrays.toString(sampleArray));
		int[] arr11 = { 432, 8, 530, 90, 88, 23, 231, 11, 45, 677, 199 };
		System.out.println(Arrays.toString(s.radixSort(arr11, 9)));
	}

}
