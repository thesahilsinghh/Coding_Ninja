package test_4;

public class Print2DArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	

	}

	public static void print2DArray(int input[][]) {
		// Write your code here
		int n=input.length;
		for (int i = 0; i < input.length; i++) {
			for (int j = n; j > 0; j--) {
				print(input, i);
			}
			n--;
		}

	}

	public static void print(int[][] arr, int ro) {

		for (int i = 0; i < arr[ro].length; i++) {
			System.out.print(arr[ro][i]);
		}

		System.out.println();

	}

}
