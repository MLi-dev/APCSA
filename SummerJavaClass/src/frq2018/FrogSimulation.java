package frq2018;

public class FrogSimulation {
	private int goalDistance;
	private int maxHops;
	private int hopNumber;
	private int[] hopDistances = { 5, 7, -2, 8, 6 };

	public FrogSimulation(int dist, int hops) {
		goalDistance = dist;
		maxHops = hops;
	}

	private int hopDistance() {
		hopNumber++;
		return hopDistances[hopNumber - 1];
	}

	public boolean simulate() {
		int frogPosition = 0;
		for (int i = 0; i < maxHops; i++) {
			frogPosition += hopDistance();
			if (frogPosition >= goalDistance) {
				return true;
			} else if (frogPosition < 0) {
				return false;
			}
		}
		return false;

	}

	public double runSimulations(int num) {
		int success = 0;
		for (int i = 0; i < num; i++) {
			if (simulate()) {
				success++;
			}
		}
		return success / num;
	}

	public static void main(String[] args) {
		FrogSimulation f = new FrogSimulation(24, 5);
		System.out.println(f.simulate());
	}

}
