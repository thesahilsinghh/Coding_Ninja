package Lec4_ConditionalsandLoops;

import java.util.*;

public class Factors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int ans = n / 2;
		int fac = 2;
		int prime = -1;
		while (fac <= ans) {
			if (n % fac == 0) {
				prime++;
				System.out.print(fac+" ");
			}
			fac++;
		}

		if (prime == -1) {
			System.out.println(-1);
		}

	}

}
