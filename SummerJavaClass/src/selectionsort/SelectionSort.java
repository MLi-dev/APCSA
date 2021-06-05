package selectionsort;

public class SelectionSort {
	public static void main(String[] args) {
		int[] data = { 10, 1, 5, 3, 6, 9 };
		int leftSorted = 0;
		int maxIndex = 1;
		int max = Integer.MIN_VALUE;
		while (leftSorted < data.length - 1) {

			for (int i = leftSorted; i < data.length; i++) {
				if (max < data[i]) {
					max = data[i];
					maxIndex = i;
				}

			}
			data[maxIndex] = data[leftSorted];
			data[leftSorted] = max;
			leftSorted++;
			max = Integer.MIN_VALUE;
			maxIndex = leftSorted;
		}
		
		for (int x : data) {
			System.out.print(x + " ");
		}
	}
}
