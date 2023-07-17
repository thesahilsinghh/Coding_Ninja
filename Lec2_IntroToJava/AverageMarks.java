package Lec2_IntroToJava;

import java.util.Scanner;

public class AverageMarks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		String str= sc.next();
		int m1=sc.nextInt();
		int m2=sc.nextInt();
		int m3=sc.nextInt();
		System.out.println(str.charAt(0));
		System.out.println((m1+m2+m3)/3);

	}

}
