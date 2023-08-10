package lec11_2dArrays;

public class PrintLikeAWave {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = { { 1, 2, 3, 4, 5 }, { 6, 7, 8, 9, 10 }, { 11, 12, 13, 14, 15 }, { 16, 17, 18, 19, 20 },
				{ 21, 22, 23, 24, 25 } };
		wavePrint(arr);


	}

	public static void wavePrint(int mat[][]) {
		if(mat.length==0) {
			System.out.println(0);
			return;
		}
	
		for (int i = 0; i < mat[0].length; i++) {

			if (i % 2 == 0) {
				for (int j = 0; j < mat.length; j++) {
					System.out.print(mat[j][i] + " ");
				}
			} else {
				for (int j = mat.length - 1; j >= 0; j--) {
					System.out.print(mat[j][i] + " ");
				}

			}
		}
	}

}
