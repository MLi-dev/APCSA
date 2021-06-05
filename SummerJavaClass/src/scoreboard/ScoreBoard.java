package scoreboard;

public class ScoreBoard {
	public static void main(String[] args) {
		int[] playerScore = { 50, 20, 60, 100, 60, 90, 80, 10 };
		boolean[] localHigh = new boolean[playerScore.length - 2];

		for (int i = 1; i < playerScore.length-1; i++) {
			if (playerScore[i - 1] < playerScore[i] && playerScore[i] > playerScore[i + 1]) {
				localHigh[i - 1] = true;
			}
		}
		for(boolean l:localHigh) {
			System.out.println(l + " ");
		}
	}

}
