package numberclass;

public class Polynomial {
	private Number[] coeffs;

	// requires and assumes length of c to be at least 1.
	public Polynomial(Number[] c) {

		coeffs = c.clone();

	}

	public String toString() {
		String retval = "";

		for (int exp = 0; exp < coeffs.length; exp++) {
			retval += coeffs[exp] + "x^" + exp + " + ";
		}

		return retval;
	}

	public Number evaluate(Number x) {
		Number retval = new Number();

		for (int exp = 0; exp < coeffs.length; exp++) {
			retval = retval.add(coeffs[exp].mult(x.pow(new Number(exp))));
		}

		return retval;
	}

	public Polynomial add(Polynomial p) {
		Number[] newCoeffs;
		if (p.coeffs.length > this.coeffs.length) {
			newCoeffs = new Number[p.coeffs.length];

		} else {
			newCoeffs = new Number[this.coeffs.length];

		}
		for (int i = 0; i < newCoeffs.length; i++) {

			if (i < p.coeffs.length && i < this.coeffs.length) {
				newCoeffs[i] = p.coeffs[i].add(this.coeffs[i]);
			} else if (this.coeffs.length > p.coeffs.length) {
				newCoeffs[i] = this.coeffs[i];
			} else {
				newCoeffs[i] = p.coeffs[i];
			}
		}

		return new Polynomial(newCoeffs);
	}

	public Polynomial negate() {
		Number[] negCoeffs = new Number[this.coeffs.length];
		for (int i = 0; i < negCoeffs.length; i++) {
			negCoeffs[i] = this.coeffs[i].negate();
		}
		return new Polynomial(negCoeffs);
	}

	public Polynomial mult(Polynomial p) {
		Number[] multCoeffs = new Number[p.coeffs.length + this.coeffs.length - 1];
		for (int m = 0; m < multCoeffs.length; m++) {
			multCoeffs[m] = new Number();
		}
		for (int i = 0; i < p.coeffs.length; i++) {
			for (int t = 0; t < this.coeffs.length; t++) {
				int index = i + t;
				if (!p.coeffs[i].equals(0.0) && !this.coeffs[t].equals(0.0)) {
					multCoeffs[index] = multCoeffs[index].add(p.coeffs[i].mult(this.coeffs[t]));
				}
			}

		}
		return new Polynomial(multCoeffs);

	}
}

// addition:
// x + 1
// 2x + 2
// 3x + 3
// x^2
// x^2 + 3x + 3x
// f.evaluate(x) + g.evaluate(x) == f.add(g).evaluate(x)

// multiplication
// x + 1
// 2x + 2
// 2x^2 + 4x + 2
// x^2
// 2x^4 + 4x^3 + 2x^2
// f.evaluate(x) * g.evaluate(x) == f.mult(g).evaluate(x)
