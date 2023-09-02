package lec21_linkedList2;

public class kReverse {

	public static Node<Integer> kReverse(Node<Integer> head, int k) {
		// Your code goes here
		if (head == null || k == 0 || k == 1 || head.next == null) {
			return head;
		}

		Node<Integer> ans = null;

		Node<Integer> tail = null;

		Node<Integer> start = head;

		while (start != null) {
			int kk = 1;

			Node<Integer> end = start;

			while (end.next != null && kk < k) {
				end = end.next;
				kk++;
			}
			Node<Integer> beg = null;
			if (end.next != null) {
				beg = end.next;
			}
			end.next = null;

			Node<Integer> returned = reverse(start);
			if (beg != null) {
				start.next = beg;
			}
			if (ans == null) {
				ans = returned;
			} else {
				tail.next = returned;
			}
			tail = start;
			start = beg;

		}
		return ans;

	}

	public static Node<Integer> reverse(Node<Integer> head) {
		// Your code goes here

		if (head == null || head.next == null) {
			return head;
		}
		Node<Integer> nn = reverse(head.next);
		head.next.next = head;
		head.next = null;
		return nn;

	}
}
