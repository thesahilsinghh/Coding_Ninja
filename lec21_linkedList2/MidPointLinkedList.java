package lec21_linkedList2;

public class MidPointLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	 public static Node<Integer> midPoint(Node<Integer> head) {
	        //Your code goes here



	        Node <Integer>slow=head;
	        Node <Integer>fast=head;
	        while(fast!=null&&fast.next!=null&&fast.next.next!=null){
	            slow=slow.next;
	            fast=fast.next.next;
	        }

	        return slow;

	    }

}
