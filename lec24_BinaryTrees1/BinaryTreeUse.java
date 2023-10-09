package lec24_BinaryTrees1;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BinaryTreeUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//
//		BinaryTreeNode<Integer> root = new BinaryTreeNode<>(10);
//		BinaryTreeNode<Integer> leftroot = new BinaryTreeNode<>(20);
//		BinaryTreeNode<Integer> rightroot = new BinaryTreeNode<>(30);
//		root.left = leftroot;
//		root.right = rightroot;
//
//		BinaryTreeNode<Integer> l1 = new BinaryTreeNode<>(40);
//		BinaryTreeNode<Integer> r2 = new BinaryTreeNode<>(50);
//		leftroot.right = l1;
//		rightroot.left = r2;
//		printRecursive(root);

		// BinaryTreeNode<Integer> bt = takeInput1(true, 0, true);
		// printRecursive(bt);
		// System.out.println("no. of nodes:"+totalNodes(bt));

//		BalancedTreeReturn bb = isBalanced1(bt);
//		System.out.println(bb.balanced);

		BinaryTreeNode<Integer> as = InputLevelWise();
		printLevelWise(as);
	}

	public static void printLevelWise(BinaryTreeNode<Integer> root) {
		// Your code goes here

		if (root == null) {
			return;
		}

		Queue<BinaryTreeNode<Integer>> qq = new LinkedList<>();
		qq.add(root);
		qq.add(null);

		while (!qq.isEmpty()) {

			BinaryTreeNode<Integer> temp = qq.remove();
			if (temp == null) {
				if(qq.isEmpty()) {
					break;
				}
				System.out.println();
				qq.add(null);
			} else {
				System.out.print(temp.data + " ");

				if (temp.left != null) {
					qq.add(temp.left);
				}

				if (temp.right != null) {
					qq.add(temp.right);
				}

			}
		}

	}

	public static BinaryTreeNode<Integer> InputLevelWise() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Root Data");
		int rootdata = sc.nextInt();

		if (rootdata == -1) {
			return null;
		}

		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootdata);
		Queue<BinaryTreeNode<Integer>> qq = new LinkedList<BinaryTreeNode<Integer>>();
		qq.add(root);

		while (!qq.isEmpty()) {

			BinaryTreeNode<Integer> temp = qq.poll();
			System.out.println("Enter Left data of " + temp.data);
			int left = sc.nextInt();
			if (left != -1) {

				BinaryTreeNode<Integer> lt = new BinaryTreeNode<>(left);
				temp.left = lt;
				qq.add(lt);

			}

			System.out.println("Enter Right data of " + temp.data);
			int right = sc.nextInt();
			if (right != -1) {

				BinaryTreeNode<Integer> rt = new BinaryTreeNode<>(right);
				temp.right = rt;
				qq.add(rt);

			}

		}

		return root;

	}

	public static BalancedTreeReturn isBalanced1(BinaryTreeNode<Integer> root) {
		BalancedTreeReturn ans = new BalancedTreeReturn();

		if (root == null) {
			ans.height = 0;
			ans.balanced = true;
			return ans;
		}

		BalancedTreeReturn lt = isBalanced1(root.left);
		BalancedTreeReturn rt = isBalanced1(root.right);
		ans.balanced = true;
		if (Math.abs(lt.height - rt.height) > 1 || !lt.balanced || !rt.balanced) {
			ans.balanced = false;
		}
		ans.height = Math.max(rt.height, lt.height) + 1;

		return ans;

	}

	public static boolean isBalancedTree(BinaryTreeNode<Integer> root) {

		if (root == null) {
			return true;
		}

		if (Math.abs(height(root.left) - height(root.right)) > 1) {
			return false;
		}

		boolean lt = isBalancedTree(root.left);
		boolean rt = isBalancedTree(root.right);
		return lt && rt;

	}

	public static int height(BinaryTreeNode<Integer> root) {
		// TODO Auto-generated method stub
		if (root == null) {
			return 0;
		}

		int lt = height(root.left);
		int rt = height(root.right);

		return Math.max(lt, rt) + 1;
	}

	public static void printRecursive(BinaryTreeNode<Integer> root) {
		if (root == null) {
			return;
		}
		System.out.print(root.data + ":");
		if (root.left != null) {
			System.out.print("L" + root.left.data + ", ");
		}
		if (root.right != null) {
			System.out.print("R" + root.right.data);
		}
		System.out.println();
		printRecursive(root.left);
		printRecursive(root.right);
	}

	public static BinaryTreeNode<Integer> takeInput() {
		// TODO Auto-generated method stub

		System.out.print("Enter Root Data: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if (n == -1) {
			return null;
		}

		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(n);

		BinaryTreeNode<Integer> left = takeInput();
		BinaryTreeNode<Integer> right = takeInput();
		root.left = left;
		root.right = right;
		return root;

	}

	public static BinaryTreeNode<Integer> takeInput1(boolean isRoot, int root, boolean isLeft) {
		// TODO Auto-generated method stub
		if (!isRoot) {
			if (isLeft) {
				System.out.println("Enter left child of " + root);
			} else {
				System.out.println("Enter right child of " + root);
			}
		} else {

			System.out.print("Enter Root Data: ");
		}
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if (n == -1) {
			return null;
		}

		BinaryTreeNode<Integer> rr = new BinaryTreeNode<Integer>(n);

		BinaryTreeNode<Integer> left = takeInput1(false, rr.data, true);
		BinaryTreeNode<Integer> right = takeInput1(false, rr.data, false);
		rr.left = left;
		rr.right = right;
		return rr;

	}

	public static int totalNodes(BinaryTreeNode<Integer> root) {
		// TODO Auto-generated method stub
		if (root == null) {
			return 0;
		}

		int ll = totalNodes(root.left);
		int rr = totalNodes(root.right);
		return ll + rr + 1;

	}

}
