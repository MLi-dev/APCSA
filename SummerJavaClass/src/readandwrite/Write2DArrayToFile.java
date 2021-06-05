package readandwrite;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class Write2DArrayToFile {
	public static void writeToFile(double[][] board, String fileName) throws IOException {
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
