package lec24_BinaryTrees1;

import java.util.Iterator;

public class ConstructTreeUsingInorderandPreorder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static BinaryTreeNode<Integer> buildTree(int[] preOrder, int[] inOrder) {
		// Your code goes here

		if (preOrder == null || inOrder == null) {
			return null;
		}

		// find the root el
		int i = 0;
		for (; i < inOrder.length; i++) {
			if (preOrder[0] == inOrder[i]) {
				break;
			}
		}
		//root
		BinaryTreeNode<Integer>root=new BinaryTreeNode<Integer>(inOrder[i]);
		
		
		
		
		
		
		// inorder
		int[] InLeft = new int[i];
		for (int j = 0; j < InLeft.length; j++) {
			InLeft[j] = inOrder[j];
		}
		
		int k=i+1;
		int[] InRight = new int[inOrder.length - i - 1];
		for (int j = 0; j < InRight.length; j++) {
			InRight[j] = inOrder[k++];
		}

		// Preoder
			
		for (k = 0; k < preOrder.length; k++) {
			if(preOrder[k]==inOrder[i-1]) {
				break;
			}
		}
		int[] preOleft = new int[k];
		for (int j = 0; j < preOleft.length; j++) {
			preOleft[j] = preOrder[j + 1];
		}
		int[] preOright = new int[InRight.length];
		for (int j = 0; j < preOright.length; j++) {
			preOright[j] = preOrder[preOrder.length / 2 + (1+j)];
		}
		
		BinaryTreeNode<Integer>left=buildTree(preOleft, InLeft);
		BinaryTreeNode<Integer>right=buildTree(preOright, InRight);
		
		root.left=left;
		root.right=right;
		return root;
	
	}

}
