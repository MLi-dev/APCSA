package controlflows;

public class WhileStatement {
	public static void main(String[] arg) {
		int counter = 5;
		while (counter > 0) {

			System.out.println("Counter = " + counter);
			counter = counter - 1;
		}
	}
}
