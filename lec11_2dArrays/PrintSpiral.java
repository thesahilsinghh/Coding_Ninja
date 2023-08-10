package lec11_2dArrays;

public class PrintSpiral {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
	}
		public static void spiralPrint(int arr[][]){
			//Your code goes here
			
			int minr = 0;
			int minc = 0;
			int maxr = arr.length - 1;
			int maxc = arr[0].length - 1;
			int total_ele = arr.length * arr[0].length;
			int count = 0;
			while (count < total_ele) {
				for (int i = minc; i <= maxc && count < total_ele; i++) {
					System.out.print(arr[minr][i] + ",");
					count++;

				}
				minr++;
				for (int i = minr; i <= maxr && count < total_ele; i++) {
					System.out.print(arr[i][maxc] + ",");
					count++;
				}
				maxc--;
				for (int i = maxc; i >= minc && count < total_ele; i--) {
					System.out.print(arr[maxr][i]+",");
					count++;
				}
				maxr--;
				for (int i = maxr; i >= minr && count < total_ele; i--) {
					System.out.print(arr[i][minc]+",");
					count++;
				}
				minc++;

			}

		

	}

}
