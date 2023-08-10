package lec13_TimeComplexity;

import java.util.Arrays;

public class FindtheUniqueElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 7, 1, 3, 7 };
		System.out.println(findUnique(arr));

	}

	public static int findUnique(int[] arr) {
		// Your code goes here

		Arrays.sort(arr);
		boolean ch = false;
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] == arr[i + 1]) {
				ch = true;

			} else if (ch == false) {
				return arr[i];
			} else {
				ch = false;
			}
		}
		return -1;
	}
}
