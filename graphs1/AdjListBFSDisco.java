package graphs1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class AdjListBFSDisco {//  O(V+E)
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
		graph[0].add(new Edge(0, 1));
		graph[0].add(new Edge(0, 2));
		graph[1].add(new Edge(1, 0));
		graph[1].add(new Edge(1, 3));
		graph[2].add(new Edge(2, 0));
		graph[2].add(new Edge(2, 4));
		graph[3].add(new Edge(3, 1));
		graph[3].add(new Edge(3, 4));
		graph[3].add(new Edge(3, 5));
		graph[4].add(new Edge(4, 2));
		graph[4].add(new Edge(4, 3));
		graph[4].add(new Edge(4, 5));
		graph[5].add(new Edge(5, 3));
		graph[5].add(new Edge(5, 4));
		graph[5].add(new Edge(5, 6));
		graph[6].add(new Edge(6, 5));
	}

	public static void main(String[] args) {
		int v = 7;
		ArrayList<Edge> graph[] = new ArrayList[v];
		createGraph(graph);
		boolean[] visited=new boolean[v];
		for(int i=0;i<v;i++)
		{
			if(visited[i]==false) {
		  bfsGraphDis(graph,visited,i);
			}
		}	
	}
	//for disconn  graph and connected graph 
	//it will work for both the scenarios so in the end we can use this method for bfs
	//0--1--2
	//3--4
		private static void bfsGraphDis(ArrayList<Edge> graph[],boolean[] visited,int start) {
			Queue<Integer> q=new LinkedList<>();			
				q.offer(start);
				while(!q.isEmpty())
				{
					int curr=q.remove();

					if(visited[curr]==false)
					{
						System.out.print(curr+" ");
						visited[curr]=true;
						for(int i=0;i<graph[curr].size();i++)
						{
							Edge e=graph[curr].get(i);
							q.add(e.dest);
						}
					}
				}	
		}
}