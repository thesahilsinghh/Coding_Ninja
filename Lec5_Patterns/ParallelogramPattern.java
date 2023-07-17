package Lec5_Patterns;

import java.util.Scanner;

public class ParallelogramPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int ro = 1;
		int sp = 0;
		while (ro <= n) {

			int spc = 1;
			while (spc <= sp) {
				System.out.print(" ");
				spc++;
			}

			int str = 1;
			while (str <= n) {
				System.out.print("*");
				str++;
			}
			sp++;
			ro++;
			System.out.println();

		}
	}

}
