package lec12_String;

public class CountWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		words("Coding Ninjas!");
	}

	public static void words(String str) {
		str += " ";
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ' ') {
				count++;
			}
		}
		System.out.println(count);
	}
}
