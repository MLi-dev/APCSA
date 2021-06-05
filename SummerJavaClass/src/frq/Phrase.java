package frq;

public class Phrase {
	private static String currentPhrase;

	public Phrase(String p) {
		currentPhrase = p;
	}

	public int findNthOccurrence(String str, int n) {
		int index = currentPhrase.indexOf(str);
		if (index == -1) {
			return -1;
		}
		for (int i = 1; i < n; i++) {
			index = currentPhrase.indexOf(str, index + 1);
			if (index == -1) {
				return -1;
			}
		}
		return index;
	}

	public void replaceNthOccurence(String str, int n, String repl) {
		int spot = findNthOccurrence(str, n);
		if (spot != -1) {
			currentPhrase = currentPhrase.substring(0, spot) + repl + currentPhrase.substring(spot + str.length());

		}

	}

	public int findLastOccurrence(String str) {
		int n = 1;
		while (findNthOccurrence(str, n + 1) != -1) {
			n++;
		}
		return findNthOccurrence(str, n);
	}

	public String toString() {
		return currentPhrase;
	}

	public static void main(String[] args) {
		Phrase p1 = new Phrase("A cat ate late");
		p1.replaceNthOccurence("at", 1, "rane");
		System.out.println(currentPhrase);
	}

}
