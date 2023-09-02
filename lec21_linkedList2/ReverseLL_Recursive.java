package lec21_linkedList2;

public class ReverseLL_Recursive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static Node<Integer> reverseRec(Node<Integer> head) {
		// Your code goes here
		if (head == null || head.next == null) {
			return head;
		}
		Node<Integer> ans = reverseRec(head.next);
		head.next.next = head;
		head.next = null;
		return ans;

	}

}
