package lec20_LinkedList1;

public class AppendLastNtoFirst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static Node<Integer> appendLastNToFirst(Node<Integer> head, int n) {
		// Your code goes here
		if (head == null) {
			return head;
		}

		int size = 1;
		Node<Integer> temp = head;
		while (temp.next != null) {
			size++;
			temp = temp.next;
		}
		size -= n;

		temp.next = head;

		while (size > 1) {

			head = head.next;

			size--;

		}

		temp = head.next;
		head.next = null;
		return temp;

	}

}
