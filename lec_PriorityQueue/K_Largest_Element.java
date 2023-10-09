package lec_PriorityQueue;
import java.util.*;
public class K_Largest_Element {
	
	public static void main(String[] args) {
		
	}
	public static ArrayList<Integer> kLargest(int arr[], int k) {
	
		ArrayList<Integer>ans=new ArrayList<>();
		PriorityQueue<Integer>pq= new PriorityQueue<>();
		for(int i=0;i<arr.length;i++){
			pq.add(arr[i]);
		}

		for(!pq.isEmpty()){

			if(pq.peek()>k){
				ans.add(pq.peek());
			}
			pq.poll();
		}
		return ans;
		
	}
}
