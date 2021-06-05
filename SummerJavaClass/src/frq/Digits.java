package frq;

import java.util.ArrayList;

public class Digits {
	static ArrayList<Integer> digitList = new ArrayList<Integer>();

	public Digits(int num) {
		digitList = new ArrayList<Integer>();
		digitList.add(0, num % 10);
		int numRemaining = num / 10;
		while (numRemaining > 0) {
			digitList.add(0, numRemaining % 10);
			numRemaining /= 10;
		}
	}

	public static int lastDigit(int num) {
		return num % 10;
	}

	public static boolean isStrictlyIncreasing() {
		for (int i = 0; i < digitList.size() - 1; i++) {
			if (digitList.get(i) >= digitList.get(i + 1)) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		int num = 123456;
		Digits d = new Digits(num);
		System.out.println(lastDigit(num));
		System.out.println(digitList.toString());
		System.out.println(isStrictlyIncreasing());
		int num2 = 371980;
		Digits n = new Digits(num2);
		System.out.println(lastDigit(num2));
		System.out.println(digitList.toString());
		System.out.println(isStrictlyIncreasing());

	}

}
