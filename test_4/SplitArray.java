package test_4;

import java.util.Arrays;

public class SplitArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 2, 3, 4 };
		System.out.println(canSplitArray(arr));

	}

	public static boolean splitArray(int arr[]) {
		int five = 0;
		int three = 0;
		int[] li = new int[arr.length];
		int idx = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 5 == 0) {
				five += arr[i];
			} else {
				three += arr[i];
				li[idx] = arr[i];
				idx++;
			}
		}

		if (five == three) {
			return true;

		}
		if (five >= three) {
			return false;

		}
		idx = li.length - 1;

		while (idx >= 0) {

			five += li[idx];
			three -= li[idx];

			if (five == three) {
				return true;
			}

			else if (three < five) {

				five -= li[idx];
				three += li[idx];
				idx--;
			} else {
				idx--;
			}

		}
		return false;
	}

	public static boolean canSplitArray(int[] arr) {
		int sumGroup5 = 0;
        int sumGroup3 = 0;

        for (int num : arr) {
            if (num % 5 == 0 && num % 3 != 0) {
                sumGroup5 += num;
            } else if (num % 3 == 0 && num % 5 != 0) {
                sumGroup3 += num;
            }
        }

        int sumRemaining = 0;
        for (int num : arr) {
            if (num % 5 != 0 && num % 3 != 0) {
                sumRemaining += num;
            }
        }

        return sumGroup5 == sumGroup3 + sumRemaining;
     }

}
