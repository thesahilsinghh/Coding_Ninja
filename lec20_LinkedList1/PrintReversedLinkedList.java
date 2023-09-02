package lec20_LinkedList1;

public class PrintReversedLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static void printReverse(Node<Integer> root) {
		// Your code goes here

		if (root == null) {
			return;
		}

		printReverse(root.next);
		System.out.print(root.data);

	}

}
