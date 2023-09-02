package lec23_Queue;

import java.util.Iterator;

public class QueueUse {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		QueueUsingArray qq = new QueueUsingArray();
		int[]arr= {1,2,3,4,5,10,29};
		
		for(int d:arr) {
			qq.enqueue(d);
		}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(qq.dequeue());
		}
		qq.enqueue(20);
		qq.enqueue(30);
		System.out.println(qq.dequeue());
		System.out.println(qq.dequeue());
	}

}
