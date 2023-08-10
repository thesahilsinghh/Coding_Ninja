package lec14_Recursion1;

public class NumberOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(countDigits(2806));
	}
	public static int countDigits(int n){
        // Write your code here.
        
		if(n==0) {
			return 0;
		}
		
		int x=countDigits(n/10);
		return x+1;
		
    }

}
