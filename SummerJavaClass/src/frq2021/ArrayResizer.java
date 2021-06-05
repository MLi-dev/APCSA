package frq2021;

import java.util.Arrays;

public class ArrayResizer {

	public static boolean isNonZeroRow(int[][] array2D, int r) {
		for (int c = 0; c < array2D[r].length; c++) {
			if (array2D[r][c] == 0) {
				return false;
			}
		}
		return true;

	}

	public static int numNonZeroRows(int[][] array2D) {
		int nonZeroCounter = 0;
		for (int r = 0; r < array2D.length; r++) {
			if (isNonZeroRow(array2D, r)) {
				nonZeroCounter++;

			}
		}
		return nonZeroCounter;

	}

	public static int[][] resize(int[][] array2D) {
		if (numNonZeroRows(array2D) == array2D.length) {
			return null;
		}
		int[][] newArray = new int[numNonZeroRows(array2D)][array2D[0].length];
		int row = 0;
		for (int r = 0; r < array2D.length; r++) {
			if (isNonZeroRow(array2D, r)) {
				for (int c = 0; c < array2D[r].length; c++) {
					newArray[row][c] = array2D[r][c];
				}
				row++;
			}
		}
		return newArray;

	}

	public static void main(String[] args) {
		int[][] testArray = { { 2, 1, 0 }, { 1, 3, 2 }, { 0, 0, 0 }, { 4, 5, 6 } };
		System.out.println(isNonZeroRow(testArray, 1));
		System.out.println(numNonZeroRows(testArray));
		System.out.println(Arrays.deepToString(resize(testArray)));
	}

}
