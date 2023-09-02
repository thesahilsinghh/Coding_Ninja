package lec21_linkedList2;

public class BubbleSortIterativeLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static Node<Integer> bubbleSort(Node<Integer> head) {
		// Your code goes here
		if (head == null || head.next == null) {
			return head;
		}

		Node<Integer> prev = head;
		Node<Integer> cur = head.next;

		int size = size(head);
		for (int i = 1; i <= size; i++) {

			for (int j = 0; cur != null && prev != null && j <= size - i; j++) {
				if (prev.data > cur.data) {
					Integer temp = prev.data;
					prev.data = cur.data;
					cur.data = temp;

				}
				prev = prev.next;
				cur = cur.next;
			}
			prev = head;
			cur = head.next;

		}
		return head;

	}

	public static int size(Node<Integer> head) {
		Node<Integer> nn = head;
		int count = 0;

		while (nn != null) {
			count++;
			nn = nn.next;
		}
		return count;

	}
}
