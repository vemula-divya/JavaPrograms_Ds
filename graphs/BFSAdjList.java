package graphs;

import java.util.LinkedList;
import java.util.Queue;

public class BFSAdjList {

	// undirectional

	private int v;
	private LinkedList<Integer>[] adjList;

	public BFSAdjList(int v) {
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
		BFSAdjList g = new BFSAdjList(4);
		g.addEdge(0, 1);
		g.addEdge(1, 2);
		g.addEdge(2, 3);
		g.addEdge(3, 0);
		g.bfs(0);

		// g.printAdjList();

	}

	private void bfs(int s) {
		boolean[] tracked = new boolean[v];
		Queue<Integer> q = new LinkedList<>();
		q.offer(s);
		tracked[s] = true;
		while (!q.isEmpty()) {
			int x = q.poll();
			System.out.println(x + "  ");
			for(int v:adjList[x]) {
			if (!tracked[v]) {
				tracked[v] = true;
				q.offer(v);
			}
			}
		}

	}
}
