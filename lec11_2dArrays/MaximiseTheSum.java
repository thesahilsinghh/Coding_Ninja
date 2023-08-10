package lec11_2dArrays;

public class MaximiseTheSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int[]arr= {1, 5 ,10 ,15 ,20, 25};
		int[]brr= {};
		System.out.println(maximumSumPath(arr, brr));
		


	}

	public static int max(int a, int b) {
		return a > b ? a : b;
	}

	public static long maximumSumPath(int[] input1, int[] input2) {

		int maxsum = 0;
		int a = 0;
		int b = 0;

		int i = 0;
		int j = 0;
		while (i < input1.length && j < input2.length) {

			if (input1[i] < input2[j]) {
				a += input1[i];
				i++;
			} else if (input1[i] > input2[j]) {
				b += input2[j];
				j++;
			} else {
				a += input1[i];
				i++;

				b += input2[j];
				j++;

				maxsum += max(a, b);
				a = 0;
				b = 0;
			}

		}
		while(i < input1.length) {
			a+= input1[i];
			i++;
		}
		while(j < input2.length) {
			b+= input1[j];
			j++;
		}
		
		maxsum += max(a, b);
		return maxsum;

	}

}
