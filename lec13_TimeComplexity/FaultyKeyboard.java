package lec13_TimeComplexity;

import java.util.Scanner;

public class FaultyKeyboard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {

			String str = sc.next();
			String ch = sc.next();
			System.out.println(isValidInterpretation(str, ch));
		}
	}

	public static boolean name(String str, String ch) {
		int l = 0;

		for (int i = 0; i < ch.length(); i++) {

			if (str.charAt(l) == ch.charAt(i)) {
				continue;
			}

			else if (str.charAt(l + 1) == ch.charAt(i)) {
				l++;
			} else {
				return false;
			}

		}

		return true;
	}
	
	public static boolean isValidInterpretation(String intended, String interpreted) {
	    int i = 0;
	    int j = 0;

	    while (i < intended.length() && j < interpreted.length()) {
	        if (intended.charAt(i) == interpreted.charAt(j)) {
	            i++;
	        }
	        j++;
	    }

	    return i == intended.length();
	}

}
