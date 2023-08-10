package lec15_Recursion2;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[]arr= {1,2,3,4,5,6,7,8,9};
		System.out.println(search(arr, 0, arr.length-1, 5));
	}

	public static int search(int[] arr, int st, int ed, int x) {
		if (st > ed) {
			return -1;
		}

		int mid = (st + ed) / 2;
		if (arr[mid] == x) {
			return mid;
		}

		else if (arr[mid] >= x) {
			return search(arr, st, mid - 1, x);
		} else {
			return search(arr, mid + 1, ed, x);
		}

	}

}
