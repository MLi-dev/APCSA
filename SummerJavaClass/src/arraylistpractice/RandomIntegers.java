package arraylistpractice;

import java.util.ArrayList;

public class RandomIntegers {
	ArrayList<Integer> list = new ArrayList<Integer>();

	public static void main(String[] args) {
		RandomIntegers e = new RandomIntegers();
		int length = 10;
		for (int i = 0; i < length; i++) {
			int newNum = (int) (Math.random() * 101);
			e.list.add(newNum);
		}
		System.out.println(e.list);
	}
	
}
