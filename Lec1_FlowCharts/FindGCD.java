package Lec1_FlowCharts;

public class FindGCD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(GCD(98, 56));
	}

	public static int GCD(int a, int b) {
		int r = Math.min(a, b);
		while (r > 0) {
			if (a % r == 0 && b % r == 0) {
				return r;
			}
			r--;
		}
		return r;

	}

}
