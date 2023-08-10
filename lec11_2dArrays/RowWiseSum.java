package lec11_2dArrays;

public class RowWiseSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = { { 1,2,3, 4 }, {9, 8,7, 6 },{3,4,5,6}, { -1,1,-10, 5 } };
		
		rowWiseSum(arr);
		

	}

	public static void rowWiseSum(int[][] mat) {
		// Your code goes here

		for (int i = 0; i < mat.length; i++) {
			int ans = 0;
			for (int j = 0; j < mat[i].length; j++) {
				ans += mat[i][j];
			}
			System.out.print(ans + " ");
		}
	}
}
