package lec13_TimeComplexity;

import java.util.*;

public class ArrayIntersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 6, 9, 8, 5 };
		int[] brr = { 9, 2, 4, 1, 8 };
		intersection(arr, brr);

	}

	public static void intersection(int[] arr1, int[] arr2) {

		Arrays.sort(arr1);
		Arrays.sort(arr2);

		int i = 0;
		int j = 0;
		while (i < arr1.length && j < arr2.length) {

			if (arr1[i] < arr2[j]) {
				i++;
			} else if (arr1[i] > arr2[j]) {
				j++;
			} else {
				System.out.print(arr1[i] + " ");
				i++;
				j++;
			}
		}
	}

}
