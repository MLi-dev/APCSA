package logicalsentence;

public class Operator {
	private String symbol;

	public Operator() {
		symbol = "";
	}

	public Operator(String s) {
		symbol = s;

	}

	public String toString() {
		String ret;
		switch (symbol) {
		case "~":
			ret = "Negation";
			break;
		case "&":
			ret = "Conjunction";
			break;
		case "|":
			ret = "Disjunction";
			break;
		case "=>":
			ret = "Implication";
			break;
		case "<=>":
			ret = "Biconditional";
			break;
		case "":
			ret = "Simple";
			break;
		default:
			ret = "Unknown symbol";
		}
		return ret;

	}

	public String getSymbol() {
		return symbol;
	}

}
