package lec22_Stacks;

public class ReverseStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static void reverseStack(Stack<Integer> input, Stack<Integer> extra) {
		// Your code goes here
		if (input.isEmpty()) {
			return;
		}

		int temp = input.pop();
		extra = reverse(input, extra);
		input.push(temp);
		while (!extra.isEmpty()) {
			input.push(extra.pop());
		}
		return;

	}

	public static Stack<Integer> reverse(Stack<Integer> input, Stack<Integer> extra) {
		if (input.isEmpty()) {
			return extra;
		}

		Integer tt = input.pop();
		Stack<Integer> temp = reverse(input, extra);
		extra.push(tt);
		return extra;

	}
}
