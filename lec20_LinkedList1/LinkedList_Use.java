package lec20_LinkedList1;

public class LinkedList_Use {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList l1 = new LinkedList(10);
		l1.add(20);
		l1.add(30);
		l1.add(40);
		l1.add(50);
		l1.print();
//		
//		l1.takeInput();
//		l1.print();
//		
//		l1.insertNode(60, 5);
//		l1.print();
		l1.insertRecursive(22, 0);
		l1.print();
	}

}
