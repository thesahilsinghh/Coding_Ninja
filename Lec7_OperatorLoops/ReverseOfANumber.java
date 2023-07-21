package Lec7_OperatorLoops;

import java.util.Scanner;

public class ReverseOfANumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int ans = 0;

		while (n > 0) {
			ans = ans + (n % 10);
			ans *= 10;
			n /= 10;
		}
		ans /= 10;
		System.out.println(ans);

	}

}
