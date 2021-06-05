package frq2019;

import java.util.Arrays;

public class LightBoard {
	private boolean[][] lights;

	public LightBoard(int numRows, int numColumns) {
		lights = new boolean[numRows][numColumns];
		for (int r = 0; r < numRows; r++) {
			for (int c = 0; c < numColumns; c++) {
				double rnd = Math.random();
				lights[r][c] = rnd < 0.4;
			}
		}
	}

	public boolean evaluateLight(int row, int col) {
		int on = 0;
		for (int r = 0; r < lights.length; r++) {
			if (lights[row][col]) {
				on++;
			}
		}

		if (lights[row][col] && on % 2 == 0) {
			return false;
		}
		if (!lights[row][col] && on % 3 == 0) {
			return true;
		}
		return lights[row][col];
	}

	public static void main(String[] args) {
		LightBoard l1 = new LightBoard(6, 4);
		System.out.println(Arrays.deepToString(l1.lights));
		System.out.println(l1.evaluateLight(0, 0));
	}

}
