package Lec4_ConditionalsandLoops;

import java.util.Scanner;

public class TotalSalary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner sc = new Scanner(System.in);
	int n=sc.nextInt();
	String str= sc.next();
	char ch= str.charAt(0);
	sal(n, ch);
	}

	public static void sal(int bas, char grade) {
		double sal;
		double hra = bas * 0.2;
		double da = bas * 0.5;
		double pf = bas * 0.11;
		if (grade == 'A') {
			sal = bas + hra + da + 1700 - pf;
		} else if (grade == 'B') {
			sal = bas + hra + da + 1500 - pf;
		} else {
			sal = bas + hra + da + 1300 - pf;
		}
		System.out.println(sal);
		System.out.println(Math.round(sal));
	}

}
