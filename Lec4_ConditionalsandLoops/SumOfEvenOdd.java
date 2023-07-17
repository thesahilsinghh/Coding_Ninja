package Lec4_ConditionalsandLoops;

import java.util.Scanner;

public class SumOfEvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int even = 0;
		int odd = 0;
		while (n > 0) {
			int ans = n % 10;

			if (ans % 2 == 0) {
				even += ans;
			} else {
				odd += ans;
			}
			n /= 10;
		}
		System.out.println(even + " " + odd);
	}

}
