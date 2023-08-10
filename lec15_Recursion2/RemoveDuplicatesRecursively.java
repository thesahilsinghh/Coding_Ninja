package lec15_Recursion2;

public class RemoveDuplicatesRecursively {

	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub

		
		System.out.println(removeConsecutiveDuplicates(""));
	}
	
	public static String removeConsecutiveDuplicates(String s) {
		// Write your code here


		if(s.length()<=1){
			return s;
		}

		String str=removeConsecutiveDuplicates(s.substring(1));

		if(str.charAt(0)==s.charAt(0)){
			return str;
		}else{
			return s.charAt(0)+str;
		}

	}

}
