package graphs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class DFSAdjList {


	private int v;
	private LinkedList<Integer>[] adjList;

	public DFSAdjList(int v) {
		this.v = v;
		this.adjList = new LinkedList[v];
		for (int i = 0; i < v; i++) {
			adjList[i] = new LinkedList<Integer>();
		}
	}

	private void addEdge(int u, int v) {

		adjList[u].add(v);
		adjList[v].add(u);

	}

	/*
	 * public void printAdjList() { for (int i = 0; i < v; i++) {
	 * System.out.print("Vertex " + i + " -> "); for (int j = 0; j <
	 * adjList[i].size(); j++) { System.out.print(adjList[i].get(j) + " "); }
	 * System.out.println(); } }
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DFSAdjList g = new DFSAdjList(4);
		g.addEdge(0, 1);
		g.addEdge(1, 2);
		g.addEdge(2, 3);
		g.addEdge(3, 0);
		g.dfs(0);

		// g.printAdjList();

	}

	private void dfs(int s) {
		boolean[] tracked = new boolean[v];
		Stack<Integer> q = new Stack<>();
		q.push(s);
		while (!q.isEmpty()) {
			int x = q.pop();
			
			if (!tracked[x]) {
				tracked[x] = true;
				System.out.println(x + "  ");

				for(int v:adjList[x]) {
					if (!tracked[v]) {
						q.push(v);
					}
			}
			}
		}

	}
}
