package lec23_Queue;

public class ReverseQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static void reverseQueue(Queue<Integer> input) {
		// Your code goes here
		if (input.isEmpty()) {
			return;
		}

		Stack<Integer> st = new Stack<>();

		while (!input.isEmpty()) {
			st.push(input.poll());
		}

		while (!st.isEmpty()) {
			input.add(st.pop());
		}

	}
}
