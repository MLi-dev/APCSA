package readandwrite;

import java.util.Arrays;

public class Main {
	public static double calculateSum(double[][] board) {
		double sum = 0;
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board.length; j++) {
				sum += board[i][j];
			}
		}
		return sum;
	}

	public static double[][] generateRandom() {
		double[][] randomArray = new double[4][4];
		for (int i = 0; i < randomArray.length; i++) {
			for (int j = 0; j < randomArray.length; j++) {
				Double min = 0.0; // Set To Your Desired Min Value
				Double max = 10.0; // Set To Your Desired Max Value
				double x = (Math.random() * ((max - min) + 1)) + min;
				randomArray[i][j] = x;
			}
		}
		return randomArray;
	}

	public static void main(String[] args) {

		try {
			FileOperator f = new FileOperator("grid04_dist.txt");
			double[][] board = f.matrix();
			System.out.println(Arrays.deepToString(board));
			System.out.println(calculateSum(board));
			
		    f = new FileOperator("newFile.txt");
			double[][] randomArray = generateRandom();
			f.writeToFile(randomArray);
			double[][] randomBoard = f.matrix();
			System.out.println(calculateSum(randomBoard));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
