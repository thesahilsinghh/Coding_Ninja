package lec_Graphs;

import java.util.Arrays;
import java.util.Scanner;

public class KrushalsAlgo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int e = sc.nextInt();

		Edge[] ed = new Edge[e];

		for (int i = 0; i < e; i++) {

			int v1 = sc.nextInt();
			int v2 = sc.nextInt();
			int w = sc.nextInt();
			Edge temp = new Edge(v1, v2, w);

			ed[i] = temp;
		}

		Edge[] al = krushalAlgo(ed, n);

		for (int i = 0; i < al.length; i++) {

			if (al[i].v1 < al[i].v2) {
				System.out.println(al[i].v1 + "--->" + al[i].v2 + " (" + al[i].weight + ")");
			} else {
				System.out.println(al[i].v2 + "--->" + al[i].v1 + " (" + al[i].weight + ")");

			}
		}

	}

	private static Edge[] krushalAlgo(Edge[] arr, int n) {

		Arrays.sort(arr);

		Edge[] mst = new Edge[n - 1];
		int[] parent = new int[n];
		for (int i = 0; i < parent.length; i++) {
			parent[i] = i;
		}
		int count = 0, i = 0;

		while (count != n - 1) {

			Edge ed = arr[i++];

			int v1 = ed.v1;
			int v2 = ed.v2;

			int p1 = findParent(v1, parent);
			int p2 = findParent(v2, parent);

			if (p1 != p2) {
				mst[count] = ed;
				parent[p1] = p2;
				count++;
			}

		}

		return mst;

	}

	private static int findParent(int v1, int[] parent) {

		if (v1 == parent[v1])
			return v1;

		return findParent(parent[v1], parent);
	}

}

class Edge implements Comparable<Edge> {

	int v1;
	int v2;
	int weight;

	Edge(int v1, int v2, int w) {
		this.v1 = v1;
		this.v2 = v2;
		this.weight = w;
	}

	@Override
	public int compareTo(Edge o) {

		return this.weight - o.weight;

	}

}
