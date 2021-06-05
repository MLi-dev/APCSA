package chapter3;

public class Student {
	public final static int NUM_TESTS = 3;
	private String name;
	private int[] tests;
	private String grade;

	public Student() {
		name = "";
		tests = new int[NUM_TESTS];
		grade = "";
	}

	public Student(String studName, int[] studTests, String studGrade) {
		name = studName;
		tests = studTests;
		grade = studGrade;
	}

	public String getName() {
		return name;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public void computeGrade() {
		if (name.equals(""))
			grade = "No Grade";
		else if (getTestAverage() >= 65)
			grade = "Pass";
		else
			grade = "Fail";
	}

	public void computeGrade(String studGrade) {
		if (name.equals("A"))
			grade = "Passing";
		else
			grade = "Failing";
	}

	public double getTestAverage() {
		double total = 0;
		for (int score : tests)
			total += score;
		return total / NUM_TESTS;

	}

}
