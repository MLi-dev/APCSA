package propositionalconstant;

public class PropositionalConstant {

	private String p = "Invalid Propsitional constant";
	private boolean isValid = false;
	public PropositionalConstant(String parg) {
		String alphabet = "abcdefghijklmnopqrstuvwxyz";
		if ((parg.length() == 1) && (alphabet.contains(parg))) {
			p = parg;
			isValid = true;
		}
	}
	public boolean isValidPropositionalConstant() {
		return isValid;
	}

	public String toString() {
		return p;
	}

	public static void main(String[] args) {

		PropositionalConstant x = new PropositionalConstant("a");
		System.out.println(x);
	}

}
