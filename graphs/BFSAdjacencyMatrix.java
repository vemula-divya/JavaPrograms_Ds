package graphs;

import java.util.LinkedList;
import java.util.Queue;

public class BFSAdjacencyMatrix {
	private int vertices;
	private int[][] adjMat;
	
	public BFSAdjacencyMatrix(int vertices)
	{
		this.vertices=vertices;
		this.adjMat=new int[vertices][vertices];
		
	}
	

	private void addEdge(int u, int v) {
		
		this.adjMat[u][v]=1;
		this.adjMat[v][u]=1;

		
	}

	
	  public void printAdjMatrix() {
	        for (int i = 0; i < vertices; i++) {
	            System.out.print("Vertex " + i + " -> ");
	            for (int j = 0; j < vertices; j++) {
	                System.out.print(adjMat[i][j] + " ");
	            }
	            System.out.println();
	        }
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BFSAdjacencyMatrix g= new BFSAdjacencyMatrix(4);
		g.addEdge(0,1);
		g.addEdge(1,2);
		g.addEdge(2,3);
		g.addEdge(3,0);
		g.bfs(0);

		//g.printAdjMatrix();

	}


	private void bfs(int s) {
		boolean[] tracked = new boolean[vertices];
		Queue<Integer> q = new LinkedList<>();
		q.offer(s);
		tracked[s] = true;
		while (!q.isEmpty()) {
			int x = q.poll();
			System.out.println(x + "  ");
			for (int v = 0; v < vertices; v++) {
                if (adjMat[x][v] == 1 && !tracked[v]) {
                	tracked[v] = true;
    				q.offer(v);
                }
			
		}

	}



	}

}
