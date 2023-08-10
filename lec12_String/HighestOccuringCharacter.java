package lec12_String;

public class HighestOccuringCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(highestOccuringChar("abdefgbabfba"));

	}

	public static char highestOccuringChar(String str) {
		// Your code goes here

		int[] arr = new int[256];

		for (int i = 0; i < str.length(); i++) {
			arr[(int) str.charAt(i)] += 1;
		}

		char ans = str.charAt(0);
		int ch = arr[(int) str.charAt(0)];
		for (int i = 1; i < str.length(); i++) {
			if (ch < arr[(int) str.charAt(i)]) {
				ans = str.charAt(i);
				ch = arr[(int) str.charAt(i)];
			}
		}
		return ans;
	}
}
