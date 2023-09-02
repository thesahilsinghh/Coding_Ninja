package lec21_linkedList2;

public class SwapTwoNodesofLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static Node<Integer> swapNodes(Node<Integer> head, int i, int j) {
		// Your code goes here

		Node<Integer> ii = null;
		Node<Integer> jj = null;

		Node<Integer> temp = head;

		while (temp != null) {

			if (i == 0) {
				ii = temp;
			}
			if (j == 0) {
				jj = temp;
			}

			i--;
			j--;
			temp = temp.next;

		}

		if (ii != null && jj != null) {
			Integer te = ii.data;
			ii.data = jj.data;
			jj.data = te;
		}
		return head;

	}

}
