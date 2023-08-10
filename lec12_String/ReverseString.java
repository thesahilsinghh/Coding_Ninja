package lec12_String;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		reverse("abcbs");
	}

	public static void reverse(String str) {
		String ans = "";
		for (int i = str.length()-1; i >= 0; i--) {
			ans += str.charAt(i);
		}
		System.out.println(ans);
	}
}
