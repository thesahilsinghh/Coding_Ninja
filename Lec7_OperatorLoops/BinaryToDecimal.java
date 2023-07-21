package Lec7_OperatorLoops;

import java.util.Scanner;

public class BinaryToDecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		int po=0;
		int ans=0;
		while(n>0) {
			
			if(n%10==1) {
				ans+=Math.pow(2, po);
				
			}
			po++;
			n/=10;
		}
		System.out.println(ans);
	}

}
