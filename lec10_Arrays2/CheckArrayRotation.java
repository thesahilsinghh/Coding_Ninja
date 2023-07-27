package lec10_Arrays2;

public class CheckArrayRotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[]arr= {4,3,2,1};
		System.out.println(arrayRotateCheck(arr));

	}

	public static int arrayRotateCheck(int[] arr) {
		// Your code goes here
		if (arr[0] > arr[1]) {
			return arr.length;
		}
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] < arr[i + 1]) {
				continue;
			} else {

				return i + 1;
			}
		}

		return 0;
	}

}
