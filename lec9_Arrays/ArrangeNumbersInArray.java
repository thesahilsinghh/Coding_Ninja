package lec9_Arrays;

public class ArrangeNumbersInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				int[] arr = new int[9];
				arrange(arr, 9);
			}

			public static void arrange(int[] arr, int n) {

				int a = 1;
				int i = 0;
				while (a <= n) {
					arr[i] = a;
					a += 2;
					i++;
				}
				if (n % 2 == 0) {
					a = n;
				} else {
					a=n-1;
				}

				while (i < arr.length) {
					arr[i] = a;
					a -= 2;
					i++;
				}

				for (int j = 0; j < arr.length; j++) {
					System.out.print(arr[j]);
				}

	}

}
