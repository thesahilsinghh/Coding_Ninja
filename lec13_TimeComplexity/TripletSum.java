package lec13_TimeComplexity;

import java.util.Arrays;

public class TripletSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
		System.out.println(pairSum(arr, 12));
	}

	public static int pairSum(int[] arr, int num) {

		Arrays.sort(arr);
		int count = 0;
		for (int st = 0; st < arr.length - 2; st++) {

			int i = st + 1;
			int j = arr.length - 1;
			int t = num - arr[st];

			while (i < j) {

				if (arr[i] + arr[j] == t) {

					if (arr[i] == arr[j]) {

						int n = j - i + 1;
						count += (n * (n - 1)) / 2;
						break;

					} else {

						int ic = 1;
						int il = i;

						while (il < j && arr[il] == arr[il + 1]) {
							ic++;
							il++;
						}

						int jc = 1;
						int jl = j;

						while (jl > i && arr[jl] == arr[jl - 1]) {
							jc++;
							jl--;
						}

						count += ic * jc;
						i = il + 1;
						j = jl - 1;

					}

				} else if (arr[i] + arr[j] > t) {
					j--;
				} else {
					i++;
				}

			}
		}
		return count;
	}
}
