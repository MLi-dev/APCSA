package quickref;

import java.util.ArrayList;

public class QuickReference {

	public static void triggerArrayList() {
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		int randomSize = (int) (Math.random() * 10 + 1);
		for (int n = 0; n < randomSize; n++) {
			numbers.add((int) (Math.random() * 100));
		}
		System.out.println("'numbers' Array has a size of " + numbers.size());
		System.out.println("'numbers' Array contains contents " + numbers.toString());
		for (int r = 0; r < numbers.size(); r++) {
			numbers.set(r, 0 - numbers.get(r));
		}
		System.out.println("Second iteration of numbers Array contains contents" + numbers.toString());
		numbers.add(numbers.size(), 1000);
		System.out.println("After adding another number at end " + numbers.toString());
		numbers.remove(0);
		System.out.println("After removing first element " + numbers.toString());

	}

	public static void triggerString(String str) {
		System.out.println("Initial string length is  " + str.length());
		int positionOfFirstSpace = str.indexOf(" ");
		System.out.println("First space is at index " + positionOfFirstSpace);
		String firstWord = str.substring(0, positionOfFirstSpace);
		System.out.println("First word is " + firstWord);
		String restOfSentence = str.substring(positionOfFirstSpace + 1);
		System.out.println("Rest of sentence looks like " + restOfSentence);
		String schoolString = new String("I go to Palo Alto High School");
		System.out.println("Is nameString same as str? " + str.equals(schoolString));
		String nameString = new String("Hello World My name is Matthew Li");
		System.out.println("Is nameString same as str? " + str.equals(nameString));
		System.out.println("Is nameString same as str? " + str.compareTo(nameString));
		String nameStringG = new String("Gello World My name is Matthew Li");
		System.out.println("Is nameString same as str? " + str.compareTo(nameStringG));
		String nameStringI = new String("Iello World My name is Matthew Li");
		System.out.println("Is nameString same as str? " + str.compareTo(nameStringI));
	}

	public static void triggerInteger() {
		Integer integerValue = new Integer(5);
		System.out.println("Minimum integer is " + Integer.MIN_VALUE);
		System.out.println("Maximum integer is " + Integer.MAX_VALUE);
		for (int i = 0; i < integerValue.intValue(); i++) {
			System.out.println("convert the integerValue to intValue so I can loop");
		}
		int negativeNumber = 0 - integerValue;
		System.out.println("Value of negativeNumber is " + negativeNumber);
		System.out.println("Absolute value of negativeNumber is " + Math.abs(negativeNumber));

	}

	public static void triggerDouble() {
		Double d = new Double(5.5);
		System.out.println(d);
		double newDoubleValue = -9.0;
		double doubleSum = d + newDoubleValue;
		System.out.println("When add a Double d to double newDoubleValue, Double unbox automatically " + doubleSum);
		System.out.println("Absolute value of newDoubleValue is " + Math.abs(newDoubleValue));
		System.out.println("Square root of newDoubleValue is " + Math.sqrt(Math.abs(newDoubleValue)));
		System.out.println("newDoubleValue to the fourth power is " + Math.pow(newDoubleValue, 4));

	}

	public static void main(String[] args) {
		QuickReference q = new QuickReference();
		System.out.println("**********Testing ArrayList**********");
		q.triggerArrayList();
		System.out.println("**********Testing String**********");
		q.triggerString("Hello World My name is Matthew Li");
		System.out.println("**********Testing Integer**********");
		q.triggerInteger();
		System.out.println("**********Testing Double**********");
		q.triggerDouble();

	}

}
