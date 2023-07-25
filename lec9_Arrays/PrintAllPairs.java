package lec9_Arrays;

public class PrintAllPairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr= {1,2,3,4,5};
		pair(arr);
	}
	
	public static void pair(int[]arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				System.out.print("("+arr[i]+","+arr[j]+")");
				
			}
		}
		System.out.println(arr[arr.length-1]);
	}

}
