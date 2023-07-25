package lec9_Arrays;

public class IntersectionOfTwoArraysII {

	public static void main(String[] args) {
		int[]arr= {1,2,3,4};

		int[]arr1= {1,1,1,1,1};
		intersections(arr, arr1);
	}

	public static void intersections(int arr1[], int arr2[]) {

		int a = (arr1.length >= arr2.length ? 1 : 2);
		
		int[]shrt;
		int[] lng;
		if(a==1) {
			shrt=arr2;
			lng=arr1;
		}else {
			shrt=arr1;
			lng=arr2;
		}
		for (int i = 0; i < shrt.length; i++) {
				
			for (int j = 0; j < lng.length; j++) {
				
				if(shrt[i]==lng[j]) {
					System.out.print(shrt[i]+" ");
					lng[j]=-1;
					break;
				}
			}
		}
	}

}
