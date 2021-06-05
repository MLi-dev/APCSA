package frq;

import java.util.Arrays;

public class Position {
	private int row, col;

	public Position(int x, int y) {
		row = x;
		col = y;
	}

	// Part a
	public static Position findPosition(int num, int[][] intArr) {
		for (int row = 0; row < intArr.length; row++) {
			for (int col = 0; col < intArr[0].length; col++) {
				if (intArr[row][col] == num) {
					return new Position(row, col);
				}

			}

		}
		return null;
	}

	public static Position[][] getSuccessor(int[][] intArr) {
		Position[][] succArray = new Position[intArr.length][intArr[0].length];
		for (int row = 0; row < intArr.length; row++) {
			for (int col = 0; col < intArr[0].length; col++) {
				Position position = findPosition(intArr[row][col] + 1, intArr);
				succArray[row][col] = position;
			}
		}
		return succArray;
	}

	public String toString() {
		return "(" + row + " , " + col + ")";
	}

	public static void main(String[] args) {
		int[][] testArray = { { 15, 5, 9, 10 }, { 12, 16, 11, 6 }, { 14, 8, 13, 7 } };
		System.out.println(findPosition(5, testArray));
		System.out.println(Arrays.deepToString(getSuccessor(testArray)));

	}

}
