package lec22_Stacks;

import java.util.*;

public class BracketsBalanced {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isBalanced("(()"));
	}

	public static boolean isBalanced(String expression) {
		// Your code goes here
		if (expression.length() == 0) {
			return true;
		}

		Stack<Character> st = new Stack();
		

		for (int i = 0; i < expression.length(); i++) {
			if (expression.charAt(i) == '(') {
				st.push('(');
			} else if (expression.charAt(i) == ')' &&!st.isEmpty()&&st.peek() == '(') {
				st.pop();
			} else {
				return false;
			}
		}
		if(!st.isEmpty()) {
			return false;
		}

		return true;

	}

}
