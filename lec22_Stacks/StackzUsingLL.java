package lec22_Stacks;

import lec20_LinkedList1.Node;

public class StackzUsingLL {

	private Node nn = new Node();
	private int size = 0;

	public int pop() throws StackEmptyException {
		// TODO Auto-generated method stub
		if (size == 0) {
			throw new StackEmptyException();
		}

		int data = nn.data;
		nn = nn.next;
		size--;
		return data;

	}

	public void push(int data) {
		// TODO Auto-generated method stub

		Node tmp = new Node();
		tmp.data = data;
		tmp.next = nn;
		nn = tmp;
		size++;

	}

	public int size() {
		// TODO Auto-generated method stub

		return size;
	}

	public int top() {
		// TODO Auto-generated method stub
		return nn.data;
	}

	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return size == 0;
	}
}
