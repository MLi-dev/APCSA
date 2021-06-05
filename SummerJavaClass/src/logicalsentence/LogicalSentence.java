package logicalsentence;

public class LogicalSentence {
	private PropositionalConstant simplePropconst;
	private LogicalSentence left;
	private LogicalSentence right;
	private Operator operator;

	public LogicalSentence(PropositionalConstant p) {
		simplePropconst = p;
		operator = new Operator();
	}

	public LogicalSentence(LogicalSentence ls) {
		left = ls;
		operator = new Operator("~");
	}

	public LogicalSentence(LogicalSentence l, LogicalSentence r, String op) {
		left = l;
		right = r;
		operator = new Operator(op);

	}

	public String toString() {
		return operator.toString();

	}

	public Boolean evaluate(TruthAssignment ta) {
		switch (operator.getSymbol()) {
		case "":
			return ta.getValue(simplePropconst.toString());
		case "~":
			return !left.evaluate(ta);
		case "|":
			return left.evaluate(ta) || right.evaluate(ta);
		case "&":
			return left.evaluate(ta) && right.evaluate(ta);
		case "=>":
			return (left.evaluate(ta) && !right.evaluate(ta)) ? false : true;
		case "<=>":
			return (left.evaluate(ta) == right.evaluate(ta)) ? true : false;
		default:
			return false;

		}
	}

	public static void main(String[] args) {
		String[] sa = { "p", "q" };
		boolean[] ba = { true, false };

		TruthAssignment ta = new TruthAssignment(sa, ba);

		PropositionalConstant p = new PropositionalConstant("p");
		LogicalSentence l = new LogicalSentence(p);
		// Tests if propositional constant returns simple.
		if (l.toString().equals("Simple")) {
			System.out.println("Simple to string Test passed");
		} else {
			System.out.println("Simple to string Test failed");
			System.out.println("expected 'Simple'");
			System.out.println("Got " + l.toString());
		}
		// Evaluates propositional constant
		if (l.evaluate(ta) == true) {
			System.out.println("Simple evaluation passed");
		} else {
			System.out.println("Simple evaluation failed");
		}
		LogicalSentence l2 = new LogicalSentence(l);
		// Tests for a negation logical sentence, returns negation.
		if (l2.toString().equals("Negation")) {
			System.out.println("Negation to string Test passed");
		} else {
			System.out.println("Negation to string Test failed");
			System.out.println("expected 'Negation'");
			System.out.println("Got " + l2.toString());
		}
		if (l2.evaluate(ta) == false) {
			System.out.println("Negation evaluation passed");
		} else {
			System.out.println("Negation evaluation failed");
		}

		PropositionalConstant q = new PropositionalConstant("q");
		LogicalSentence l3 = new LogicalSentence(q);
		LogicalSentence conjunction = new LogicalSentence(l, l3, "&");
		if (conjunction.toString().equals("Conjunction")) {
			System.out.println("Conjunction to string Test passed");
		} else {
			System.out.println("Conjunction to string Test failed");
			System.out.println("expected 'Conjunction'");
			System.out.println("Got " + conjunction.toString());
		}
		if (conjunction.evaluate(ta) == false) {
			System.out.println("Conjunction evaluation passed");
		} else {
			System.out.println("Conjunction evaluation failed");
		}

		LogicalSentence disjunction = new LogicalSentence(l, l3, "|");
		if (disjunction.toString().equals("Disjunction")) {
			System.out.println("Disjunction to string Test passed");
		} else {
			System.out.println("Disjunction to string Test failed");
			System.out.println("expected 'Disjunction'");
			System.out.println("Got " + disjunction.toString());
		}
		if (disjunction.evaluate(ta) == true) {
			System.out.println("Disjunction evaluation passed");
		} else {
			System.out.println("Disjunction evaluation failed");
		}

		LogicalSentence implication = new LogicalSentence(l, l3, "=>");
		// Implication
		if (implication.toString().equals("Implication")) {
			System.out.println("Implication to string Test passed");
		} else {
			System.out.println("Implication to string Test failed");
			System.out.println("expected 'Implication'");
			System.out.println("Got " + implication.toString());
		}
		if (implication.evaluate(ta) == false) {
			System.out.println("Implication evaluation passed");
		} else {
			System.out.println("Implication evaluation failed");
		}
		LogicalSentence biconditional = new LogicalSentence(l, l3, "<=>");

		// Biconditional
		if (biconditional.toString().equals("Biconditional")) {
			System.out.println("Biconditional to string Test passed");
		} else {
			System.out.println("Biconditional to string Test failed");
			System.out.println("expected 'Biconditional'");
			System.out.println("Got " + biconditional.toString());
		}
		if (biconditional.evaluate(ta) == false) {
			System.out.println("Biconditional evaluation passed");
		} else {
			System.out.println("Biconditional evaluation failed");
		}

		// Negation cancel out
		LogicalSentence neg = new LogicalSentence(l);
		LogicalSentence neg2 = new LogicalSentence(neg);
		if (neg2.toString().equals("Negation")) {
			System.out.println("Negation to string test passed");
		} else {
			System.out.println("Negation to string test failed");
			System.out.println("expected 'Negation'");
			System.out.println("Got " + neg2.toString());
		}
		if (neg2.evaluate(ta) == true) {
			System.out.println("Negation evaluation passed");
		} else {
			System.out.println("Negationn evaluation failed");
		}

		LogicalSentence leftneg = new LogicalSentence(l);
		LogicalSentence rightneg = new LogicalSentence(l3);
		LogicalSentence conj2 = new LogicalSentence(leftneg, rightneg, "&");
		if (conj2.toString().equals("Conjunction")) {
			System.out.println("Conjunction to string Test passed");
		} else {
			System.out.println("Conjunction to string Test failed");
			System.out.println("expected 'Conjunction'");
			System.out.println("Got " + conj2.toString());
		}
		if (conj2.evaluate(ta) == false) {
			System.out.println("Conjunction evaluation passed");
		} else {
			System.out.println("Conjunction evaluation failed");
		}

	}

}
