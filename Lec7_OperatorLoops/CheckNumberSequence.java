package Lec7_OperatorLoops;

import java.util.Scanner;

public class CheckNumberSequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int a = sc.nextInt();
		int count = 0;
		boolean dec = true;
		for (int i = 0; i < n - 1; i++) {
			int b = sc.nextInt();
			if (count > 1 || a == b) {
				System.out.println(false);
				return;
			} else if (b < a && dec == false) {
				System.out.println(false);
				return;
			}

			if (b > a && dec == true) {
				dec = false;
				count++;
			}

			a = b;

		}
		System.out.println(true);

	}

}
