package frq2019;

import java.util.ArrayList;

public class Delimiters {
	private String openDel;
	private String closeDel;

	public Delimiters(String open, String close) {
		openDel = open;
		closeDel = close;
	}

	public ArrayList<String> getDelimitersList(String[] tokens) {
		ArrayList<String> delimiter = new ArrayList<String>();
		for (int i = 0; i < tokens.length; i++) {
			if (tokens[i].equals(openDel) || tokens[i].equals(closeDel)) {
				delimiter.add(tokens[i]);
			}
		}
		return delimiter;
	}

	public boolean isBalanced(ArrayList<String> delimiter) {
		int openCount = 0;
		int closeCount = 0;
		for (int i = 0; i < delimiter.size(); i++) {
			if (delimiter.get(i).equals(openDel)) {
				openCount++;
			}
			if (delimiter.get(i).equals(closeDel)) {
				closeCount++;
			}
		}
		if (openCount == closeCount) {
			return true;
		}
		return false;

	}

	public static void main(String[] args) {

		// Tests for when the opening delimiter is ( and closing delimiter is ).

		Delimiters d = new Delimiters("(", ")");

		// Default test case. Would expect isBalanced to be true.
		String[] token1 = { "(", "x+y", ")", "*5" };
		System.out.println(d.getDelimitersList(token1).toString());
		System.out.println(d.isBalanced(d.getDelimitersList(token1)));

		// Tests for when there is more than one opening and closing delimeter (same #
		// of each). I will expect isBalanced to return true, same number of closing and
		// opening delimiters.
		String[] multiToken = { "(", "(", "x+y", "*5", ")", ")" };
		System.out.println(d.getDelimitersList(multiToken).toString());
		System.out.println(d.isBalanced(d.getDelimitersList(multiToken)));

		// Tests when there is uneven number of opening and closing delimiters. I also
		// expect isBalanced to return false.
		String[] oddToken = { "(", "x+y", "*5", ")", ")" };
		System.out.println(d.getDelimitersList(oddToken).toString());
		System.out.println(d.isBalanced(d.getDelimitersList(oddToken)));

	}

}
