package readandwrite;

import java.util.Arrays;
import java.util.Scanner;

import javax.print.DocFlavor.URL;

import java.io.*;

public class Reading2DArrayFromFile {
	public static double[][] matrix(String fileName) throws FileNotFoundException {
		

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

}
