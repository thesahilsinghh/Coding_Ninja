package lec17_Oops;

public class ComplexNumbers {

	int a;
	int ib;

	public ComplexNumbers(int a, int ib) {
		this.a = a;
		this.ib = ib;
	}

	public void print() {
		// TODO Auto-generated method stub
		System.out.println(this.a + " + i" + this.ib);
	}

	public void plus(ComplexNumbers c2) {
		// TODO Auto-generated method stub
		this.a += c2.a;
		this.ib = c2.ib;
		return;
	}

	public void multiply(ComplexNumbers c2) {
		// TODO Auto-generated9 method stub
		this.a = (this.a * c2.a) - (this.ib * c2.ib);
		this.ib = (this.a * c2.ib) + (this.ib * c2.a);
	}

}
