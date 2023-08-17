package recursion_Assignments;

public class PairStar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="hell";
		char a='o';
		s+=a;
		System.out.println(s);

	}
	
	public static String addStars(String s) {
		// Write your code here

		if(s.length()<=1){
			return s;
		}


		char a=s.charAt(s.length()-1);
		String b=addStars(s.substring(0,s.length()-1));

		if(a==b.charAt(b.length()-1)){
			b+="*"+a;
		}
		return b;
	}

}
