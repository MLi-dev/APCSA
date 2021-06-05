package oralexampractice;

public class ArrayAndString {

	public static int stringCompare(String[] arr, String comp) {
		int count = 0;
		for (String s : arr) {
			if (s.length() > comp.length())
			count++;
		}
		return count;
	}

	public static void main(String[] args) {
		String[] arr1 = { "abcde", "egdss", "abcdesx" };
		System.out.println(stringCompare(arr1, "hello"));
		String[] arr2 = {"hi", "my", "name"};
		System.out.println(stringCompare(arr2, "world"));
		String[] arr3 = {"hi", "my", "name"};
		System.out.println(stringCompare(arr3, ""));
	}

}
