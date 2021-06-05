package oralexampractice;

public class PartitioningPractice {
	public static void main(String[] args) {
		int[] array = { 31, 41, 59, 26, 53, 58, 97, 98 };
		int pivot = 50;
		int position = 0;
		int allLeftLess = 0;
		while (position < array.length) {
			if (array[position] < pivot) {
				int temp = array[position];
				array[position] = array[allLeftLess];
				array[allLeftLess] = temp;
				position++;
				allLeftLess++;
			} else {
				position++;
			}
		}

		for (int i : array) {
			System.out.print(i + " ");
		}
	}
}
