package lec14_Recursion1;

public class CalculatePower {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(pow(2, 2));

	}

	public static int pow(int x, int n) {
		if (n == 0) {
			return 1;
		}

		int small = pow(x, n - 1);
		return x * small;
	}

}
