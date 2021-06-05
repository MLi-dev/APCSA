package oralexampractice;

public class Practice2 {
	public static String swap(String source, int a, int b) {
		char[] schar = source.toCharArray();
		char temp = schar[a];
		schar[a] = schar[b];
		schar[b] = temp;

		return new String(schar);

	}

	public static void main(String[] args) {
		String source = "HelloWorld";
		System.out.println(swap(source, 3, 7));
		String greeting = "HelloWorld";
		System.out.println(swap(greeting, 0, 8));

	}
}