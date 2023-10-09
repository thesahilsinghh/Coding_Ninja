package lec_PriorityQueue;

import java.util.ArrayList;

public class Priority_Queue<T> {

	private ArrayList<Element<T>> heap;

	public Priority_Queue() {

		heap = new ArrayList<>();
	}

	// returns size
	public int size() {

		return heap.size();

	}

	// return is empty
	public boolean isEmpty() {

		return heap.isEmpty();
	}

	// insertion in priority queue
	public void insert(T val, int priority) {
		Element<T> nn = new Element<>(val, priority);
		heap.add(nn);

		int idx = heap.size() - 1;
		int parent = (idx - 1) / 2;
		while (idx > 0 && heap.get(idx).priority < heap.get(parent).priority) {

			Element<T> temp = heap.get(idx);
			heap.set(idx, heap.get(parent));
			heap.set(parent, temp);

			idx = parent;
			parent = (idx - 1) / 2;

		}

	}

	// returns min priority value in queue
	public int getMin() {

		if (heap.isEmpty()) {
			System.out.println("Empty Queue");
			return -1;
		}

		return heap.get(0).priority;
	}

	// deletes minimum value ans returns it
	public T removeMin() {

		T data = heap.get(0).value;
		heap.set(0, heap.get(heap.size() - 1));
		heap.remove(heap.size() - 1);
		int idx = 0;
		int child = 2 * idx;
		while (idx < heap.size() - 1&&child<heap.size()-2) {

			
			
			if (heap.get(idx).priority > heap.get(child + 1).priority
					|| heap.get(idx).priority > heap.get(child + 2).priority) {

				child = heap.get(child + 2).priority > heap.get(child + 1).priority ? child + 1 : child + 2;
				Element<T> temp = heap.get(idx);
				heap.set(idx, heap.get(child));
				heap.set(child, temp);

				idx = child;
				child = idx * 2;
			}
		}
		return data;

	}
}
