package lec_Graphs;

import java.util.*;
import java.util.Scanner;

public class AdjacencyMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int[][] mat = new int[n][n];

		int e = sc.nextInt();

		for (int i = 0; i < e; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			mat[a][b] = 1;
			mat[b][a] = 1;
		}

		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat.length; j++) {
				System.out.print(mat[i][j]);
			}
			System.out.println();
		}
		HashMap<Integer, Boolean> map = new HashMap<Integer, Boolean>();
		dfs(map, mat, 0);

	}

	private static void dfs(HashMap<Integer, Boolean> map, int[][] arr, int i) {

		if (map.containsKey(i))
			return;

		System.out.println(i);
		map.put(i, true);

		for (int j2 = 0; j2 < arr[0].length; j2++) {
			if (arr[i][j2] == 1) {
				dfs(map, arr, j2);
			}
		}

	}

	private static ArrayList<Integer> dfs(int[][] arr, boolean[] aa, int i, int j) {

		if (i == j) {
			ArrayList<Integer> nn = new ArrayList<>();
			nn.add(i);
			return nn;
		}

		for (int k = 0; k < arr.length; k++) {

			if (arr[i][k] == 1 && !aa[k]) {
				aa[k] = true;
				ArrayList<Integer> nn = dfs(arr, aa, k, j);
				if (nn != null) {
					nn.add(0, i);
					return nn;
				}

			}
		}
		
		return null;

	}

}
