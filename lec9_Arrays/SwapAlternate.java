package lec9_Arrays;

public class SwapAlternate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

	}
	
	public static void swap(int []arr) {
		for (int i = 0; i < arr.length; i+=2) {
			int t=arr[i];
			arr[i]=arr[i+1];
			arr[i+1]=t;
		}
	}

}
