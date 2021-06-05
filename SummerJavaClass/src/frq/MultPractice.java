package frq;

public class MultPractice implements StudyPractice {
	private int first, second;

	public MultPractice(int int1, int int2) {
		first = int1;
		second = int2;

	}

	public String getProblem() {
		String problem = first + " * " + second;
		return problem;

	}

	public void nextProblem() {
		second++;
	}

	public static void main(String[] args) {
		MultPractice m = new MultPractice(3, 7);
		System.out.println(m.getProblem());
		m.nextProblem();
		System.out.println(m.getProblem());
		m.nextProblem();
		System.out.println(m.getProblem());
		m.nextProblem();
		System.out.println(m.getProblem());
		m.nextProblem();
		System.out.println(m.getProblem());
	}

}
