package lec15_Recursion2;

public class QuickSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[]arr= {8,1,4,6,7,2};
		quickSort(arr, 0, arr.length-1);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}

	public static void quickSort(int[] arr, int st, int ed) {
		if (st >= ed) {
			return;
		}
		
		int pvt=swap(arr, st, ed);
		
		quickSort(arr, st, pvt-1);
		quickSort(arr, pvt+1, ed);

	}

	public static int swap(int[] arr, int st, int ed) {
		int pvt = arr[st];
		int co = 0;
		for (int i = st + 1; i <= ed; i++) {
			if (pvt > arr[i]) {
				co++;
			}
		}

		int temp = arr[st + co];
		arr[st + co] = arr[st];
		arr[st] = temp;
		
	
		int i=st;
		int j=ed;
		while(i<j) {
			if(arr[i]<pvt) {
				i++;
			}else if(arr[j]>=pvt) {
				j--;
			}else {
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
		
		return st+co;

	}

}
