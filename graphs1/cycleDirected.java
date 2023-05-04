package graphs1;

import java.util.*;

public class cycleDirected {
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
			graph[i] = new ArrayList<>();
		}
		graph[0].add(new Edge(0, 2));
		graph[1].add(new Edge(1, 0));
		graph[2].add(new Edge(2, 3));
		graph[3].add(new Edge(3, 0));
	}

	public static boolean isCyclicDFS(ArrayList<Edge>[] graph, boolean[] visited, boolean[] recStack, int curr) {
		visited[curr] = true;
		recStack[curr] = true;
		for (int i = 0; i < graph[curr].size(); i++) {
			Edge e = graph[curr].get(i);
			if (recStack[e.dest]) {
				return true;
			} else if (!visited[e.dest] && isCyclicDFS(graph, visited, recStack, e.dest)) {
				return true;
			}
		}
		recStack[curr] = false;
		return false;
	}

	public static void main(String[] args) {
		int v = 4;
		ArrayList<Edge> graph[] = new ArrayList[v];
		createGraph(graph);
		boolean[] visited = new boolean[v];
		boolean[] recStack = new boolean[v];
		for (int i = 0; i < v; i++) {
			if (!visited[i]) {
				boolean iscycle = isCyclicDFS(graph, visited, recStack, 0);
				if (iscycle) {
					System.out.println(iscycle);
					break;
				}
			}

		}

	}
}
