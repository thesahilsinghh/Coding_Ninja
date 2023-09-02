package lec21_linkedList2;

public class MergeTwoSortedLL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static Node<Integer> mergeTwoSorteds(Node<Integer> h1, Node<Integer> h2) {
		// Your code goes here

		if (h1 == null || h2 == null)
			return h1;
		Node<Integer> head1 = h1;

		Node<Integer> head2 = h2;

		Node<Integer> head, tail;

		if (head1.data <= head2.data) {
			head = head1;
			tail = head;
			head1 = head1.next;
		} else {
			head = head2;
			tail = head;
			head2 = head2.next;

		}
		while (head1 != null && head2 != null) {

			if (head1.data <= head2.data) {
				tail.next = head1;
				tail = head1;
				head1 = head1.next;
			} else {
				tail.next = head2;
				tail = head2;
				head2 = head2.next;
			}

		}

		if (head1 != null) {

		}
		if (head2 != null) {
			tail.next = head2;

		}

		return head;

	}

}
