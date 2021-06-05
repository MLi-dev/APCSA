package numberclass;

public class Main {
	public static void main(String[] args) {

		// double[] coeffs = { 0, 0, 0, 3, 1 };
		Number[] coeffs = { new Number(1), new Number(1) };

		Polynomial p1 = new Polynomial(coeffs);
		System.out.println(p1);

		Number[] coeffs2 = { new Number(2), new Number(2), new Number(5) };

		Polynomial p2 = new Polynomial(coeffs2);
		System.out.println(p2);

//		System.out.println(new Polynomial(p1.addition(coeffs2)));
//
//		System.out.println(p1.evaluate(1));
//		System.out.println(p1.evaluate(0));

		Number x = new Number(3.0);
		System.out.println("Three:" + x);
		System.out.println(x.add(2.0));

		// Constructor that takes no arguments, expected to return zero.
		Number z = new Number();
		if (!z.equals(0.0)) {
			System.out.println("Not zero");
		}
		Number product = z.mult(5.0);
		if (!product.equals(0.0)) {
			System.out.println("Product not zero");
		}
		product = z.mult(new Number(10.0));
		if (!product.equals(0.0)) {
			System.out.println("Product not zero");
		}
		// Constructor that takes one argument, 1. Expected to return Number X if
		// multiplying by X.
		Number o = new Number(1.0);
		if (!o.mult(5.0).equals(5.0)) {
			System.out.println("Result not equal to product of 1 and 5");
		}
		// Mult method takes type Number instead of double.
		if (!o.mult(new Number(5.0)).toString().equals("5.0")) {
			System.out.println("Result not equal to product of 1 and 5");
		}
		// Add method that takes sum of argument and number
		Number s = new Number(3.0);
		if (!s.add(5.0).equals(8.0)) {
			System.out.println("Sum not equal to 8");
		}
		// Add method but takes a Number
		Number n = new Number(5.0);
		if (!s.add(n).equals(8.0)) {
			System.out.println("Result not equal to 8");
		}
		// Negate method that returns negation of fieldVal
		Number t1 = new Number(8.0);
		Number t2 = t1.negate();
		if (!t1.add(t2).equals(0.0)) {
			System.out.println("Result not a negation");
		}
		// Negate method that returns double
		double t3 = t1.negateDouble();
		Number d = new Number(t3);
		if (!d.add(t1).equals(0.0)) {
			System.out.println("Result not negation");
		}
		// Reciprocal that returns Number
		Number r = new Number(10.0);
		Number r2 = r.reciprocal();
		if (!r.mult(r2).equals(1.0)) {
			System.out.println("Not a reciprocal");
		}
		// Polynomial X+1 where X=3, evaluate method should return 4
		Number[] numArray = { new Number(1.0), new Number(1.0) };
		Polynomial poly = new Polynomial(numArray);
		if (!poly.evaluate(new Number(3.0)).equals(4.0)) {
			System.out.println("Evaluation incorrect, plugging in x=3 does not give us 4.0.");
		}
		// Polynomial X+1 where X=7, evaluate method should return 8
		if (!poly.evaluate(new Number(7.0)).equals(8.0)) {
			System.out.println("Evaluation incorrect, plugging in x=7 doesn't give us 8.0");
		}
		// Polynomial 2X+2 where X=5, evaluate method should return 12
		Number[] numArray2 = { new Number(2.0), new Number(2.0) };
		Polynomial poly2 = new Polynomial(numArray2);
		if (!poly2.evaluate(new Number(5.0)).equals(12.0)) {
			System.out.println("Evaluation incorrect, plugging in x=5 doesn't give us 12.0");
		}
		// Polynomial 3X+3 should equal (2X+2)+(X+1), X=10
		Number[] numArray3 = { new Number(3.0), new Number(3.0) };
		Polynomial poly3 = new Polynomial(numArray3);
		System.out.println(poly3.evaluate(new Number(10.0)));
		System.out.println(poly.evaluate(new Number(10.0).add(poly2.evaluate(new Number(10.0)))));
		Number result1 = poly3.evaluate(new Number(10.0));
		Number result2 = poly.evaluate(new Number(10.0).add(poly2.evaluate(new Number(10.0))));
		if (!result1.toString().equals(result2.toString())) {
			System.out.println("3X+3 doesn't equal (2X+2)+(X+1)");
		}
		System.out.println(poly.add(poly2));
		// Add two polynomials: X+1 and 2X+2 If X=3, I expect 12.
		Number[] numArray4 = { new Number(1.0), new Number(1.0) };
		Polynomial poly4 = new Polynomial(numArray4);
		Number[] numArray5 = { new Number(2.0), new Number(2.0) };
		Polynomial poly5 = new Polynomial(numArray5);
		Polynomial poly6 = poly4.add(poly5);
		Number a = poly6.evaluate(new Number(3.0));
		if (!a.equals(12.0)) {
			System.out.println("X+1+2X+2 doesn't equal 3X+3");
		}
		// Original polynomial is X+1, negCoeffs should be -X-1. If X=-1, I expect 0.
		Number[] numArray6 = { new Number(1.0), new Number(1.0) };
		Polynomial poly7 = new Polynomial(numArray6);
		Number[] numArray7 = { new Number(1.0), new Number(1.0) };
		Polynomial poly8 = new Polynomial(numArray7);
		Polynomial b = poly8.negate();
		Polynomial poly9 = poly7.add(b);
		Number c = poly9.evaluate(new Number(-1.0));
		if (!c.equals(0.0)) {
			System.out.println("Negation failed");
		}

		// Finds (X+1)*(X+1). If I plug in X=1, I expect 4. I also
		// Evaluate X=-1. test if it gives 0.
		Number[] numArray8 = { new Number(1.0), new Number(1.0) };
		Polynomial poly10 = new Polynomial(numArray8);
		Number[] numArray9 = { new Number(1.0), new Number(1.0) };
		Polynomial poly11 = new Polynomial(numArray9);
		Polynomial poly12 = poly10.mult(poly11);
		Number e = poly12.evaluate(new Number(1.0));
		if (!e.equals(4.0)) {
			System.out.println("Mult not = (X+1)^2");
		}
		Number f = poly12.evaluate(new Number(-1.0));
		if (!f.equals(0.0)) {
			System.out.println("Evaluating x=-1 failed");
		}
		// Finds x-8x^3, plugs in X=3. I expect -213.
		Number[] numArray10 = { new Number(0.0), new Number(1.0) };
		Polynomial poly13 = new Polynomial(numArray10);
		Number[] numArray11 = { new Number(0.0), new Number(0.0), new Number(0.0), new Number(-8.0) };
		Polynomial poly14 = new Polynomial(numArray11);
		Polynomial poly15 = poly13.add(poly14);
		Number g = poly15.evaluate(new Number(3.0));
		if (!g.equals(-213.0)) {
			System.out.println("Mult not = x-8x^3");
		}

	}

}
