package lec17_Oops;

public class poly_emp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Polynomial p1 = new Polynomial();
		p1.setCoefficient(0, 3);
		p1.setCoefficient(2, 2);
		p1.print();
		
		
		Polynomial p2= new Polynomial();
		p2.setCoefficient(0, 2);
		p2.setCoefficient(2, 2);
		p2.setCoefficient(7, 5);
		p2.setCoefficient(2, 6);
		p2.print();
	}

}
