package lec9_Arrays;

public class FindUnique {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int []arr= {2 ,4 ,7 ,2 ,7,3};
		System.out.println(findUnique(arr));

	}

	public static int findUnique(int[] arr) {
		// Your code goes here
		
		for (int i = 0; i < arr.length; i++) {
		
			int a=arr[i];
			boolean ch=false;
			for (int j = 0; j < arr.length; j++) {
				if(j==i) {
					continue;
				}
				
				if(a==arr[j]) {
					ch=true;
					break;
				}
				
				
			}
			if(!ch) {
				return a;
			}
		
		}
		return -1;
		
		
		
	}
}
