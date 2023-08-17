package lec17_Oops;

public class Fraction {

	private int numerator;
	private int denominator;

	public Fraction(int n, int d) {

		this.numerator = n;
		this.denominator = d;
		simplify();

	}

	private void simplify() {

		int gcd = 1;
		for (int i = 2; i <= Math.min(numerator, denominator); i++) {
			if (numerator % i == 0 && denominator % i == 0) {
				gcd = i;
			}
		}

		this.numerator /= gcd;
		this.denominator /= gcd;

	}

	public void print() {

		System.out.println(this.numerator + "/" + this.denominator);
	}

	// get

	public int getNumerator() {
		return numerator;
	}

	public int getDenominator() {
		return denominator;
	}

	public void increment() {
		numerator += denominator;
		simplify();
	}

	public void setNumerator(int numerator) {
		this.numerator = numerator;
	}

	public void setDenominator(int denominator) {
		if (denominator == 0) {
			System.out.println("eeeeee");
			this.denominator = 1;
			return;
		}
		this.denominator = denominator;
	}

	// add

	public void add(Fraction f2) {
		add(f2.numerator, f2.denominator);
		return;
	}

	public void add(int num, int den) {
		// TODO Auto-generated method stub

		int n1 = this.numerator * den;
		int n2 = num * this.denominator;
		this.numerator = n1 + n2;
		this.denominator = den * this.denominator;

		simplify();

	}

	public Fraction add(Fraction f1, Fraction f2) {
		int n1 = f1.numerator * f2.denominator + f2.numerator * f1.denominator;

		Fraction result = new Fraction(n1, f2.denominator * f1.denominator);
		return result;
	}

	// multiply

	public void multiply(Fraction f2) {
		multiply(f2.numerator, f2.denominator);
		return;
	}

	public void multiply(int num, int den) {
		// TODO Auto-generated method stub

		this.numerator *= num;
		this.denominator *= den;
		simplify();

	}

	public Fraction multiply(Fraction f1, Fraction f2) {
		int n1 = f1.numerator * f2.numerator;
		int d1 = f2.denominator * f1.denominator;
		Fraction result = new Fraction(n1, d1);
		return result;
	}

}
