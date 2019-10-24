
// DFS Traversal of Undirected Graph using Recursion.

package dfs_traversal_recursive;

import java.util.Iterator;
import java.util.LinkedList;

public class Graph {

	private int vertices;
	private LinkedList<Integer> adj[];
	private boolean visited[];

	public Graph(int count) {
		vertices = count;
		adj = new LinkedList[vertices];
		visited = new boolean[vertices];

		for (int i = 0; i < vertices; i++) {
			adj[i] = new LinkedList<Integer>();
		}
	}
	
	void addEdge(Graph g,int src,int dest)
	{
		g.adj[src].add(dest);
		g.adj[dest].add(src);
	}
	
	void DFS(int vertex)
	{
		visited[vertex] =  true;
		System.out.print(vertex+" ");
		
		Iterator it = adj[vertex].listIterator();
		
		while(it.hasNext())
		{
			int data = (int) it.next();
			if(!visited[data])
			{
				visited[data] = true;
				DFS(data);
			}
		}
	}
	
	public static void main(String[] args) {

        Graph g = new Graph(4);
 
         g.addEdge(g,0, 1);
         g.addEdge(g,0, 2);
         g.addEdge(g,1, 2);
         g.addEdge(g,2, 0);
         g.addEdge(g,2, 3);
         g.addEdge(g,3, 3);
 
        
        System.out.print("DFS Traversal starting from vertex 2 is : ");
        
        g.DFS(2);
	}
}
