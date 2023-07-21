package Lec7_OperatorLoops;

import java.util.Scanner;

public class AllPrimeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if (n == 1) {
			return;
		}

		for (int i = 2; i <= n; i++) {
			boolean p = true;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					p = false;
					break;
				}
			}

			if (p) {
				System.out.println(i);
			}

		}

	}

}
