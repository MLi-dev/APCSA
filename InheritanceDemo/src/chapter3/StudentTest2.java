package chapter3;

import java.util.Scanner;

public class StudentTest2 {
	public static void main(String[] args) {
		Student s = null;
		Student u = new UnderGrad("Tim B", new int[] { 90, 90, 100 }, "none");
		Student g = new GradStudent("Kevin Cristella", new int[] { 100, 90, 90 }, "none", 1234);
		System.out.println("Enter student status:");
		System.out.println("Grad(G), Undergrad(U), Neither (N)");

		Scanner reader = new Scanner(System.in);
		String str = reader.nextLine();
		reader.close();
		if (str.equals("G"))
			s = g;
		else if (str.equals("U"))
			s = u;
		else
			s = new Student();
		s.computeGrade();
		System.out.println(s.getGrade());

	}

}
