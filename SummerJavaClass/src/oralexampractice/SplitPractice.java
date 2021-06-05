package oralexampractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SplitPractice {
	public static String[] split(String s, char symbol) {
		List<String> splitArray = new ArrayList<String>();
		List<Integer> symbolIndexList = new ArrayList<Integer>();
		char[] stArr = s.toCharArray();
		for (int i = 0; i < stArr.length; i++) {
			if (stArr[i] == symbol) {
				symbolIndexList.add(i);
			}
		}
		System.out.println(symbolIndexList.toString());
		int beginIndex = 0;
		for (int index : symbolIndexList) {
			splitArray.add(s.substring(beginIndex, index));
			beginIndex = index + 1;
		}
		splitArray.add(s.substring(beginIndex, s.length()));
		return splitArray.toArray(new String[splitArray.size()]);

	}

	public static void main(String[] args) {
		String s = "Hel,lo Wo,rld";
		String[] splitArray = split(s, ',');
		System.out.println(Arrays.toString(splitArray));
	}

}
