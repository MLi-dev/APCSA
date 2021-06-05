package unit6progcheck;

import java.util.ArrayList;
import java.util.Arrays;

public class StringIng {

	public static ArrayList<String> containsIng(String[] array) {
		ArrayList<String> charAl = new ArrayList<String>();
		for (int i = 0; i < array.length; i++) {
			if (array[i].length() >= 3 && array[i].lastIndexOf("ing") == array[i].length() - 3) {
				charAl.add(array[i]);
			}
		}
		return charAl;

	}

	public static void main(String[] args) {
		// Contains -ing at the end. I am expecting to see fading, trailing and battling
		// printed out.
		String[] charArray = { "ten", "fading", "post", "card", "thunder", "hinge", "trailing", "battling" };
		System.out.println(containsIng(charArray).toString());

		// Doesn't contain -ing
		String[] charArray2 = { "Matthew", "Li", "I", "am", "seventeen" };
		System.out.println(containsIng(charArray2).toString());
		
		//Contains all -ing
		String[] charArray3 = {"Billing", "Jumping", "Holding", "Building"};
		System.out.println(containsIng(charArray3).toString());

	}

}
