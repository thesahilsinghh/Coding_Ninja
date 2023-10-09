package lec_Trie;

class TrieNode {

	char data;
	boolean isWord;
	TrieNode[] children;
	int childCount;

	public TrieNode(char data) {
		this.data = data;
		isWord = false;
		children = new TrieNode[26];
		childCount = 0;
	}

}

public class Trie {

	private TrieNode root;
	private int totWords;

	public Trie() {
		totWords = 0;
		root = new TrieNode('\0');
	}

	public void addWord(String data) {

		addWordHelper(root, data);
		totWords++;

	}

	private void addWordHelper(TrieNode root, String data) {

		if (data.length() == 0) {
			root.isWord = true;
			return;
		}

		int idx = data.charAt(0) - 'A';
		TrieNode child = root.children[idx];

		if (child == null) {
			child = new TrieNode(data.charAt(0));
			root.children[idx] = child;
			root.childCount++;
		}

		addWordHelper(child, data.substring(1));

	}

	public boolean search(String str) {
		// TODO Auto-generated method stub

		return searchHelper(root, str);
	}

	private boolean searchHelper(TrieNode root, String str) {

		if (str.length() == 0) {
			return root.isWord;
		}

		int idx = str.charAt(0) - 'A';
		TrieNode child = root.children[idx];
		if (child == null) {
			return false;
		}

		return searchHelper(child, str.substring(1));
	}

	public void remove(String str) {
		// TODO Auto-generated method stub

		if (removeHelper(root, str)) {
			totWords--;
		}

	}

	private boolean removeHelper(TrieNode root, String str) {
		// TODO Auto-generated method stub
		if (str.length() == 0) {
			if (root.isWord) {
				root.isWord = false;
				return true;
			} else {
				return false;
			}
		}

		int idx = str.charAt(0) - 'A';
		TrieNode child = root.children[idx];
		if (child == null) {
			return false;
		}

		boolean ans = removeHelper(child, str.substring(1));

		if (!root.isWord && root.childCount == 0) {
			root.children[idx] = null;
			child = null;
			root.childCount--;
		}
		return ans;

	}

	public int Count() {
		return totWords;
	}

}
