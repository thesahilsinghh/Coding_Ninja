package Lec7_OperatorLoops;

import java.util.Scanner;

public class SquareRoot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		
		if(n==0) {
			System.out.println(0);
			return;
		}
		
		int ans=1;
		for (int i = 1; i < n/2; i++) {
			
			if(i*i>n) {
				break;
			}
			if(i*i==n) {
				System.out.println(i);
				return;
				
			}else{
				ans=i;
			}
			
		}
		
		System.out.println(ans);
		
	}

}
