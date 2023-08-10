package lec14_Recursion1;

public class SumOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 2, 3, 4, 5 };
		System.out.println(sum(arr));
	}

	public static int sum(int input[]) {
		/*
		 * Your class should be named Solution Don't write main(). Don't read input, it
		 * is passed as function argument. Return output and don't print it. Taking
		 * input and printing output is handled automatically.
		 */
		return name(input, 0);

	}

	public static int name(int[] arr, int i) {

		if (i >= arr.length) {
			return 0;
		}

		int idx = name(arr, i + 1);
		return idx + arr[i];

	}

}
