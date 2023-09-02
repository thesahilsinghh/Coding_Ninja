package lec21_linkedList2;

public class DeleteNodeRecursively {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static Node<Integer> deleteNodeRec(Node<Integer> head, int pos) {
    	//Your code goes here
        if(head==null){
            return head;
        }
        if(pos==0){
            return head.next;
        }
        head.next=deleteNodeRec(head.next, pos-1);
        return head;




	}

}
