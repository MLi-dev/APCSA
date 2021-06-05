package oralexampractice;

public class Practice1 {

	public boolean[] doubleToBoolean(double[] list, double value) {
		boolean[] booleanList = new boolean[list.length];
		for (int i = 0; i < list.length; i++) {
			booleanList[i] = list[i] < value;
			i++;
		}
		return booleanList;
	}

	public static void main(String[] args) {
		double[] list = { 10.0, 50.7, 30.5, 90.23 };
		double value = 45.0;
		Practice1 x = new Practice1();
		boolean[] booleanList = x.doubleToBoolean(list, value);
		for (boolean l : booleanList) {
			System.out.println(l + " ");

		}

	}
}
