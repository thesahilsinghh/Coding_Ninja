package test_First;

import java.util.Scanner;

public class CheckAP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int a = sc.nextInt();
		int b = sc.nextInt();
		int diff = b - a;

		a = b;

		for (int i = 0; i < n - 2; i++) {
			b = sc.nextInt();

			if (b - a == diff) {

			} else {
				System.out.println(false);
				return;
			}
			a = b;

		}

		System.out.println(true);

	}

}
