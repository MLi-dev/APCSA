package controlflows;


import java.util.Scanner;

public class QuestionGame {
	public static void main(String[] Args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to the question game!");
		System.out.println("In here, you will be tasked with answering three quesions of various videogames!");
		
		System.out.println("First question: True or False; If in minecraft, you make a cake, do you lose the milk buckets after crafting? A. True B. False:");
		
		String userGrade = input.nextLine().toUpperCase();

		switch (userGrade) {
		case "A+":
		case "A":
			System.out.println("Incorrect");
			break;
		case "B":
			System.out.println("Correct");
			break;
		default:
			System.out.println("? Invalid Answer");
		
		}
	}

}
