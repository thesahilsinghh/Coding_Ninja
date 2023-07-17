
package Lec5_Patterns;

import java.util.*;

public class Triangle_nos {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int ro = 1;

		while (ro < n) {
			int prt = 1;
			while (prt <= ro) {
				System.out.print(ro);
				prt++;
			}
			ro++;
			System.out.println();
		}

	}
}
