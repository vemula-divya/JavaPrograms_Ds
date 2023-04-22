package graphs;

public class AdjacencyMatrix {
	//Undirectional
	private int v;
	private int[][] adjMat;
	
	public AdjacencyMatrix(int v)
	{
		this.v=v;
		this.adjMat=new int[v][v];
		
	}
	

	private void addEdge(int u, int v) {
		
		this.adjMat[u][v]=1;
		this.adjMat[v][u]=1;

		
	}

	
	  public void printAdjMatrix() {
	        for (int i = 0; i < v; i++) {
	            System.out.print("Vertex " + i + " -> ");
	            for (int j = 0; j < v; j++) {
	                System.out.print(adjMat[i][j] + " ");
	            }
	            System.out.println();
	        }
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AdjacencyMatrix g= new AdjacencyMatrix(4);
		g.addEdge(0,1);
		g.addEdge(1,2);
		g.addEdge(2,3);
		g.addEdge(3,0);
		

		g.printAdjMatrix();

	}





}
