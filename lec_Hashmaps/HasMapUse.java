package lec_Hashmaps;

import java.util.ArrayList;
import java.util.HashMap;

public class HasMapUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		HashMap<String, Integer> map = new HashMap<>();
//
//		// adds
//		map.put("aa", 1);
//		map.put("def", 8);
//
//		// isPresent
//		System.out.println(map.containsKey("hello"));
//
//		// get
//		System.out.println(map.get("aa"));
//
//		// delete
//		map.remove("def");
//
//		// get by value
//		System.out.println(map.containsValue(1));

		int[] arr = { 1, 2, 3, 1, 1, 2, 3, 2, 7, 3, 2, 6, 3, 45, 9 };
		ArrayList<Integer> clean = removeDuplicates(arr);
		System.out.println(clean);
	}
	
public static int lengthOfLongestSubsetWithZeroSum(int arr[]) {
		
		HashMap<Integer,STRING>hp=new HashMap<>();
		int ans=0;
		int add=0;

		for(int i=0;i<arr.length;i++){

			add+=arr[i];

			if(hp.get(add)!=null){

					if(i-hp.get(add)>ans){
						ans=i-hp.get(key);
					}
			}

			hp.put(add, i);


		}
		return ans;
	}

	private static ArrayList<Integer> removeDuplicates(int[] arr) {
		// TODO Auto-generated method stub

		HashMap<Integer, Boolean> map = new HashMap<>();
		ArrayList<Integer> ans = new ArrayList<Integer>();

		for (int i = 0; i < arr.length; i++) {
			if (map.containsKey(arr[i])) {
				continue;
			}

			ans.add(arr[i]);
			map.put(arr[i], true);
		}

		return ans;
	}

	public static int maxFrequencyNumber(int[] arr) {
		HashMap<Integer, Integer> nn = new HashMap<>();

		for (int i = 0; i < arr.length; i++) {

			if (nn.containsKey(arr[i])) {
				nn.put(arr[i], nn.get(arr[i]) + 1);
				continue;
			}
			nn.put(arr[i], 1);

		}
			int i=0;
			int fr=0;
			for( int k:nn.keySet()) {
				if(nn.get(k)>fr) {
					i=k;
					fr=nn.get(k);
				}
			}
		
		return i;

	}

}
