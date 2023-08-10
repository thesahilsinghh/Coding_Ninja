package lec11_2dArrays;

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]arr= {13 ,17 ,5 ,4 ,6};
		leaders(arr);

	}
	
	
	public static void leaders(int[] input) {
		
		if(input.length==0) {
			return;
		}
	int []ans=new int[input.length];
	int pt=0;
		for (int i = 0; i <= input.length-1; i++) {
			int j=i+1;
			while(j<input.length) {
				if(input[i]<input[j]) {
					break;
				}
				j++;
			}
			if(j==input.length) {
				ans[pt]=input[i];
				pt++;
			}
			
		}
		pt--;
		
		for (int i = pt; i >=0; i--) {
			System.out.print(ans[i]+" ");
		}
	}

}
