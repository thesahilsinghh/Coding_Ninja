package lec20_LinkedList1;

public class FindNodeinLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static int findNode(Node<Integer> head, int n) {
		// Write your code here.
	int idx=0;
		while(head!=null){

			if(head.data==n){
			return idx;	
			}

			idx++;
			head=head.next;
		}
		return -1;
	}

}
