package lec_PriorityQueue;

public class PriorityQueue_Use {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Priority_Queue<String> hh = new Priority_Queue<>();
//
//		System.out.println(hh.isEmpty());
//		System.out.println(hh.size());
//
//		System.out.println(hh.getMin());
//
//		hh.insert("a", 2);
//		hh.insert("b", 3);
//		hh.insert("c", 4);
//		hh.insert("d", 5);
//		hh.insert("e", 6);
//
//		System.out.println(hh.isEmpty());
//		System.out.println(hh.size());
//
//		System.out.println(hh.getMin());
//		hh.insert("z", 1);
//		System.out.println(hh.isEmpty());
//		System.out.println(hh.size());
//
//		System.out.println(hh.getMin());
//		System.out.println("------------------------------------------------");
//		while (!hh.isEmpty()) {
//			System.out.println(hh.getMin());
//			hh.removeMin();
//		}

		int[] arr = {1,2,3,4,5,6,7,8,9 };

		heapsort(arr);

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	private static void heapify(int[]arr,int n) {
		// TODO Auto-generated method stub
		for (int j = 1; j <= n; j++) {

			int child = j;
			int parent = (child - 1) / 2;

			while (child > 0 && arr[child] < arr[parent]) {
				int temp = arr[child];
				arr[child] = arr[parent];
				arr[parent] = temp;

				child = parent;
				parent = (parent - 1) / 2;
			}

		}

	}

	public static void heapsort(int[] arr) {
		
		heapify(arr, arr.length-1);
		

		int ei = arr.length - 1;

		while (ei >= 0) {

			int temp = arr[0];
			arr[0] = arr[ei];
			arr[ei] = temp;
			ei--;
			heapify(arr, ei);
		}
	}

}
