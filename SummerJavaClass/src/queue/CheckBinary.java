package queue;

import java.util.Arrays;

public class CheckBinary {
	public static String[] findBin1(int number) {
		String[] result = new String[number];
		for (int i = 1; i <= result.length; i++) {
			result[i - 1] = convertToBin(i);
		}
		return result;
	}

	public static String convertToBin(int index) {
		String toBin = "";
		while (index > 0) {
			if (index % 2 == 1) {
				toBin = "1" + toBin;
			} else {
				toBin = "0" + toBin;
			}
			index = index / 2;
		}
		return toBin;
	}

	public static void main(String[] args) {
		String[] output = findBin1(3);
		System.out.println(Arrays.toString(output));
	}

}
