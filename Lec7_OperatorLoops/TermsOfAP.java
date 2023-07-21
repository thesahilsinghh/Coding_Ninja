package Lec7_OperatorLoops;

import java.util.Scanner;

public class TermsOfAP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {

			int ans = i * 3 + 2;
			if (ans % 4 != 0) {
				System.out.print(ans + " ");
			}else {
				n++;
			}
		}

	}

}
