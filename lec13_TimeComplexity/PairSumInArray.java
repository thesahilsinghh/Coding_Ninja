package lec13_TimeComplexity;

import java.util.Arrays;

public class PairSumInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 2,2,2,2 };
		System.out.println(Pairr(arr, 4));

	}

	public static int pairSum(int[] arr, int num) {
		// Your code goes here

		// &&arr[j]==arr[j-1]

		Arrays.sort(arr);

		int i = 0;
		int j = arr.length - 1;
		int count = 0;

		int ic = 1;
		int jc = 1;
		while (i < j) {

			if (arr[i] == arr[i + 1] && arr[j] + arr[i] == num) {
				ic++;
				i++;

			} else if (arr[j] == arr[j - 1] && arr[j] + arr[i] == num) {
				jc++;
				j--;

			} else {
				count += ic * jc;
				ic = 1;
				jc = 1;
				i++;
				j--;
			}

		}
		if (ic > 1) {
			ic *= 2;
			count += ic;
		} else if (jc > 1) {
			jc += 2;
			count += jc;
		}

		return count;
	}

	public static int Pairr(int[] arr, int t) {

		  Arrays.sort(arr);

	        int i = 0;
	        int j = arr.length - 1;
	        int count = 0;

	        while (i < j) {
	            if (arr[i] + arr[j] == t) {
	                if (arr[i] == arr[j]) {
	                    int n = j - i + 1;
	                    count += (n * (n - 1)) / 2; // Combination formula for duplicates
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

	        return count;
	}

}
