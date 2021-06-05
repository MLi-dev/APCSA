package sevensegment;

public class SSD {
	static void row1(int ergebnis) {

		switch (ergebnis % 10) {

		case 1:
			System.out.println("");
			break;

		case 2:
			System.out.println("__");
			break;

		case 3:
			System.out.println(" __");
			break;

		case 4:
			System.out.println("");
			break;

		case 5:
			System.out.println(" __");
			break;

		case 6:
			System.out.println(" __");
			break;

		case 7:
			System.out.println("__");
			break;

		case 8:
			System.out.println(" __ ");
			break;

		case 9:
			System.out.println(" __ ");
			break;

		case 0:
			System.out.println(" __ ");
			break;

		}
	}

	static void row2(int ergebnis) {

		switch (ergebnis % 10) {

		case 1:
			System.out.println("|");
			break;

		case 2:
			System.out.println("   |");
			break;

		case 3:
			System.out.println("   |");
			break;

		case 4:
			System.out.println("|  |");
			break;

		case 5:
			System.out.println("|");
			break;

		case 6:
			System.out.println("|");
			break;

		case 7:
			System.out.println("  |");
			break;

		case 8:
			System.out.println("|  |");
			break;

		case 9:
			System.out.println("|  |");
			break;

		case 0:
			System.out.println("|  |");
			break;
		}
	}

	static void row3(int ergebnis) {

		switch (ergebnis % 10) {

		case 1:
			System.out.println("|");
			break;

		case 2:
			System.out.println(" __|");
			break;

		case 3:
			System.out.println(" __|");
			break;

		case 4:
			System.out.println("|__|");
			break;

		case 5:
			System.out.println("|__");
			break;

		case 6:
			System.out.println("|__");
			break;

		case 7:
			System.out.println("  |");
			break;

		case 8:
			System.out.println("|__|");
			break;

		case 9:
			System.out.println("|__|");
			break;

		case 0:
			System.out.println("|  |");
			break;
		}
	}

	static void row4(int ergebnis) {

		switch (ergebnis % 10) {

		case 1:
			System.out.println("|");
			break;

		case 2:
			System.out.println("|");
			break;

		case 3:
			System.out.println("   |");
			break;

		case 4:
			System.out.println("   |");
			break;

		case 5:
			System.out.println("   |");
			break;

		case 6:
			System.out.println("|  |");
			break;

		case 7:
			System.out.println("  |");
			break;

		case 8:
			System.out.println("|  |");
			break;

		case 9:
			System.out.println("   |");
			break;

		case 0:
			System.out.println("|  |");
			break;
		}
	}

	static void row5(int ergebnis) {

		switch (ergebnis % 10) {

		case 1:
			System.out.println("|");
			break;

		case 2:
			System.out.println("|__");
			break;

		case 3:
			System.out.println(" __|");
			break;

		case 4:
			System.out.println("   |");
			break;

		case 5:
			System.out.println(" __|");
			break;

		case 6:
			System.out.println("|__|");
			break;

		case 7:
			System.out.println("  |");
			break;

		case 8:
			System.out.println("|__|");
			break;

		case 9:
			System.out.println(" __|");
			break;

		case 0:
			System.out.println("|__|");
			break;

		}
	}

	public static void main(String[] args) {
		int ergebnis = 6;
		row1(ergebnis);
		row2(ergebnis);
		row3(ergebnis);
		row4(ergebnis);
		row5(ergebnis);
		int zero = 0;
		row1(zero);
		row2(zero);
		row3(zero);
		row4(zero);
		row5(zero);
		int eight = 8;
		row1(eight);
		row2(eight);
		row3(eight);
		row4(eight);
		row5(eight);
	}

}
