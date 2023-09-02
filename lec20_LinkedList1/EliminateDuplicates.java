package lec20_LinkedList1;

public class EliminateDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static Node<Integer> removeDuplicates(Node<Integer> head) {
		// Your code goes here

		if (head == null || head.next == null) {
			return head;
		}

		Node<Integer> temp = head;
		head = head.next;
		while (temp.next != null) {

			if (temp.data.equals(temp.next.data)) {
				temp.next = temp.next.next;
			} else {
				temp = temp.next;
			}

			// if(head.data!=temp.data){
			// temp.next=head;
			// temp=head;
			// }

			// head=head.next;
			// temp.next=null;
		}

		return head;

	}

}
