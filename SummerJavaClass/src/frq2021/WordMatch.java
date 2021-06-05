package frq2021;

public class WordMatch {
	private String secret;

	public WordMatch(String word) {
		secret = word;

	}

	public int scoreGuess(String guess) {
		int count = 0;
		int guessOC = 0;
		if (!secret.contains(guess)) {
			return 0;
		}
		for (int i = 0; i < secret.length(); i++) {
			if (i < secret.length() - guess.length() + 1 && guess.equals(secret.substring(i, i + guess.length()))) {
				guessOC++;
			}
		}
		count = guessOC * guess.length() * guess.length();
		return count;

	}

	public String findBetterGuess(String g1, String g2) {
		if (scoreGuess(g1) > scoreGuess(g2)) {
			return g1;
		} else if (scoreGuess(g1) < scoreGuess(g2)) {
			return g2;
		} else if (g1.compareTo(g2) > 0) {
			return g1;
		} else {
			return g2;
		}

	}

	public static void main(String[] args) {
		WordMatch game = new WordMatch("mississippi");
		System.out.println(game.scoreGuess("i"));
		System.out.println(game.scoreGuess("iss"));
		System.out.println(game.scoreGuess("issipp"));
		System.out.println(game.scoreGuess("mississippi"));

		WordMatch game2 = new WordMatch("aaaabb");
		System.out.println(game2.scoreGuess("a"));
		System.out.println(game2.scoreGuess("aa"));
		System.out.println(game2.scoreGuess("aaa"));
		System.out.println(game2.scoreGuess("aabb"));
		System.out.println(game2.scoreGuess("c"));
		System.out.println(game2.scoreGuess("b"));

		WordMatch game3 = new WordMatch("concatenation");
		// I expect to return nation.
		System.out.println(game3.findBetterGuess("ten", "nation"));
		// I expect to return con.
		System.out.println(game3.findBetterGuess("con", "cat"));

	}

}
