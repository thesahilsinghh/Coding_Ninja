package lec13_TimeComplexity;

import java.util.Scanner;

public class FindMaximumSubarraySum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(name(arr, k));

	}

	public static int name(int[] arr, int n) {
		int ans = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			int t = 0;
			int count = 1;
			for (int j = i; j < arr.length && count <= n; j++) {
				t += arr[j];
				count++;
			}

			ans = ans > t ? ans : t;

		}
		return ans;
	}

}
