package myfile2;

import java.io.*;

public class MyFile2 {
	public static void main(String[] args) {
		String text = "Hello World";
		{
			try (BufferedWriter writer = new BufferedWriter(new FileWriter("myFile2.txt", true))) {
				writer.write(text);
				writer.newLine();
			} catch (IOException e) {
				System.out.println(e.getMessage());
			}

		}
	}
}