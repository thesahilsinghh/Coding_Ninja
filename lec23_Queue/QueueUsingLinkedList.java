package lec23_Queue;

import lec20_LinkedList1.Node;

public class QueueUsingLinkedList {
	private Node front;
	private Node tail;
	private int size;

	public int size() {
		// TODO Auto-generated method stub
		return size;
	}

	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return size == 0;
	}

	public void enqueue(int item) {
		// TODO Auto-generated method stub
		if (size == 0) {
			Node nn = new Node();
			nn.data = item;
			front = nn;
			tail = nn;
			size++;
			return;
		}

		Node nn = new Node();
		nn.data = item;
		tail.next = nn;
		tail = tail.next;
		size++;
	}

	public int front() throws QueueEmptyException {
		// TODO Auto-generated method stub
		if (size == 0) {
			throw new QueueEmptyException();
		}
		return front.data;
	}

	public int dequeue() throws QueueEmptyException {
		// TODO Auto-generated method stub

		if (size == 0) {
			throw new QueueEmptyException();
		}
		int a = front.data;
		front = front.next;
		if(front==null) {
			tail=null;
		}
		size--;
		return a;
	}
}
