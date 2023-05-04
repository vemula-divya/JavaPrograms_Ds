package graphs1;

import java.util.*;
public class AllPath
{
    static class Edge{
        int src;
        int dest;
        
        public Edge(int src,int dest){
            this.src=src;
            this.dest=dest;
        }
    }
    public static void createGraph(ArrayList<Edge> graph[])
    {
        for(int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<>();
            
        }
        graph[0].add(new Edge(0,1));
	    graph[0].add(new Edge(0,2));
	    graph[1].add(new Edge(1,0));
	    graph[1].add(new Edge(1,3));
	    graph[2].add(new Edge(2,0));
	    graph[2].add(new Edge(2,4));
	    graph[3].add(new Edge(3,1));
	    graph[3].add(new Edge(3,4));
	    graph[3].add(new Edge(3,5));
	    graph[4].add(new Edge(4,2));
	    graph[4].add(new Edge(4,3));
	    graph[4].add(new Edge(4,5));
	    graph[5].add(new Edge(5,3));
	    graph[5].add(new Edge(5,4));
	    graph[5].add(new Edge(5,6));
	    graph[6].add(new Edge(6,5));
	     /*for(int k=0;k<graph[2].size();k++){
            System.out.print(graph[2].get(k).dest);
            
        }*/
	    
    }
    
     public static void allpathsDfs(ArrayList<Edge> graph[],boolean[] visited,int curr,String path,int target)
     {
        if(curr==target)
        {
            System.out.println(path);
            return;
        }
        
         for(int i=0;i<graph[curr].size();i++)
         {
            
             Edge e=graph[curr].get(i);
              if(visited[e.dest]==false){
               visited[curr]=true;
              allpathsDfs(graph,visited,e.dest,path+"->"+e.dest,target);
              visited[curr]=false;
             }
         }
         
         
     }
	public static void main(String[] args) {
	    int v=7;
	    ArrayList<Edge> graph[]=new ArrayList[v];
	    createGraph(graph);
	    boolean[] visited=new boolean[v];
	   
	       allpathsDfs(graph,visited,0,"0",5); 
	       
	    
		
	}
}

