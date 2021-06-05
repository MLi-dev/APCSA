package unit6progcheck;

import java.util.Arrays;

public class Payroll

{

	private int[] itemsSold = { 48, 50, 37, 62, 38, 70, 55, 37, 64, 60 };

	private double[] wages; // wages to be computed in part (b)

	public double computeBonusThreshold() {
		int max = itemsSold[0];
		int min = itemsSold[0];
		int sum = 0;
		for (int i = 0; i < itemsSold.length; i++) {
			if (itemsSold[i] > max) {
				max = itemsSold[i];
			}
			if (itemsSold[i] < min) {
				min = itemsSold[i];
			}
			sum += itemsSold[i];
		}
		return (double) (sum - max - min) / (itemsSold.length - 2);
	}

	public void computeWages(double fixedWage, double perItemWage) {
		wages = new double[itemsSold.length];
		for (int i = 0; i < itemsSold.length; i++) {
			if (itemsSold[i] > computeBonusThreshold()) {
				wages[i] = (fixedWage + perItemWage * itemsSold[i]) * 1.1;
			} else {
				wages[i] = fixedWage + perItemWage * itemsSold[i];
			}
		}
	}

	public double[] getWages() {
		return wages;
	}

	// Other instance variables, constructors, and methods not shown.
	public static void main(String[] args) {
		Payroll p = new Payroll();
		System.out.println(p.computeBonusThreshold());
		p.computeWages(10.0, 1.5);
		System.out.println(Arrays.toString(p.getWages()));
	}

}