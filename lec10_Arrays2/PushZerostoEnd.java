package lec10_Arrays2;

public class PushZerostoEnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 5, 0, 7, 4, 8, 1, 3, 0, 7, 2, 0 };

		pushZerosAtEnd(arr);

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

	public static void pushZerosAtEnd(int[] arr) {
		// Your code goes here

		int start = 0;
		int end = arr.length - 1;
		while (start < end) {

			if (arr[start] == 0 && arr[end] != 0) {
				arr[start] = arr[end];
				arr[end] = 0;
				end--;
				start++;
				continue;
			} else if (arr[start] == 0) {
				end--;
				continue;
			} else {
				start++;
			}
		}

	}

	public static void name(int[] arr) {
		int start = 0;
		int ft = 0;
		while (start < arr.length) {

			if (arr[start] != 0) {
				start++;
				ft++;
				continue;
			} else if (arr[start] == 0 && arr[ft] != 0) {
				arr[start]=arr[ft];
				arr[ft]=0;
				start++;
				ft++;
			}else {
				ft++;
			}

		}
	}

}
