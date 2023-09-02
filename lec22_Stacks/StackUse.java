package lec22_Stacks;

public class StackUse {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
//
//		StacksUsingArrays ss = new StacksUsingArrays();
//		ss.push(10);
//		ss.push(20);
//		ss.push(30);
//		ss.push(40);
//		ss.push(50);
//		ss.push(60);
//		ss.push(70);
//		ss.push(80);
//		ss.push(90);
//
//		System.out.println(ss.pop());
//		System.out.println(ss.pop());
//		System.out.println(ss.pop());
//		System.out.println(ss.pop());
//		System.out.println(ss.pop());
//		System.out.println(ss.pop());
//		System.out.println(ss.pop());
//		System.out.println(ss.pop());
//		System.out.println(ss.pop());
//		
//		
//		//ss.push(90);
//		//System.out.println(ss.top());
//		ss.isEmpty();
//		System.out.println(ss.size());
//		
		
		
		StackzUsingLL ll= new StackzUsingLL();
		
		ll.push(10);
		ll.push(20);
		System.out.println(ll.pop());
		ll.push(23);
		System.out.println(ll.top());
		System.out.println(ll.isEmpty());
	
		System.out.println(ll.pop());
		System.out.println(ll.pop());
//		System.out.println(ll.pop());
		System.out.println(ll.isEmpty());
		
		
	}

}
