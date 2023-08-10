package lec15_Recursion2;

public class ReplacePi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(replce("helloXpiksjpi"));

	}

	public static String replce(String str) {
		if (str.length() <= 1) {
			return str;
		}

		String a = str.substring(0, 2);
		if (a.equals("pi")) {
			return "3.14" + replce(str.substring(2));
		} else {
			return str.charAt(0) + replce(str.substring(1));
		}

	}

}
