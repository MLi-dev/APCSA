package objectorientedprogramming;


public class GpaCalculator {
	private double englishScore;
	private double mathScore;
	private double physicsScore;
	private double historyScore;
	private double csScore;
	private double highSchoolGpa;

	public GpaCalculator(double gpa) {
		highSchoolGpa = gpa;
	}

	public double getEnglishScore() {
		return englishScore;
	}

	public void setEnglishScore(double englishScore) {
		this.englishScore = englishScore;
	}

	public double getMathScore() {
		return mathScore;
	}

	public void setMathScore(double mathScore) {
		this.mathScore = mathScore;
	}

	public double getPhysicsScore() {
		return physicsScore;
	}

	public void setPhysicsScore(double physicsScore) {
		this.physicsScore = physicsScore;
	}

	public double getHistoryScore() {
		return historyScore;
	}

	public void setHistoryScore(double historyScore) {
		this.historyScore = historyScore;
	}

	public double getCsScore() {
		return csScore;
	}

	public void setCsScore(double csScore) {
		this.csScore = csScore;
	}

	public double getHighSchoolGpa() {
		return highSchoolGpa;
	}

	public void setHighSchoolGpa(double highSchoolGpa) {
		this.highSchoolGpa = highSchoolGpa;
	}

	public int scoreToGpa(double score) {

		int tempScore = new Long(Math.round(score / 10)).intValue();

		switch (tempScore) {
		case 9:
			return 4;

		case 8:
			return 3;

		case 7:
			return 2;

		case 6:
			return 1;

		default:
			return 0;

		}

	}

	public double calculateFinalGpa() {
		return (scoreToGpa(englishScore) + scoreToGpa(mathScore) + scoreToGpa(historyScore) + scoreToGpa(csScore)
				+ scoreToGpa(physicsScore)) / 5;

	}

	public static void main(String[] args) {

		GpaCalculator gc = new GpaCalculator(10.0);
		gc.setEnglishScore(92.0);
		gc.setCsScore(95.0);
		gc.setMathScore(87.0);
		gc.setHistoryScore(52);
		gc.setPhysicsScore(75);
		System.out.println(gc.calculateFinalGpa());
	}

}
