package Lec5_Patterns;

import java.util.Scanner;

public class DiamondOfStars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int ro = 1;
		int str = 1;

		int space = n/2;
		while (ro <= n) {

			int spc = 0;
			while (spc < space) {
				System.out.print(" ");
				spc++;
			}

			int prt = 1;

			while (prt <= str) {
				System.out.print("*");

				prt++;

			}

			if (ro <= n / 2) {
				space--;
				str += 2;
			} else {
				space++;
				str -= 2;
			}
			ro++;
			System.out.println();
		}

	}

}
