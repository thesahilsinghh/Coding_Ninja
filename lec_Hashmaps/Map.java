package lec_Hashmaps;

import java.util.ArrayList;

public class Map<K, V> {

	ArrayList<HashNode> bucket;
	int count;
	int totalBuckets;

	public Map() {

		bucket = new ArrayList<>();
		totalBuckets = 20;
		for (int i = 0; i < totalBuckets; i++) {
			bucket.add(null);
		}
	}

	public void insert(K key, V value) {

		int idx = getindx(key);

		HashNode<K, V> head = bucket.get(idx);

		while (head != null) {

			if (head.key.equals(key)) {
				head.value = value;
				return;
			}
			head = head.next;
		}

		head = bucket.get(idx);
		HashNode<K, V> newNode = new HashNode<>(key, value);
		newNode.next = head;
		bucket.set(idx, newNode);

	}

	public V getValue(K key) {

		int idx = getindx(key);

		HashNode<K, V> head = bucket.get(idx);

		while (head != null) {
			if (head.key.equals(key)) {

				return head.value;
			}
			head = head.next;

		}
		return null;
	}

	public V removeKey(K key) {
		int idx = getindx(key);

		HashNode<K, V> head = bucket.get(idx);
		HashNode<K, V> prev = null;

		while (head != null) {
			if (head.key.equals(key)) {

				if (prev == null) {
					bucket.set(idx, head.next);
				} else {
					prev.next = head.next;
				}

				return head.value;
			}
			head = head.next;

		}

		return null;

	}

	private int getindx(K key) {

		int hc = key.hashCode();
		hc %= totalBuckets;
		return hc;
	}

}
