package partition;

public class PivotCop {
	public static void main(String[] args) {
		int[] suspects = { 31, 61, 24, 67, 41, 87, 91 };
		int breathalyzer = 50;
		int freeCard = 0;
		for (int copPosition = 0; copPosition < suspects.length; copPosition++) {
			if (suspects[copPosition] < breathalyzer) {
				if (copPosition != freeCard) {
					int temp = suspects[copPosition];
					suspects[copPosition] = suspects[freeCard];
					suspects[freeCard] = temp;
				}
				freeCard++;

			}

		}
		for (int suspect : suspects) {
			System.out.print(suspect + " ");
		}

	}
//	

}
