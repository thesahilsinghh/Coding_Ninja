package lec13_TimeComplexity;

import java.util.Arrays;

public class DuplicateInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 0, 4, 3, 4, 1, 2 };
		System.out.println(name2(arr));

	}

	public static int name(int[] arr) {
		Arrays.sort(arr);
		int st = 0;
		int ed = arr.length - 1;
		int ans = 0;
		while (st <= ed) {

			int md = (st + ed) / 2;

			if (md == arr[md]) {
				st = md + 1;
				continue;
			} else if (md > arr[md]) {
				ed = md - 1;
				ans = arr[md];
				continue;
			}
		}

		return ans;
	}

	public static int name2(int[] arr) {
		int add = 0;
		for (int i : arr) {
			add += i;
		}
		int n = arr.length;
		int x = ((n - 1) * (n - 2)) / 2;
		return add-x;
	}
}
