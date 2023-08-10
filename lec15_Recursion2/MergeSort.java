package lec15_Recursion2;

public class MergeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[]arr= {4,12,3,5,1,8,12};
		mergeSort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}

	}

	public static void mergeSort(int[] arr) {

		if (arr.length <= 1) {
			return;
		}

		int[] a = new int[arr.length / 2];
		int[] b = new int[arr.length - a.length];

		for (int i = 0; i < a.length; i++) {
			a[i] = arr[i];
		}
		for (int i = arr.length / 2; i < arr.length; i++) {
			b[i - arr.length/2] = arr[i];
		}

		mergeSort(a);
		mergeSort(b);

		merge(a, b, arr);
	}

	public static void merge(int[] s1, int[] s2, int[] t) {

		int a = 0;
		int b = 0;
		int k = 0;

		while (a < s1.length && b < s2.length) {

			if (s1[a] <= s2[b]) {
				t[k] = s1[a];
				a++;
				k++;

			} else {
				t[k] = s2[b];
				b++;
				k++;
			}

		}

		while (a < s1.length) {
			t[k] = s1[a];
			a++;
			k++;

		}

		while (b < s2.length) {
			t[k] = s2[b];
			b++;
			k++;

		}

	}

}
