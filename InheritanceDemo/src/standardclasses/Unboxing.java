package standardclasses;

public class Unboxing {
	public int sum(int num1, int num2) {
		return num1 + num2;
	}

	public static void main(String[] args) {
		Integer intOb1 = 9;
		Integer intOb2 = 8;
		Unboxing u = new Unboxing();
		System.out.println(u.sum(intOb1, intOb2));
	
	}
}
