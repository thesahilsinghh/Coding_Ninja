package lec_Trie;

public class TrieUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Trie tt = new Trie();
		tt.addWord("ABE");
		tt.addWord("HELL");
		System.out.println(tt.search("A"));
		System.out.println(tt.Count());
		tt.remove("HELL");
		System.out.println(tt.search("HELL"));
		System.out.println(tt.Count());
		tt.remove("ABE");
		System.out.println(tt.search("ABE"));

		System.out.println(tt.Count());

	}

}
