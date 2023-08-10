package lec12_String;

public class CheckPermutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isPermutation("race", "rate"));

	}

	public static boolean isPermutation(String str1, String str2) {
		// Your code goes here

		if (str1.length() != str2.length()) {
			return false;
		}
		int[] arr = new int[256];

		for (int i = 0; i < str1.length(); i++) {
			char a = str1.charAt(i);
			arr[(int) a] += 1;
		}

		for (int i = 0; i < str2.length(); i++) {
			char a = str2.charAt(i);
			arr[(int) a] -= 1;
		}

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0) {
				return false;
			}
		}
		return true;
	}

}
