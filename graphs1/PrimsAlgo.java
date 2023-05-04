package graphs1;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class PrimsAlgo {

	public static class Edge {
		int src;
		int dest;
		int wgt;

		public Edge(int src, int dest, int wgt) {
			this.src = src;
			this.dest = dest;
			this.wgt = wgt;
		}
	}

	public static class Pair implements Comparable<Pair> {
		int node;
		int cost;

		public Pair(int n, int d) {
			this.node = n;
			this.cost = d;
		}

		@Override
		public int compareTo(Pair p2) {
			return this.cost - p2.cost;
		}

	}

	public static void main(String[] args) {
		int v = 5;
		ArrayList<Edge> graph[] = new ArrayList[v];
		createGraph(graph);
		primsAlgo(graph, v);

	}

	public static void createGraph(ArrayList<Edge> graph[]) {
		for (int i = 0; i < graph.length; i++) {
			graph[i] = new ArrayList<>();
		}
		graph[0].add(new Edge(0, 1, 10));
		graph[0].add(new Edge(0, 2, 15));
		graph[0].add(new Edge(0, 3, 30));
		graph[1].add(new Edge(1, 0, 10));
		graph[1].add(new Edge(1, 3, 40));
		graph[2].add(new Edge(2, 0, 15));
		graph[2].add(new Edge(2, 3, 50));
		graph[3].add(new Edge(3, 1, 40));
		graph[3].add(new Edge(3, 2, 50));
	}

	public static void primsAlgo(ArrayList<Edge> graph[], int vertex) {
		PriorityQueue<Pair> pq = new PriorityQueue<>();// non-mst
		boolean[] visited = new boolean[vertex];// mst
		pq.add(new Pair(0, 0));
		int mstCost = 0;

		while (!pq.isEmpty()) {
			Pair curr = pq.remove();
			if (!visited[curr.node]) {
				visited[curr.node] = true;
				mstCost += curr.cost;
				for (int j = 0; j < graph[curr.node].size(); j++) {
					Edge e = graph[curr.node].get(j);

					if (!visited[e.dest]) {
						pq.add(new Pair(e.dest, e.wgt));
					}
				}
			}
		}
		System.out.print("minimum cost  " + mstCost);
	}
}
