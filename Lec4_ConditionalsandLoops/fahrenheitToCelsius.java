package Lec4_ConditionalsandLoops;

import java.util.Scanner;

public class fahrenheitToCelsius {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
		int e = sc.nextInt();
		int w = sc.nextInt();
		while (s <= e) {
			int c = (s - 32)*5 / 9;
			System.out.println(s + " " + c);
			s += w;
		}

	}

}
