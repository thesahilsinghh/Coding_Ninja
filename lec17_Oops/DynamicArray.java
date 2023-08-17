package lec17_Oops;

public class DynamicArray {
	private int[] arr;
	private int idx = 0;

	public DynamicArray() {
		this.arr = new int[5];
	}

	// size
	public int size() {
		return idx;
	}
	
	

	// isEmpty
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return idx == 0;
	}

	// add
	public void add(int x) {

		if (idx == arr.length) {
			expand();
		}

		arr[idx] = x;
		this.idx++;
	}

	private void expand() {
		int[] arr1 = new int[this.arr.length * 2];

		for (int i = 0; i < this.arr.length; i++) {
			arr1[i] = this.arr[i];
		}
		this.arr = arr1;
	}

	// get
	public int get(int i) {
		if (i >= idx) {
			System.out.println("idx out of bound");
			return 0;
		}
		return this.arr[i];
	}

	// set
	public void set(int i, int val) {

		if (i > idx) {
			System.out.println("idx out of bound");
			return;
		}
		this.arr[i] = val;
	}

	public void print() {
		for (int i = 0; i < idx; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	// removeLast
	public int removeLast() {
		if(idx==0) {
			return -1;
		}
		idx--;
		int a = this.arr[idx];
		this.arr[idx] = 0;
		return a;

	}
}
