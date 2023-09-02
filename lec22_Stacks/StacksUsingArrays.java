package lec22_Stacks;

public class StacksUsingArrays {

	private int[] arr;
	private int size;

	public StacksUsingArrays() {
		arr = new int[2];
		size = 0;

	}

	public void push(int data) throws StackFullException {
		// TODO Auto-generated method stub
		
		if(size==arr.length) {
			doubleCapacity();
		}
		this.arr[size] = data;
		this.size++;
	}

	private void doubleCapacity() {
				
		System.out.println("cccc");
		int[] temp=new int[this.arr.length*2];
		
		for (int i = 0; i < arr.length; i++){
			temp[i]=arr[i];
		}
		this.arr=temp;
		
	}

	public int pop() throws StackEmptyException {
		if(size==0) {
			throw new StackEmptyException();
				
		}
		
		size--;
		return arr[size];
	}
	
	public int top() throws StackEmptyException {
		// TODO Auto-generated method stub
		if(size==0) {
			throw new StackEmptyException();
		
		}
		return arr[size-1];
	}
	
	public void isEmpty() {
		// TODO Auto-generated method stub
		System.out.println(size==0);
	}
	
	public int size() {
		// TODO Auto-generated method stub
		return this.size;
	}
	
	

}
