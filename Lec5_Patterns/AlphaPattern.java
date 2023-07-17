package Lec5_Patterns;

import java.util.Scanner;

public class AlphaPattern {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
			int ro=1;
		
		while(ro<=n) {
			int prt=1;
			int ap='A'+n-ro;
			while(prt<=ro) {
				System.out.print((char)ap);
				prt++;
				ap++;
				
			}
			ro++;
			System.out.println();
		}

	}
}
