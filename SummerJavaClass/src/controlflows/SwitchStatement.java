package controlflows;

import java.util.Scanner;


public class SwitchStatement {
	public static void main(String[] Args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your Grade please:");
		String userGrade = input.nextLine().toUpperCase();

		switch (userGrade) {
		case "A+":
		case "A":
			System.out.println("Distinction");
			break;
		case "B":
			System.out.println("B grade; good");
			break;

		case "C":
			System.out.println("Needs improvement");
			break;

		case "F":
			System.out.println("Failing Grade");
			break;
		default: 
			System.out.println("Fail");

		}
	}

}
