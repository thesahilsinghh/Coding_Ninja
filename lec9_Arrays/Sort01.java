package lec9_Arrays;

public class Sort01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[]arr= {1,0,0,0,1,0};
		sortZeroesAndOne(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}

	}
	  public static void sortZeroesAndOne(int[] arr) {
	    	//Your code goes here
		  
		  for (int i = 0; i < arr.length; i++) {
			if(arr[i]==0) {
				continue;
				
			}
			boolean check=false;
			for (int j = i+1; j < arr.length; j++) {
				if(arr[j]==0) {
					arr[i]=0;
					arr[j]=1;
					check=false;
					break;
				}
				check=true;
				
			}
			
			if(check){
				return;
			}
		}
	    }
}
