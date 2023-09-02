package lec23_Queue;

import java.util.Stack;

public class QueueUsingStack<T> {

	private Stack<T> st = new Stack<T>();
	private Stack<T> st1 = new Stack<T>();
	private int size = 0;

	private void enqueue(T ss) {
		// TODO Auto-generated method stub

		if (size == 0) {
			st.push(ss);
			size++;
			return;
		}

		while (!st.isEmpty()) {

			st1.push(st.pop());

		}
		st.push(ss);

		while (!st1.isEmpty()) {

			st.push(st1.pop());

		}
		size++;

	}

	private T dequeue() throws QueueEmptyException {
		// TODO Auto-generated method stub
		if (size == 0) {
			throw new QueueEmptyException();
		}
		return st.pop();
	}

	private T top() throws QueueEmptyException {
		// TODO Auto-generated method stub
		if (size == 0) {
			throw new QueueEmptyException();
		}
		return st.peek();

	}

	private boolean isEmpty() {
		// TODO Auto-generated method stub
		return size == 0;
	}

}
