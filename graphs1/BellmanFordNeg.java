package graphs1;

import java.util.ArrayList;

public class BellmanFordNeg {

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

	public static void createGraph(ArrayList<Edge> graph[]) {
		for (int i = 0; i < graph.length; i++) {
			graph[i] = new ArrayList<>();

		}
		graph[0].add(new Edge(0, 1, 2));
		graph[0].add(new Edge(0, 2, 4));

		graph[1].add(new Edge(1, 2, -4));

		graph[2].add(new Edge(2, 3, 2));

		graph[3].add(new Edge(3, 4, 4));

		graph[4].add(new Edge(4, 1, -10));

	}

	public static void bellmanFord(ArrayList<Edge> graph[], int src, int vertex) {
		int[] dist = new int[vertex];
		for (int i = 0; i < vertex; i++) {
			if (i != src) {
				dist[i] = Integer.MAX_VALUE;
			}

		}
		for (int k = 0; k < vertex - 1; k++) {
			for (int i = 0; i < vertex; i++) {
				for (int j = 0; j < graph[i].size(); j++) {
					Edge e = graph[i].get(j);
					int u = e.src;
					int v = e.dest;
					if (dist[u] != Integer.MAX_VALUE && dist[u] + e.wgt < dist[v]) {
						dist[v] = dist[u] + e.wgt;

					}

				}

			}
		}

		for (int i = 0; i < vertex; i++) {
			for (int j = 0; j < graph[i].size(); j++) {
				Edge e = graph[i].get(j);
				int u = e.src;
				int v = e.dest;
				if (dist[u] != Integer.MAX_VALUE && dist[u] + e.wgt < dist[v]) {
					System.out.println("Negative weight cycle");

				}

			}
		}

		for (int k = 0; k < dist.length; k++) {
			System.out.print(dist[k] + " ");
		}

	}

	public static void main(String[] args) {
		int v = 5;
		ArrayList<Edge> graph[] = new ArrayList[v];
		createGraph(graph);
		int src = 0;

		bellmanFord(graph, src, v);

	}

}
