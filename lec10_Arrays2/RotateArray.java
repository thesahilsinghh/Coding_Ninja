package lec10_Arrays2;

public class RotateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr= {1,2,3,4,5,6,7};
		rotate(arr, 2);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}

	public static void rotate(int[] arr, int d) {

		rotate1(arr, 0, arr.length - 1);
		d = d % arr.length;
		rotate1(arr, 0, arr.length - (d + 1));
		rotate1(arr, arr.length - d, arr.length - 1);
	}

	public static void rotate1(int[] nums, int start, int end) {

		while (start < end) {

			int t = nums[start];
			nums[start] = nums[end];
			nums[end] = t;
			start++;
			end--;
		}
	}

}
