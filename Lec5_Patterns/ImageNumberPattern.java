package Lec5_Patterns;

import java.util.Scanner;

public class ImageNumberPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
			int ro=1;
			int spc=n-1;
		
		while(ro<=n) {
			
			int sp=1;
			while(sp<=spc) {
				System.out.print(" ");
				sp++;
			}
			int prt=1;
			while(prt<=ro) {
				System.out.print(prt);
				prt++;
			}
			spc--;
			ro++;
			System.out.println();
		}

	}

}
