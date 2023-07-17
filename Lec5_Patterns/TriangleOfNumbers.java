package Lec5_Patterns;

import java.util.Scanner;

public class TriangleOfNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int ro=1;
		int str=1;
		int space=n-1;
		while (ro<=n) {
			
			int spc=0;
			while(spc<space) {
				System.out.print(" ");
				spc++;
			}
			
			int prt = 1;
			int nos=ro;
			while (prt <= str/2) {
				System.out.print(nos);
				
				prt++;
				nos++;
			}
			while(prt<=str) {
				System.out.print(nos);
				prt++;
				nos--;
			}

			space--;
			str+=2;
			ro++;
			System.out.println();
		}
	}

}
