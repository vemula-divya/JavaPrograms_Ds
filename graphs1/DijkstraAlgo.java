package graphs1;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class DijkstraAlgo {

	   public  static class Edge{
	        int src;
	        int dest;
	        int wgt;
	        
	        public Edge(int src,int dest,int wgt){
	            this.src=src;
	            this.dest=dest;
	            this.wgt=wgt;
	        }
	    }
	    public static class Pair implements Comparable<Pair>{
	        int node;
	        int dest;
	        public Pair(int n,int d)
	        {
	            this.node=n;
	            this.dest=d;
	        }
	        @Override
	        public int compareTo(Pair p2)
	        {
	            return this.dest-p2.dest;
	        }
	        
	    }
	    
	    public static void createGraph(ArrayList<Edge> graph[])
	    {
	        for(int i=0;i<graph.length;i++){
	            graph[i]=new ArrayList<>();
	            
	        }
	        graph[0].add(new Edge(0,1,2));
		    graph[0].add(new Edge(0,2,4));
		    
		    graph[1].add(new Edge(1,2,1));
		    graph[1].add(new Edge(1,3,7));
		    
		    graph[2].add(new Edge(2,4,3));
		    
		 
		    graph[3].add(new Edge(3,5,1));
		    
	        graph[4].add(new Edge(4,3,2));
		   graph[4].add(new Edge(4,5,5));
		  
	    }
	    
	    public static void main(String[] args) {
		    int v=6;
		    ArrayList<Edge> graph[]=new ArrayList[v];
		    createGraph(graph);
		   int src=0;
		   
		       dijkstraAlgo(graph,src,v); 
		       
		    
			
		}
	    
	    public static void  dijkstraAlgo(ArrayList<Edge> graph[],int src,int vertex)
	    {
	        PriorityQueue<Pair> pq=new PriorityQueue<>();
	         boolean[] visited=new boolean[vertex];
	         int[] dist=new int[vertex];
	          for(int i=0;i<dist.length;i++)
	         {
	             if(i!=src)
	             {
	                   dist[i]=Integer.MAX_VALUE;
	             }
	           
	         }
	         pq.add(new Pair(0,0));
	         while(!pq.isEmpty())
	         {
	            Pair curr= pq.remove();
	            if(!visited[curr.node]){
	             visited[curr.node]=true;
	            }
	             for(int j=0;j<graph[curr.node].size();j++)
	             {
	                 Edge e=graph[curr.node].get(j);
	                 int u=e.src;
	                 int v=e.dest;
	                 if(dist[u]+e.wgt<dist[v])
	                 {
	                     dist[v]=dist[u]+e.wgt;
	                     pq.add(new Pair(v,dist[v]));
	                 }
	                 
	                 
	                 
	             }
	             
	         }
	         for(int k=0;k<dist.length;k++)
	         {
	             System.out.print(dist[k]+" ");
	         }
	        
	        
	    }
		


}
