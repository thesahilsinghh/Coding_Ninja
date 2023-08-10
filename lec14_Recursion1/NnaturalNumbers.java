package lec14_Recursion1;

public class NnaturalNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		name(20);

		
	}
	
	public static void name(int n) {
		if(n==0) {
			return;
		}
		
		name(n-1);
		System.out.println(n);
		
	}

}
