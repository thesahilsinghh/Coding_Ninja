package recursion_Assignments;

public class StringToInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			System.out.println(convertStringToInt("12345"));
	}
	
	
	public static int convertStringToInt(String str){
	
		if(str.length()==0) {
			return 0;
		}
		
		
		int a=str.charAt(str.length()-1)-48;
		int b=convertStringToInt(str.substring(0,str.length()-1));
		return b*10+a;
		
		
	}

}
