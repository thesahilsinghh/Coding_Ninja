package lec10_Arrays2;

public class CodeMergeTwoSortedArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr1 = { 1, 3, 4, 5, 6, 99 };
		int[] arr2 = { 2, 2, 4, 6, 7, 8, 9, 11, 23, 45 };
		int[] ans = merge(arr1, arr2);
		for (int i = 0; i < ans.length; i++) {
			System.out.print(ans[i] + " ");
		}

	}

	public static int[] merge(int arr1[], int arr2[]) {
		// Your code goes here
		int[] af = new int[arr1.length + arr2.length];
		int i = 0;
		int j = 0;

		int p = 0;
		while (i < arr1.length && j < arr2.length) {
			if (arr1[i] < arr2[j]) {
				af[p] = arr1[i];
				p++;
				i++;
			} else {
				af[p] = arr2[j];
				p++;
				j++;
			}
		}

		while (i < arr1.length) {
			af[p] = arr1[i];
			p++;
			i++;
		}
		while (j < arr2.length) {
			af[p] = arr2[j];
			p++;
			j++;
		}

		return af;
	}

}
