package lec22_Stacks;

public class MinimumBracketReversal {
	public static int countBracketReversals(String input) {
		// Your code goes here

		if (input.length() % 2 != 0) {
			return -1;
		}

		Stack<Character> st = new Stack<>();
		int count = 0;

		for (int i = 0; i < input.length(); i++) {

			if (input.charAt(i) == '{') {
				st.push('{');
			} else if (!st.isEmpty() && st.peek() == '{') {
				st.pop();

			} else {
				st.push(input.charAt(i));
			}
		}

		while (!st.isEmpty()) {
			Character c1 = st.pop();
			Character c2 = st.pop();

			if (c1 == c2) {
				count++;
			} else {
				count += 2;
			}
		}

		return count;

	}
}
