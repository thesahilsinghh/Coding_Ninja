package lec17_Oops;

public class Polynomial {

	private DynamicArray arr = new DynamicArray();

	// set Coefficient
	public void setCoefficient(int degree, int x) {
		while (degree >= this.arr.size()) {
			this.arr.add(0);
		}

		this.arr.set(degree, x);

	}

	// get Coefficient
	public int getCoefficient(int degree) {
		return arr.get(degree);
	}

	// degree
	public int degree() {
		// TODO Auto-generated method stub
		return arr.size();
	}

	// add
	public void add(Polynomial p2) {
		for (int i = 0; i < p2.degree(); i++) {
			if (p2.arr.get(i) != 0) {
				int a = p2.arr.get(i) + arr.get(i);
				arr.set(i, a);

			}
		}
	}

	// subtract
	public void subtract(Polynomial p2) {

		for (int i = 0; i < p2.degree(); i++) {
			if (p2.arr.get(i) != 0) {
				int a = arr.get(i) - p2.arr.get(i);
				arr.set(i, a);

			}
		}

	}
	
	
	//multiply
	
	public void multiply(Polynomial p2) {
		
		
		
		
		
		
		
	}

	// print
	public void print() {
		// TODO Auto-generated method stub
		for (int i = 0; i < arr.size(); i++) {
			if (arr.get(i) != 0) {
				System.out.print(arr.get(i) + "x^" + i + " + ");
			}
		}
		System.out.println();
	}
}
