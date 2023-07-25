package lec9_Arrays;

public class PairSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]arr= {1, 3, 6, 2, 5, 4, 3, 2, 4};
		System.out.println(pairSum(arr, 7));

	}
	
    public static int pairSum(int arr[], int x) {
    int ans=0;
    	for (int i = 0; i < arr.length-1; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if(arr[i]+arr[j]==x) {
					ans++;
				}
			}
		}
    	return ans;
    }

}
