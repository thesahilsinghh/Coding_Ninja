package Lec7_OperatorLoops;

import java.util.Scanner;

public class SumOrProduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int c = sc.nextInt();

		if (c == 1) {
			int ans = 0;
			for (int i = 1; i <= n; i++) {
				ans += i;

			}
			System.out.println(ans);

		} else if (c == 2) {
			int ans = 1;
			for (int i = 1; i <= n; i++) {
				ans *= i;

			}
			System.out.println(ans);

		} else {
			System.out.println(-1);

		}

	}

}
