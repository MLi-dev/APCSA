package doubletoboolean;

public class DoubleBoolean {

	public boolean[] doubleToBoolean(double[] list, double value) {
		boolean[] compareResult = new boolean[list.length];
		for (int i = 0; i < list.length; i++) {
			compareResult[i] = list[i] > value;

		}
		return compareResult;

	}

	public static void main(String[] args) {
		double[] list = { 1.0, 5.0, 9.0, 6.0, 10.0 };
		double value = 7.0;

		DoubleBoolean x = new DoubleBoolean();
		boolean[] compareResult = x.doubleToBoolean(list, value);

		for (boolean i : compareResult) {
			System.out.print(i + " ");
		}
	}

}
