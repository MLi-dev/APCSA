package frq2018;

public class WordPair {
	private String first;
	private String second;

	public WordPair(String s1, String s2) {
		first = s1;
		second = s2;
	}

	public String getFirst() {
		return first;
	}

	public String getSecond() {
		return second;
	}

	public String toString() {
		return "(" + first + " , " + second + ")";
	}

}
