package frq2019;

public class StepTracker {
	private int minSteps;
	private int numActiveDays;
	private int numDays;
	private int totalSteps;

	public StepTracker(int numSteps) {
		minSteps = numSteps;
		numActiveDays = 0;
		numDays = 0;
		totalSteps = 0;
	}

	public void addDailySteps(int steps) {
		if (steps >= minSteps) {
			numActiveDays++;
		}
		numDays++;
		totalSteps += steps;

	}

	public int activeDays() {
		return numActiveDays;
	}

	public double averageSteps() {
		double average = totalSteps / numDays;
		return average;
	}

	public static void main(String[] args) {
		StepTracker s1 = new StepTracker(100);

		// I will expect three active days.
		s1.addDailySteps(30);
		s1.addDailySteps(50);
		s1.addDailySteps(100);
		s1.addDailySteps(150);
		s1.addDailySteps(1000);
		System.out.println(s1.activeDays());

		// Will expect an average of 266 steps a day.
		System.out.println(s1.averageSteps());

		StepTracker s2 = new StepTracker(1000);
		// Will expect no active days.
		s2.addDailySteps(100);
		s2.addDailySteps(100);
		s2.addDailySteps(100);
		s2.addDailySteps(100);
		s2.addDailySteps(100);
		System.out.println(s2.activeDays());

		// Will expect an average of 100 steps.
		System.out.println(s2.averageSteps());

	}

}
