package frq2018;

import java.util.Arrays;

public class ArrayTester {

	public static int[] getColumn(int[][] arr2D, int c) {
		int[] ans = new int[arr2D.length];
		for (int i = 0; i < arr2D.length; i++) {
			ans[i] = arr2D[i][c];
		}
		return ans;
	}

	public static boolean hasAllValues(int[] arr1, int[] arr2) {
		for (int arrIndex = 0; arrIndex < arr1.length; arrIndex++) {
			boolean contains = false;
			for (int arrIndex2 = 0; arrIndex2 < arr2.length; arrIndex2++) {
				if (arr1[arrIndex] == arr2[arrIndex2]) {
					return true;
				}
			}
			if (!contains) {
				return false;
			}
		}
		return true;
	}

	public static boolean containsDuplicates(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					return true;
				}
			}
		}
		return false;
	}

	public static boolean isLatin(int[][] square) {
		int[] testArr = square[0];
		if (containsDuplicates(testArr)) {
			return false;
		}
		for (int r = 0; r < square.length; r++) {
			if (hasAllValues(testArr, square[r])) {
				return true;
			}
		}
		for (int c = 0; c < square.length; c++) {
			if (hasAllValues(testArr, square[c])) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		int[][] arr = { { 0, 1, 2 }, { 3, 4, 5 }, { 6, 7, 8 }, { 9, 5, 3 } };
		System.out.println(Arrays.toString(getColumn(arr, 1)));
		int[] arr1 = { 0, 1, 2, 3, 4, 5 };
		int[] arr2 = { 1, 2, 3, 4, 5, 6 };
		int[] arr3 = { 5, 1, 2, 3, 4, 5 };
		System.out.println(hasAllValues(arr1, arr2));
		System.out.println(containsDuplicates(arr3));
		int[][] latinArray = { { 1, 2, 3 }, { 2, 3, 1 }, { 3, 1, 2 } };
		System.out.println(isLatin(latinArray));

	}

}
