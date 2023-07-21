package test_First;

import java.util.Scanner;

public class NumberStarPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int ro = 1;
		int fr = 1;
		while (ro <= n) {
			int pr = n;
			while (pr > fr) {
				System.out.print(pr);
				pr--;
			}
			System.out.print("*");

			int scnd = fr-1;
			while (scnd > 0) {
				System.out.print(scnd);
				scnd--;
			}

			fr++;
			ro++;
			System.out.println();
		}
	}

}
