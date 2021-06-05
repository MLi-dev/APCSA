package priorityqueue;

import java.util.ArrayList;

public class PriorityQueue {
	static ArrayList<String> names = null;
	static ArrayList<Double> numbers = null;

	public PriorityQueue() {
		PriorityQueue.names = new ArrayList<String>();
		PriorityQueue.numbers = new ArrayList<Double>();
	}

	public void insert(String s, double d) {
		names.add(s);
		numbers.add(d);

	}

	public double getMax() {
		double max = numbers.get(0);
		for (int i = 0; i < numbers.size(); i++) {
			if (numbers.get(i) > max) {
				max = numbers.get(i);
			}
		}
		return max;
	}

	public String keyOfMax() {
		int maxIndex = numbers.indexOf(getMax());
		return names.get(maxIndex);
	}

	public void removeMax() {
		int maxIndex = numbers.indexOf(getMax());
		numbers.remove(maxIndex);
		names.remove(maxIndex);

	}

	/*
	 * This method is for unit test.
	 */
	public ArrayList<String> getNames() {
		return names;
	}

	/*
	 * This method is for unit test.
	 */
	public ArrayList<Double> getNumbers() {
		return numbers;
	}

	public String getNewInsertedName() {
		return names.size() > 0 ? names.get(names.size() - 1) : "";
	}

	public Double getNewInsertedNumber() {
		return numbers.size() > 0 ? numbers.get(numbers.size() - 1) : null;
	}

	public static void main(String[] args) {
		boolean allPass = true;
		PriorityQueue p = new PriorityQueue();
		if (p.getNames().size() != 0) {
			System.out.println("fail: expecting empty initial name list");
			allPass = false;
		}
		if (p.getNumbers().size() != 0) {
			System.out.println("fail: expecting empty initial number list");
			allPass = false;
		}
		String inputStr1 = "Matthew";
		double inputDouble1 = -100.2;
		p.insert(inputStr1, inputDouble1);
		// Test the insert method
		if (!inputStr1.equals(p.getNewInsertedName())) {
			System.out.println(
					"fail: expecting newly inserted name is " + inputStr1 + " but got: " + p.getNewInsertedName());
			allPass = false;
		}
		if (inputDouble1 != p.getNewInsertedNumber()) {
			System.out.println(
					"fail: expecting newly inserted number is" + inputStr1 + " but got:" + p.getNewInsertedNumber());
			allPass = false;
		}
		// Test the getMax and keyOfMax methods
		p = new PriorityQueue();
		p.insert("Matthew", -100.2);
		p.insert("John", 34.0);
		p.insert("Joseph", 69.7);
		p.insert("Harry", 234.9);
		System.out.println(p.getNames().toString());
		System.out.println(p.getNumbers().toString());
		String expectedMaxName = "Harry";
		double expectedMaxNumber = 234.9;
		if (p.keyOfMax() != expectedMaxName) {
			System.out.println("fail: expecting max name is " + expectedMaxName + " but got " + p.keyOfMax());
			allPass = false;
		}
		if (p.getMax() != expectedMaxNumber) {
			System.out.println("fail: expecting max number is " + expectedMaxNumber + " but got " + p.getMax());
			allPass = false;
		}
		// Test the removeMax method
		int beforeSize = p.getNames().size();
		if (p.getNames().indexOf(expectedMaxName) != -1) {
			p.removeMax();
		}
		if (p.getNames().size() != beforeSize - 1) {
			System.out.println("fail: expecting the names array size reduced 1, but it is not");
			allPass = false;
		}
		if (p.getNames().indexOf(expectedMaxName) != -1) {
			System.out.println("fail: expecting the maxName be removed, but still find the name " + expectedMaxName);
			allPass = false;
		}
		System.out.println("Modified name array is " + p.getNames().toString());
		System.out.println("Modified number array is " + p.getNumbers().toString());

		if (allPass) {
			System.out.println("All test passed, good job!");
		}

	}

}
