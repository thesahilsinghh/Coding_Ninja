package lec20_LinkedList1;

public class PalindromeLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static boolean isPalindrome(Node<Integer> head) {
		// Your code goes here
		if (head == null) {
			return true;
		}

		int size = 1;

		Node<Integer> temp = head;
		while (temp != null) {
			temp = temp.next;
			size++;
		}

		temp = head;
		size /= 2;
		while (size >= 1) {

			temp = temp.next;
			size--;

		}

		temp = reverse(temp);

		while (temp != null && head != null) {

			if (temp.data != head.data) {

				return false;

			}

			temp = temp.next;
			head = head.next;

		}
		return true;

	}

	public static Node<Integer> reverse(Node<Integer> head) {

		if (head == null || head.next == null) {
			return head;
		}

		Node<Integer> nn = reverse(head.next);
		head.next.next = head;
		head.next = null;
		return nn;

	}
}
