package lec10_Arrays2;

public class SumOfTwoArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[] = { 8, 5, 2 };
		int arr2[] = { 9, 2 };
		int ar[] = new int[4];
		name(arr1, arr2, ar);
		for (int i = 0; i < ar.length; i++) {
			System.out.print(ar[i] + " ");
		}

	}

	public static void name(int arr1[], int arr2[], int output[]) {

		int a = arr1.length - 1;
		int b = arr2.length - 1;
		int mod = 0;
		int l = output.length - 1;
		while (a >= 0 && b >= 0) {
			int ans = arr1[a] + arr2[b] + mod;
			output[l] = ans % 10;
			mod = ans / 10;

			a--;
			b--;
			l--;
		}

		while (a >= 0) {
			int ans = arr1[a] + mod;
			output[l] = ans % 10;
			mod = ans / 10;
			l--;
			a--;
		}
		while (b >= 0) {
			int ans = arr2[b] + mod;
			output[l] = ans % 10;
			mod = ans / 10;
			l--;
			a--;
		}
	}
}
