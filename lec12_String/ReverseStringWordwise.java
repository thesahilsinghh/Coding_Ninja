package lec12_String;

public class ReverseStringWordwise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = reverse("my name is xyz");
		System.out.println(str);

	}

	public static String reverse(String str) {

		int st = 0;
		int ed = 1;

		String ans = "";
		str += " ";
		while (ed <= str.length()) {

			if (str.charAt(ed - 1) == ' ') {

				ans = str.substring(st, ed) + ans;
				st = ed;
				ed++;

			}
			ed++;

		}

		return ans;
	}

}
