package readfile;

import java.io.*;

public class MyFile {
public static void main(String[] args) {
	String currentDirectory = System.getProperty("user.dir");
	System.out.println("The current working directory is" + currentDirectory);
	String line;
	BufferedReader reader = null;
	try {
		reader = new BufferedReader(new FileReader("./myFile.txt"));
		line = reader.readLine();
		while (line != null) {
			System.out.println(line);
			line = reader.readLine();
		}
	} catch (IOException e) {
		System.out.println(e.getMessage());
	} finally {
		try {
			if (reader != null)
				reader.close();

		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
}
}