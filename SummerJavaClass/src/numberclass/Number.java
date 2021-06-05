package numberclass;

public class Number {
	protected double fieldVal;

	public Number() {
		fieldVal = 0;
	}

	public Number(double val) {
		fieldVal = val;
	}

	public String toString() {
		String retval = "";
		retval += fieldVal;
		return retval;
	}

	public Number pow(double k) {
		return new Number(Math.pow(fieldVal, k));

	}

	public Number pow(Number k) {
		return new Number(Math.pow(this.fieldVal, k.fieldVal));
	}

	public Number add(double k) {
		return new Number(fieldVal + k);
	}

	public Number add(Number k) {
		return new Number(k.fieldVal + this.fieldVal);
	}

	public Number mult(double x) {
		return new Number(fieldVal * x);
	}

	public Number mult(Number x) {
		return new Number(x.fieldVal * this.fieldVal);
	}

	public Number negate() {
		return new Number(fieldVal * -1);
	}

	public double negateDouble() {
		return fieldVal * -1;
	}

	public Number reciprocal() {
		return new Number(1 / fieldVal);

	}

	public boolean equals(double x) {
		return x == fieldVal;
	}

}
