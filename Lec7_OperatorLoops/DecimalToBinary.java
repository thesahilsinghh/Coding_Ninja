package Lec7_OperatorLoops;

import java.util.Scanner;

public class DecimalToBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		long m = 1;
		long a = 0;
		while (n > 0) {

			int rem = n % 2;
			a = a + rem * m;
			m = m * 10;
			n = n / 2;

		}
		System.out.println(a);


	}

}
