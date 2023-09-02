package lec20_LinkedList1;

import java.util.Scanner;

public class LinkedList {

	Node head;
	Node tail;

	public class Node {

		int data;
		Node next;

		Node(int data) {
			this.data = data;
		}
	}

	public LinkedList(int a) {

		Node n1 = new Node(a);
		this.head = n1;
		this.tail = n1;
	}

	public void add(int a) {
		Node n1 = new Node(a);

		this.tail.next = n1;
		this.tail = this.tail.next;

	}

	public void print() {
		// TODO Auto-generated method stub
		Node n1 = head;
		while (n1 != null) {
			System.out.print(n1.data + " ");
			n1 = n1.next;
		}
		System.out.println();
	}

	public void takeInput() {

		Scanner sc = new Scanner(System.in);
		int data = sc.nextInt();
		while (data != -1) {
			Node n = new Node(data);
			tail.next = n;
			tail = tail.next;

			data = sc.nextInt();

		}

	}

	public void insertNode(int data, int idx) {
		Node put = new Node(data);

		Node temp = head;
		while (idx > 1) {
			temp = temp.next;
			idx--;
		}
		Node nn = temp.next;
		temp.next = put;
		put.next = nn;

	}

	public void insertRecursive(int data, int idx) {

		Node t = insert(this.head, data, idx);
		this.head = t;
	}

	private Node insert(Node head, int data, int idx) {

		if (idx == 0) {

			Node temp = new Node(data);
			temp.next = head;
			return temp;
		}
		if (head == null)
			return head;

		Node nn = insert(head.next, data, idx - 1);
		head.next = nn;
		return head;

	}

	public static Node midPoint(Node head) {
		// Your code goes here

		Node slow = head;
		Node fast = head;
		while (fast != null && fast.next != null && fast.next.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}

		return slow;

	}

}