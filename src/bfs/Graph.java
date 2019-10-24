
// Breadth First Search for a Graph

package bfs;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Graph {

	private LinkedList<Integer> adj[];
	private int vertextCount;
	
	Graph(int count)
	{
		vertextCount = count;
		adj = new LinkedList[count];
		for(int i=0;i<count;i++)
		{
			adj[i] = new LinkedList<Integer>();
		}
	}
	void addEdge(int src,int dest)
	{
		adj[src].add(dest);
		adj[dest].add(src);
	}
	
	void BFS(int src)
	{
		boolean visited[] = new boolean[vertextCount];
		visited[src] = true;
		Queue<Integer> q = new LinkedList<Integer>();
		q.add(src);
	
		
		while(!q.isEmpty())
		{
			src = q.poll();
			System.out.print(src+" ");
			
			Iterator<Integer> it = adj[src].listIterator();
			while(it.hasNext())
			{
				int x = (int) it.next();
				if(!visited[x])
				{
					visited[x]=true;
					q.add(x);
				}
			}
		}
	}
	
	public static void main(String[] args) {
		
		 Graph g = new Graph(4); 
		  
	        g.addEdge(0, 1); 
	        g.addEdge(0, 2); 
	        g.addEdge(1, 2); 
	        g.addEdge(2, 0); 
	        g.addEdge(2, 3); 
	        g.addEdge(3, 3); 
	        
	     System.out.print("BFS Traversal from vertex 2 is : ");
	     g.BFS(2);
	}
}
