package lec11_2dArrays;

public class TotalSumOnTheBoundariesAndDiagonals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = { { 1, 2, 3, 4, 5 }, { 6, 7, 8, 9, 10 }, { 11, 12, 13, 14, 15 }, { 16, 17, 18, 19, 20 },
				{ 21, 22, 23, 24, 25 } };
		name(arr);

	}

	public static void name(int[][] mat) {
		int leng = mat.length - 1;
		int ans = 0;

		// first ro
		for (int i = 0; i < mat[0].length; i++) {
			ans += mat[0][i];
		}

		// last col
		for (int i = 1; i < mat.length - 1; i++) {
			ans += mat[i][leng];
		}

		// last ro
		for (int i = mat[0].length - 1; i >= 0; i--) {
			ans += mat[leng][i];

		}
		// first col
		for (int i = 1; i < mat.length - 1; i++) {
			ans += mat[i][0];
		}

		int a = 1;
		for (int i = 1; i < mat.length - 1; i++) {
			ans += mat[i][a];
			a++;
		}
		a = leng - 1;
		for (int i = 1; i < mat.length - 1; i++) {
			ans += mat[i][a];
			a--;
		}
		if (mat.length % 2 == 0) {
			System.out.println(ans);
			return;
		}
		leng = (leng / 2);
		ans -= mat[leng][leng];

		System.out.println(ans);
	}

}
