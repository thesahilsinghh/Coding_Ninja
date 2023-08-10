package lec13_TimeComplexity;

public class ArrayEquilibriumIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]arr= {2, 3, 10, -10, 4, 2, 9};
		System.out.println(arrayEquilibriumIndex(arr));
	}
	public static int arrayEquilibriumIndex(int[] arr){  
		if(arr.length<=2) {
			return -1;
		}
		
		
		int left=arr[0];
		int rgt=0;
		
		for (int i=1;i<arr.length;i++) {
			rgt+=arr[i];
		}
		
		for (int i = 1; i < arr.length; i++) {
			rgt-=arr[i];
			if(rgt==left) {
				return i;
			}
			left+=arr[i];
		}
		return 0;
	}
}
