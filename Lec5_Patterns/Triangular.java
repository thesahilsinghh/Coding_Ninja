package Lec5_Patterns;

public class Triangular {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=5;
		int ro=1;
		
		while(ro<n) {
			int prt=1;
			while(prt<=ro) {
				System.out.print("*");
				prt++;
			}
			ro++;
			System.out.println();
		}

	}

}
