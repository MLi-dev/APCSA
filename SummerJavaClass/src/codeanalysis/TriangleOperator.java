package codeanalysis;

public class TriangleOperator {
	public static void main(String[] args) {
		int[] arr1 = {1, 4, 6, 8};
		int[] arr2 = {5, 9, 7, 1};
		for(int i = 0; i<arr1.length; i++) {
			for(int j = arr2.length-1; j>=arr2.length-i-1; j--) {
				System.out.print(arr2[j]);
			}
			System.out.println();
		}
	}

}
