package frq2018;

import java.util.ArrayList;

public class WordPairList {
	static ArrayList<WordPair> allPairs = new ArrayList<WordPair>();

	public WordPairList(String[] words) {
		allPairs = new ArrayList<WordPair>();
		for (int i = 0; i < words.length; i++) {
			for (int j = i + 1; j < words.length; j++) {
				WordPair w = new WordPair(words[i], words[j]);
				allPairs.add(w);

			}
		}
	}

	public int numMatches() {
		int matches = 0;
		for (WordPair wp : allPairs) {
			if (wp.getFirst().equals(wp.getSecond())) {
				matches++;
			}
		}
		return matches;
	}

	public String toString() {
		return allPairs.toString();
	}

	public static void main(String[] args) {
		//None matching
		String[] wordNums = { "one", "two", "three" };
		WordPairList ex1 = new WordPairList(wordNums);
		System.out.println(ex1.toString());
		System.out.println(ex1.numMatches());
		//Counts when matching
		String[] wordNums2 = { "one", "two", "three", "one" };
		WordPairList ex2 = new WordPairList(wordNums2);
		System.out.println(ex2.toString());
		System.out.println(ex2.numMatches());

	}

}
