package lec21_linkedList2;

public class EvenafterOddLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static Node<Integer> evenAfterOdd(Node<Integer> head) {
		// Your code goes here

		if (head == null || head.next == null) {
			return head;
		}
		Node<Integer> temp = head;

		Node<Integer> evH = null;

		Node<Integer> evT = null;

		Node<Integer> odH = null;

		Node<Integer> odT = null;

		while (temp != null) {
			if (temp.data % 2 == 0) {
				if (evH == null) {
					evH = temp;
					evT = temp;
					temp = temp.next;
				} else {
					evT.next = temp;
					evT = evT.next;
					temp = temp.next;
				}
			} else {
				if (odH == null) {
					odH = temp;
					odT = temp;
					temp = temp.next;
				} else {
					odT.next = temp;
					odT = odT.next;
					temp = temp.next;
				}
			}

		}

		if (odH == null) {
			return evH;
		}
		if (evH == null) {
			return odH;
		}

		odT.next = evH;
		evT.next = null;

		return odH;

	}
}
