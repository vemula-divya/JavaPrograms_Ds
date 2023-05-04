package graphs1;

import java.util.ArrayList;
import java.util.Stack;

public class TopologicalSorting {

	static class Edge {
		int src;
		int dest;

		public Edge(int src, int dest) {
			this.src = src;
			this.dest = dest;

		}
	}

	public static void createGraph(ArrayList<Edge> graph[]) {
		for (int i = 0; i < graph.length; i++) {
			graph[i] = new ArrayList<Edge>();
		}
		graph[5].add(new Edge(5, 0));
		graph[5].add(new Edge(5, 2));
		graph[4].add(new Edge(4, 0));
		graph[4].add(new Edge(4, 1));
		graph[2].add(new Edge(2, 3));
		graph[3].add(new Edge(3, 1));

	}
	public static void main(String[] args) {
		int v = 6;
		ArrayList<Edge> graph[] = new ArrayList[v];
		createGraph(graph);

		boolean[] visited = new boolean[v];
		Stack<Integer> s = new Stack<>();
		for (int i = 0; i < v; i++) {
			if (!visited[i]) {
				topSort(graph, i, visited, s);
			}
		}

		while (!s.isEmpty()) {
			System.out.print(s.pop() + " ");
		}

	}
	private static void topSort(ArrayList<Edge> graph[], int curr, boolean[] visited, Stack<Integer> s) {

		visited[curr] = true;
		for (int i = 0; i < graph[curr].size(); i++) {
			Edge e = graph[curr].get(i);
			if (!visited[e.dest]) {
				topSort(graph, e.dest, visited, s);
			}

		}
		s.push(curr);

	}

}
