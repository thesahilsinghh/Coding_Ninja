package lec11_2dArrays;

public class MinimumLengthWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(minLengthWord("aqwdqwd abwsdjn ba"));
	}

	public static String minLengthWord(String input) {
		if(input.length()==0) {
			return "";
		}
		// Write your code here

		String a = "";
		int aa = 0;
		input += " ";
		// store first word
		for (int i = 0; input.charAt(i) != ' '; i++) {
			aa++;
			a += input.charAt(i);
		}

		String ans = a;
		a = "";

		for (int i = aa + 1; i < input.length(); i++) {
			if (input.charAt(i) == ' ') {
				if (a.length() < ans.length()) {
					ans = a;
					
				}
				a = "";
				
				continue;
			}
			a += input.charAt(i);
		}
		return(ans);

	}

}
