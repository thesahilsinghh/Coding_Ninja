package lec21_linkedList2;

public class DeleteEveryNnodes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static Node<Integer> skipMdeleteN(Node<Integer> head, int M, int N) {
		// Your code goes here

		if (head == null || N == 0) {
			return head;
		}

		if (M == 0) {
			return null;
		}

		Node<Integer> temp = head;
		int m = 1;

		while (temp != null) {

			if (M - m == 0) {
				int n = 0;
				Node<Integer> at = temp.next;
				temp.next = null;
				while (at != null) {

					if (N - n == 0) {

						temp.next = at;
						temp = temp.next;
						m = 1;
						break;

					}
					at = at.next;
					n++;
				}
			}
			temp = temp.next;
			m++;

		}

		return head;

	}
}
