package graphs;

import java.util.LinkedList;
import java.util.Queue;

public class BFSAdjListConnectedComp {

	// undirectional

	private int v;
	private LinkedList<Integer>[] adjList;
	
	

	public BFSAdjListConnectedComp(int v) {
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

	
	  public void printAdjList() { for (int i = 0; i < v; i++) {
	  System.out.print("Vertex " + i + " -> "); for (int j = 0; j <
	  adjList[i].size(); j++) { System.out.print(adjList[i].get(j) + " "); }
	  System.out.println(); } }
	 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BFSAdjListConnectedComp g = new BFSAdjListConnectedComp(7);//this 7 will create 2 single nodes for 6 & 7
		
		g.addEdge(1,0);
		g.addEdge(1,2);
		g.addEdge(3, 4);
		
		//g.bfs(0);

		g.printAdjList();
		g.countConnect();
		
	}

	
	
	
	
	
	
	private void countConnect() {
		boolean[] visited = new boolean[v];
		int[] conId=new int[v];
		  int count=0;
		
		for(int i=0;i<v;i++)
		{
			if(!visited[i])
			{
				count++;

				dfs(i,visited,conId,count);
			}
			
		}
		System.out.println(count);
		
	}

	private void dfs(int i, boolean[] visited, int[] conId, int count) {
		visited[i]=true;
		conId[i]=count;
		for(int w:adjList[i])
		{
			if(!visited[w])
			{
				dfs(w,visited,conId,count);
			}
			
		}
		
		
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
