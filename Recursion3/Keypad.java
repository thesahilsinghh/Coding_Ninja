package Recursion3;
import java.util.*;
public class Keypad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		keypad(23);
	}
	
	public static String[] keypad(int n){
		// Write your code here

		String []pad={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
		ArrayList<String>aa=new ArrayList<>();
		keypadhelp(pad, aa, n, "");
		System.out.println(aa);
		return null;
	}


public static void keypadhelp(String []pad,ArrayList<String>aa,int n,String ans){

		if(n==0){
			aa.add(ans);
			return;
		}


		int a=n%10;
		n/=10;
		for(int i=0;i<pad[a].length();i++){
			char x=pad[a].charAt(i);
			keypadhelp(pad, aa, n, ans);
			keypadhelp(pad, aa, n, ans+x);
		}

	}

}
