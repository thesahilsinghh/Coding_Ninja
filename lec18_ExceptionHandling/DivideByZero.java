package lec18_ExceptionHandling;

public class DivideByZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			divide(10, 0);
		} catch (DivideByZeroException e) {
			System.out.println("Divide by zero exception");
		}
		System.out.println("main");
	}

	public static void divide(int i, int j) throws DivideByZeroException {
		// TODO Auto-generated method stub

		if (j == 0) {

			throw new DivideByZeroException();

		}

		System.out.println(i / j);
	}

}
