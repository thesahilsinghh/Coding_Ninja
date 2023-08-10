package lec11_2dArrays;

public class LargestRowOrColumn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] arr = new int[0][0];
		name(arr);

	}

	public static void name(int[][] mat) {
		
		if(mat.length==0) {
			return;
		}
		int ro = 0;
		int prev = Integer.MIN_VALUE;
		for (int i = 0; i < mat.length; i++) {

			int sum = 0;
			for (int j = 0; j < mat[i].length; j++) {
				sum += mat[i][j];
			}
			if (prev < sum) {
				ro = i;
				prev = sum;
			}

		}

		int col = 0;
		int prev1 = Integer.MIN_VALUE;
		for (int i = 0; i < mat[0].length; i++) {

			int sum = 0;
			for (int j = 0; j < mat.length; j++) {
				sum += mat[j][i];
			}
			if (prev1 < sum) {
				col = i;
				prev1 = sum;
			}

		}
		if (prev > prev1) {
			System.out.println("row " + ro + " " + prev);
		} else {
			System.out.println("column " + col + " " + prev1);

		}

	}

}
