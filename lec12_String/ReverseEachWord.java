package lec12_String;

public class ReverseEachWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "abc def ghi";

		reverse(str);
	}

	public static String reverse(String str) {
		// TODO Auto-generated method stub
		str += " ";
		String ans = "";
		int st = 0;
		int ed = 0;
		while (ed < str.length()) {
			if (str.charAt(ed) == ' ') {
				ans += replace(str, st, ed - 1) + " ";
				ed++;
				st = ed;

			}
			ed++;
		}

		return(ans);

	}

	private static String replace(String str, int st, int ed) {
		// TODO Auto-generated method stub
		String a = "";

		for (int i = ed; i >= st; i--) {
			a += str.charAt(i);
		}
		return a;
	}

}
