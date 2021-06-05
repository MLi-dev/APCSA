package controlflows;

import java.util.Scanner;

public class TernaryOperator {
	public static void main(String[] arg) {
		Scanner input = new Scanner(System.in);
		System.out.print("\nPlease enter your age: ");
		int userAge = input.nextInt();
	System.out.print(userAge<21 ? "Sorry, you are underage":"Welcome, you may sign in!");

	

	}
}
 