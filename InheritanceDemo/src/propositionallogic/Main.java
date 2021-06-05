package propositionallogic;

public class Main {
	public static final String BICONDITIONAL = "<=>";
	public static final String IMPLICATION = "=>";
	public static final String CONJUNCTION = "&";
	public static final String DISJUNCTION = "|";
	public static int totalTests = 0;
	public static int testsPassed = 0;
	public static int totalTestsFailed = 0;

	public static boolean legal(String s) {
		s = s.replaceAll("\\s", "");
		return simple(s) || complex(s);
	}

	public static boolean simple(String s) {
		String alphabet = "abcdefghijklmnopqrstuvwxyz";
		if (!(s.length() == 1)) {
			return false;
		}
		return alphabet.contains(s);
	}

	public static boolean complex(String s) {
		return negation(s) || complexLogical(s, BICONDITIONAL) || complexLogical(s, IMPLICATION)
				|| complexLogical(s, CONJUNCTION) || complexLogical(s, DISJUNCTION);
	}

	public static boolean negation(String s) {
		if ((s.length() < 2) || (s.indexOf("~") != 0)) {
			return false;
		}
		return legal(s.substring(1));
	}

	public static boolean complexLogical(String s, String symbol) {
		int leftIndex = s.indexOf(symbol);
		int rightIndex = leftIndex + symbol.length();
		if ((leftIndex <= 0) || (rightIndex >= s.length())) {
			return false;
		}
		return legal(s.substring(0, leftIndex)) && legal(s.substring(rightIndex));
	}

	public static void test(String cand, boolean answer) {
		if (legal(cand) != answer) {
			totalTests++;
			totalTestsFailed++;
			System.out.println("Failed: " + cand);
		} else {

			totalTests++;
			testsPassed++;
		}

	}

	public static void main(String[] args) {
//		test("a<=>b", true);
//		test("~~~~~a<=>b", true);
//		test("a<=>~~~~~b", false); // Error test case
//		test("a=>~~~~~b", true);
//		test("a|~~~~~b", true);
//		test("a&~~~~~b", true);
//		test("a<=>=>b", false);
//		test("~~~~~a<=>&b", false);
//		test("a<=>~~~~~b|", false);
//		test("a=>~~~~~bb", false);
//		test("a|~~b~~~b", false);
//		test("~a&~~~~~b", true);
		test("~ab", true);
		System.out.println("Total:" + totalTests);
		System.out.println("Passed:" + testsPassed);
		System.out.println("Failed:" + totalTestsFailed);

	}

}
