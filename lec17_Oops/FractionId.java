package lec17_Oops;

public class FractionId {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fraction f1 = new Fraction(2, 3);

//		f1.print();
//
//		f1.add(4, 9);
//		f1.print();
//		Fraction f2 = new Fraction(4, 9);
//
//		f1.add(f2);
//		f1.print();

		f1.multiply(4, 9);
		f1.print();
		Fraction f2 = new Fraction(10, 9);
		Fraction ne = f2.multiply(f1, f2);
		ne.print();

	}

}
