package lec23_Queue;

public class ReverseTheFirstKElementsQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static Queue<Integer> reverseKElements(Queue<Integer> input, int k) {
		// Your code goes here

		if (input.isEmpty() || k == 0 || k == 1) {
			return input;
		}

		Queue<Integer> ans = new LinkedList<>();
		k = k % input.size();
		Stack<Integer> st = new Stack<>();
		while (k > 0) {
			st.push(input.poll());
			k--;
		}
		while (!st.isEmpty()) {
			ans.add(st.pop());
		}

		while (!input.isEmpty()) {
			ans.add(input.poll());
		}
		return ans;

	}

}
