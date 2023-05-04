package graphs1;

import java.util.ArrayList;
import java.util.Stack;

public class KosarajusAlgo {
	public static class Edge {
		int src;
		int dest;

		public Edge(int src, int dest) {
			this.src = src;
			this.dest = dest;
		}
	}

	public static void createGraph(ArrayList<Edge> graph[]) {
		for (int i = 0; i < graph.length; i++) {
			graph[i] = new ArrayList<>();

		}
		graph[0].add(new Edge(0, 2));
		graph[0].add(new Edge(0, 3));

		graph[1].add(new Edge(1, 0));

		graph[2].add(new Edge(2, 1));

		graph[3].add(new Edge(3, 4));

	}
	public static void dfs(ArrayList<Edge> graph[], int curr, boolean[] visited) {
		visited[curr] = true;
		System.out.print(curr + " ");
		for (int i = 0; i < graph[curr].size(); i++) {
			Edge e = graph[curr].get(i);
			if (!visited[e.dest]) {
				dfs(graph, e.dest, visited);
			}
		}
	}

	public static void topSort(ArrayList<Edge> graph[], int curr, boolean[] visited, Stack<Integer> s) {
		visited[curr] = true;
		for (int i = 0; i < graph[curr].size(); i++) {
			Edge e = graph[curr].get(i);
			if (!visited[e.dest]) {
				topSort(graph, e.dest, visited, s);
			}
		}
		s.push(curr);

	}
	
	public static void main(String[] args) {
		int v = 5;
		ArrayList<Edge> graph[] = new ArrayList[v];
		createGraph(graph);
		KosarajusAlgo(graph, v);

	}

	public static void KosarajusAlgo(ArrayList<Edge> graph[], int v) {
		// step1
		Stack<Integer> s = new Stack<>();
		boolean[] visited = new boolean[v];

		for (int i = 0; i < v; i++) {
			if (!visited[i]) {
				topSort(graph, i, visited, s);
			}
		}
		// step 2:transpose
		ArrayList<Edge> transpose[] = new ArrayList[v];
		for (int i = 0; i < graph.length; i++) {
			visited[i] = false;
			transpose[i] = new ArrayList<Edge>();

		}

		for (int i = 0; i < v; i++) {
			for (int j = 0; j < graph[i].size(); j++) {
				Edge e = graph[i].get(j);
				transpose[e.dest].add(new Edge(e.dest, e.src));

			}

		}
		// step3:DFS
		while (!s.isEmpty()) {
			int curr = s.pop();
			if (!visited[curr]) {
				dfs(transpose, curr, visited);
				System.out.println();
			}

		}

	}

}
