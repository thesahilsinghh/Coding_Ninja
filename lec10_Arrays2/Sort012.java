package lec10_Arrays2;

public class Sort012 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 2, 2, 0, 1, 1 };
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		name(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

	public static void name(int[] arr) {

		int nz = 0;
		int nt = arr.length - 1;
		int i = 0;
		while (i < nt) {
			if (arr[i] == 1) {
				i++;
				continue;

			}
			if (arr[i] == 0) {
				int t = arr[nz];
				arr[nz] = 0;
				arr[i] = t;
				nz++;
				i++;
			} else {
				int t = arr[nt];
				arr[nt] = 2;
				arr[i] = t;
				nt--;
			}
		}

	}

}
