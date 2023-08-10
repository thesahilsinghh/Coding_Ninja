package lec12_String;

public class CompressTheString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getCompressedString("aabcbbc"));

	}

	public static String getCompressedString(String str) {

		String ans = "";
		int count = 1;
		char a = str.charAt(0);
		for (int i = 1; i < str.length(); i++) {

			if (str.charAt(i) != a) {

				ans += a;
				if(count>1) {
					ans+=count;
				}

				a = str.charAt(i);
				count = 1;
				continue;

			}

			count++;

		}
		
		if(count==1) {
			ans+=a;
		}else {
			ans+=a+""+count;
		}

		return ans;

	}

}
