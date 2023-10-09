package trees;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class TreeUse {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//
//		TreeNode<Integer> root = new TreeNode<Integer>(4);
//		TreeNode<Integer> two = new TreeNode<Integer>(2);
//		TreeNode<Integer> three = new TreeNode<Integer>(3);
//		TreeNode<Integer> one = new TreeNode<Integer>(1);
//		TreeNode<Integer> five = new TreeNode<Integer>(5);
//		TreeNode<Integer> six = new TreeNode<Integer>(6);
//
//		root.children.add(two);
//		root.children.add(three);
//		root.children.add(one);
//		three.children.add(five);
//		three.children.add(six);

		TreeNode<Integer> root = inputRecursive();
		print(root);
		// System.out.println(TotalNodes(root));

	}

	public static void print(TreeNode<Integer> root) {
		// TODO Auto-generated method stub

		if (root == null) {
			return;
		}

		System.out.print(root.data + ": ");
		for (int i = 0; i < root.children.size(); i++) {
			System.out.print(root.children.get(i).data + " ");
		}
		System.out.println();
		for (int i = 0; i < root.children.size(); i++) {
			print(root.children.get(i));
		}

	}

	public static TreeNode<Integer> inputRecursive() {

		System.out.println("Enter Node data");
		int n = sc.nextInt();
		if (n == -1) {
			return null;
		}
		TreeNode<Integer> root = new TreeNode<Integer>(n);
		System.out.println("No. of children");
		int tot = sc.nextInt();
		for (int i = 0; i < tot; i++) {
			System.out.println("Children data");
			TreeNode<Integer> nn = new TreeNode<Integer>(sc.nextInt());
			root.children.add(nn);
		}
		for (int i = 0; i < root.children.size(); i++) {
			root.children.get(i).children.add(inputRecursive());
		}
		return root;

	}

	public static TreeNode<Integer> LevelWiseInput() {

		System.out.println("Enter Root data");
		int n = sc.nextInt();
		if (n == -1)
			return null;
		TreeNode<Integer> root = new TreeNode<Integer>(n);
		Queue<TreeNode<Integer>> qq = new LinkedList<TreeNode<Integer>>();
		qq.add(root);

		while (!qq.isEmpty()) {

			TreeNode<Integer> temp = qq.poll();
			System.out.println(temp.data + " no. of children");
			int tot = sc.nextInt();
			for (int i = 0; i < tot; i++) {
				System.out.println("enter child of " + temp.data);
				int x = sc.nextInt();
				TreeNode<Integer> child = new TreeNode<Integer>(x);
				temp.children.add(child);
				qq.add(child);

			}

		}
		return root;

	}

	public static int TotalNodes(TreeNode<Integer> root) {

		if (root == null) {
			return 0;
		}

		int sum = 1;

		for (int i = 0; i < root.children.size(); i++) {
			int n = TotalNodes(root.children.get(i));
			sum += n;
		}
		return sum;
	}

	public static void printLevelWise(TreeNode<Integer> root) {
		if (root == null) {
			return;
		}

		Queue<TreeNode<Integer>> qq = new LinkedList<>();
		System.out.println(root.data);
		qq.add(root);
		while (!qq.isEmpty()) {

			TreeNode<Integer> temp = qq.remove();
			for (int i = 0; i < temp.children.size(); i++) {
				System.out.print(temp.children.get(i).data + " ");
				qq.add(temp.children.get(i));

			}
			System.out.println();

		}
	}

}
