package oralexampractice;

public class LocalPeakPractice {

	public static boolean[] peakMethod(int[] array, boolean[] localPeak) {
		for (int i = 1; i < array.length - 1; i++) {
			if (array[i] > array[i - 1] && array[i] > array[i + 1]) {
				localPeak[i - 1] = true;
			}

		}
		return localPeak;
	}

	public static void main(String[] args) {
		int[] array = { 9, 10, 100, 40, 30, 80, 70 };
		boolean[] localPeak = new boolean[array.length - 2];
		boolean[] result = peakMethod(array, localPeak);
		for (boolean l : result) {
			System.out.print(l + " ");

		}
		System.out.print('\n');
		int[] array2 = { 100, 50, 90, 1000, 40, 10 };
		boolean[] localPeak2 = new boolean[array2.length - 2];
		result = peakMethod(array2, localPeak2);
		for (boolean l : result) {
			System.out.print(l + " ");

		}

	}

}
