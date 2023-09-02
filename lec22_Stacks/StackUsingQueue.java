package lec22_Stacks;

import java.util.*;

public class StackUsingQueue<T> {

	Queue<T> q = new LinkedList<T>();
	Queue<T> q1 = new LinkedList<T>();
	int size = 0;

	private void push(T item) {
		// TODO Auto-generated method stub

		q.add(item);
		size++;

	}

	private T pop() throws StackEmptyException {
		// TODO Auto-generated method stub

		if (size == 0) {
			throw new StackEmptyException();
		}

		while (!q.isEmpty()) {
			q1.add(q.poll());
		}
		size--;
		T a = q1.poll();

		while (!q1.isEmpty()) {
			q.add(q1.poll());
		}

		return a;
	}
	
	private int size() {
		// TODO Auto-generated method stub
		return size;
	}
	
	private boolean isEmpty() {
		// TODO Auto-generated method stub
		return size==0;
	}
	
	 
	
	

}
