package lec12_String;

public class StringPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static boolean isPalindrome(String str) {
		// Your code goes here
		int st = 0;
		int ed = str.length() - 1;

		while (st <= ed) {
			if (str.charAt(st) != str.charAt(ed)) {
				return false;
			}

			st++;
			ed--;
		}
		return true;
	}

}
