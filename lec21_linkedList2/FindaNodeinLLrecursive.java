package lec21_linkedList2;

public class FindaNodeinLLrecursive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static int findNodeRec(Node<Integer> head, int n) {
		// Your code goes here

		if (head == null) {
			return -1;
		}

		if (head.data == n) {
			return 0;
		}

		int a = findNodeRec(head.next, n);
		if (a == -1) {
			return -1;
		}
		return a + 1;

	}

}
