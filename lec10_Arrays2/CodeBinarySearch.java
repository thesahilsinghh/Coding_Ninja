package lec10_Arrays2;

public class CodeBinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int[]arr= {1, 3, 7, 9, 11, 12, 45};
			System.out.println(search(arr,45));
	}

	public static int search(int[] arr, int i) {
		// TODO Auto-generated method stub
		int lo=0;
		int hi=arr.length-1;
		
		while(lo<=hi) {
			int mid=(lo+hi)/2;
			if(arr[mid]==i) {
				return mid;
			}else if(mid<i) {
				lo=mid+1;
			}else {
				hi=mid-1;
			}
			
		}
		return -1;
	}

}
