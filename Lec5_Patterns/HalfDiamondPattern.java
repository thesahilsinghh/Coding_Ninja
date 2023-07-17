package Lec5_Patterns;

import java.util.Scanner;

public class HalfDiamondPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int ro = 1;
		int str = 1;
		while (ro <= n * 2 + 1) {

			System.out.print("*");

			if (ro != 1 && ro != n * 2 + 1) {
				int st=1;
				int nos=1;
				while(st<=str/2+1) {
					System.out.print(nos);
					nos++;
					st++;
				}
				nos-=2;
				while(nos>=1&&st<=str) {
					System.out.print(nos);
					nos--;
					st++;
				}
				if (ro <= n) {
					str +=2;
				} else {
					str -=2;
				}
				System.out.print("*");
			}

				
			ro++;
			System.out.println();

		}
		
		if(n==0) {
			System.out.println("*");
		}

	}

}
