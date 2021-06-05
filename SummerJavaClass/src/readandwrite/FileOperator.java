package readandwrite;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class FileOperator {
	private String fileName;

	public FileOperator(String fileName) {
		this.fileName = fileName;
	}

	public double[][] matrix() throws FileNotFoundException {

		Scanner input = new Scanner(new File(fileName));

		int rows = 0;
		int columns = 0;

		while (input.hasNextLine()) {
			++rows;
			columns = 0; // Otherwise the columns will be a product of rows*columns
			Scanner colReader = new Scanner(input.nextLine());
			while (colReader.hasNextDouble()) {
				// You must "read" the doubles to move on in the scanner.
				colReader.nextDouble();
				++columns;
			}
			// Close the resource you opened!
			colReader.close();
		}
		double[][] myArray = new double[rows][columns];
		input.close();

		input = new Scanner(new File(fileName));
		for (int i = 0; i < rows; ++i) {
			for (int j = 0; j < columns; ++j) {
				if (input.hasNextDouble()) {
					myArray[i][j] = input.nextDouble();
				}
			}
		}
		return myArray;

	}

	public void writeToFile(double[][] board) throws IOException {
		StringBuilder builder = new StringBuilder();
		for (int i = 0; i < board.length; i++)// for each row
		{
			for (int j = 0; j < board.length; j++)// for each column
			{
				builder.append(board[i][j] + "");// append to the output string
				if (j < board.length - 1)// if this is not the last row element
					builder.append(" ");// then add comma (if you don't like commas you can use spaces)
			}
			builder.append("\n");// append new line at the end of the row
		}
		BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
		writer.write(builder.toString());// save the string representation of the board
		writer.close();
		System.out.println(Arrays.deepToString(board));

	}

}
