package frq2018;

public class CodeWordChecker implements StringChecker {
	private int minLength;
	private int maxLength;
	private String notIn;

	public CodeWordChecker(int min, int max, String notIn) {
		this.minLength = min;
		this.maxLength = max;
		this.notIn = notIn;

	}

	public CodeWordChecker(String notIn) {
		this.notIn = notIn;
		this.minLength = 6;
		this.maxLength = 20;

	}

	public boolean isValid(String str) {
		if (str.length() >= minLength && str.length() <= maxLength && str.indexOf(notIn) == -1) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		StringChecker sc1 = new CodeWordChecker(5, 8, "$");
		System.out.println(sc1.isValid("happy"));
		System.out.println(sc1.isValid("happy$"));
		System.out.println(sc1.isValid("Code"));
		System.out.println(sc1.isValid("happyCode"));

	}

}
