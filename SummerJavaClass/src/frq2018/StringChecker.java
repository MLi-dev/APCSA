package frq2018;

public interface StringChecker {
	public int minLength = 0;
	public int maxLength = 0;
	public static String notIn = "";

	public default boolean isValid(String str) {
		return str.length() >= minLength && str.length() <= maxLength && str.indexOf(notIn) == -1;
	}

}
