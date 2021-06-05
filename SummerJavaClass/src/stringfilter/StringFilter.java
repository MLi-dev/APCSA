package stringfilter;

public class StringFilter {
	public static String filter(String s, String c) {
		String returnString = "";
		String[] stringArray = s.split("");

		for (String character : stringArray) {
			// System.out.println(character);
			if (character.compareTo(c) < 0) {
				returnString = String.join("", returnString, character);
			}
		}
		return returnString;

	}

	public static void main(String[] args) {
		System.out.println(filter("Hello world", "o").equals("Hell ld"));
		System.out.println(filter("", "o").equals(""));
		System.out.println(filter("pqrstuvwxyz", "o").equals(""));
		System.out.println(filter("abcdefghi", "o").equals("abcdefghi"));
		System.out.println(filter("abcdpqrs", "o").equals("abcd"));
		System.out.println(filter("Hello world", " ").equals(""));
		System.out.println(filter("|~x5<>", "o").equals("5<>"));
		System.out.println(filter("Hello world", "").equals(""));
		System.out.println(filter("Hello world", "5").equals(" "));
		System.out.println(filter("Helloworld", "5").equals(""));

	}
}
