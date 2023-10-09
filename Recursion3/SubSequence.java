package Recursion3;

public class SubSequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		subsequence("abc", "");
	}

	public static void subsequence(String str, String ans) {

		if (str=="") {
			System.out.println(ans+" ");
			return;
		}
		
		
		subsequence(str.substring(1), ans);
		subsequence(str.substring(1), ans + str.charAt(0));
		
	}

}
