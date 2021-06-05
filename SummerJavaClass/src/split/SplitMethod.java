package split;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SplitMethod {
	public static String[] split(String s, char symbol) {
		List<String> splitArray = new ArrayList<String>();
		List<Integer> commaIndexArray = new ArrayList<Integer>();
		char[] strArr = s.toCharArray();
		for (int i = 0; i < strArr.length; i++) {
			if (strArr[i] == symbol) {
				commaIndexArray.add(i);
			}
		}
		System.out.println(commaIndexArray.toString());
		int beginIndex = 0;
		for(int index : commaIndexArray) {
			splitArray.add(s.substring(beginIndex, index));
			beginIndex = index+1;
		}
		splitArray.add(s.substring(beginIndex, s.length()));
		return splitArray.toArray(new String[splitArray.size()]);
	}
	public static void main(String[] args) {
		String s="Hel,lo Wo,rld";
		String[] splitArray = split(s, ',');
		System.out.println(Arrays.toString(splitArray));
		
	}
}
