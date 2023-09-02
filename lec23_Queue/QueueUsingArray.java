package lec23_Queue;

public class QueueUsingArray {

	private int[] arr;
	private int front;
	private int rear;
	private int size;

	public QueueUsingArray() {

		arr = new int[5];
		front = -1;
		rear = -1;
		size = 0;
	}

	public QueueUsingArray(int size) {

		arr = new int[size];
		front = -1;
		rear = -1;
		size = 0;

	}

	public int size() {
		// TODO Auto-generated method stub
		return size;
	}

	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return size == 0;
	}

	public void enqueue(int data) throws QueueFullException {
		// TODO Auto-generated method stub

		if (size == arr.length) {
			doubleCapacity();
		}

		if (front == -1 && size == 0) {
			front++;
		}
//		rear++;
//		if(rear==arr.length) {
//			rear=0;
//		}
		rear = (rear + 1) % arr.length;
		arr[rear] = data;
		size++;

	}

	private void doubleCapacity() {
		// TODO Auto-generated method stub

		int[] temp = arr;
		arr = new int[temp.length * 2];

		int idx = 0;

		for (int i = front; i < temp.length; i++) {
			arr[idx++] = temp[i];
		}

		for (int i = 0; i < front; i++) {
			arr[idx++] = temp[i];
		}

		front = 0;
		rear = temp.length - 1;

	}

	public int dequeue() throws QueueEmptyException {
		// TODO Auto-generated method stub
		if (size == 0) {
			throw new QueueEmptyException();
		}
		int a = arr[front];
//		front++;
//		if(front==arr.length) {
//			front=0;
//		}
		front = (front + 1) % arr.length;

		size--;

		if (size == 0) {
			front = -1;
			rear = -1;
		}
		return a;
	}

	public int front() throws QueueEmptyException {
		// TODO Auto-generated method stub
		if (size == 0) {
			throw new QueueEmptyException();
		}
		return arr[front];
	}
}
