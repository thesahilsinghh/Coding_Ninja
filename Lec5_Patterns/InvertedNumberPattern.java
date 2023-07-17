package Lec5_Patterns;

import java.util.Scanner;

public class InvertedNumberPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
			
			
		
		while(n>0) {
			
	
			int prt=1;
			while(prt<=n) {
				System.out.print(n);
				prt++;
			}
			
			n--;
			System.out.println();
		}
	}

}
