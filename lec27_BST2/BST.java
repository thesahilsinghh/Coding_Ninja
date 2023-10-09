package lec27_BST2;

class BinaryTreeNode<T> {

	T data;
	BinaryTreeNode<T> left;
	BinaryTreeNode<T> right;

	public BinaryTreeNode(T x) {
		// TODO Auto-generated constructor stub
		data = x;
	}
}

public class BST {

	BinaryTreeNode<Integer> root;
	int size;

	private void insert(int x) {
		// TODO Auto-generated method stub
		if (size == 0) {
			root = new BinaryTreeNode(x);
			size++;
			return;
		}
		inserthelper(root, x);
		size++;

	}

	private static BinaryTreeNode<Integer> inserthelper(BinaryTreeNode<Integer> root, int x) {
		// TODO Auto-generated method stub
		if (root == null) {
			BinaryTreeNode<Integer> nn = new BinaryTreeNode(x);
			return nn;

		}

		if (x <= root.data) {
			BinaryTreeNode<Integer> left = inserthelper(root.left, x);
			root.left = left;
			return root;
		} else {
			BinaryTreeNode<Integer> right = inserthelper(root.right, x);
			root.left = right;
			return root;

		}

	}

	public boolean isPresent(int x) {
		// TODO Auto-generated method stub
		return isPresentHelper(root, x);
	}

	private static boolean isPresentHelper(BinaryTreeNode<Integer> root, int x) {
		// TODO Auto-generated method stub

		if (root == null) {
			return false;
		}
		if (root.data == x) {
			return true;
		}
		if (x < root.data) {
			return isPresentHelper(root.left, x);
		} else {
			return isPresentHelper(root.right, x);
		}

	}

	private void printTree() {
		// TODO Auto-generated method stub

		printTreeHelper(root);

	}

	private void printTreeHelper(BinaryTreeNode<Integer> root) {
		// TODO Auto-generated method stub
		if (root == null) {
			return;
		}

		System.out.print(root.data + ": ");

		if (root.left != null) {
			System.out.print("Left" + root.left.data + ", ");
		}
		if (root.right != null) {
			System.out.print("Right" + root.right.data);
		}
		System.out.println();

		printTreeHelper(root.left);
		printTreeHelper(root.right);

	}

	public int getSize() {
		// TODO Auto-generated method stub
		return this.size;
	}

	public void deleteData(int x) {
		// TODO Auto-generated method stub

		this.root = deleteHelper(root, x);

	}

	private static BinaryTreeNode<Integer> deleteHelper(BinaryTreeNode<Integer> root, int x) {
		// TODO Auto-generated method stub
		if (root == null) {
			return null;
		}
		if (root.data == x) {
			return deleteNode(root);
		}

		if (x < root.data) {
			root.left = deleteHelper(root.left, x);
		} else {
			root.right = deleteHelper(root.right, x);
		}
		return root;

	}

	private static BinaryTreeNode<Integer> deleteNode(BinaryTreeNode<Integer> root) {
		// TODO Auto-generated method stub
		if (root.left == null) {
			return root.right;

		}
		if (root.right == null) {
			return root.left;
		}

		int smallright = smallest(root.right);
		root.data = smallright;
		deleteHelper(root.right, smallright);
		return root;

	}

	private static int smallest(BinaryTreeNode<Integer> root2) {
		// TODO Auto-generated method stub
		if (root2 == null) {
			return 0;
		}

		int left = smallest(root2.left);
		int right = smallest(root2.right);

		return Math.min(root2.data,Math.min(left, right));

	}
}
