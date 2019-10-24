package dfs_iterative;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;

public class Graph {

	private LinkedList<Integer> adj[];
	private int vertexCount;
	
	public Graph(int count) {
		vertexCount = count;
		adj = new LinkedList[vertexCount];
		
		for(int i=0;i<vertexCount;i++)
		{
			adj[i] = new LinkedList<Integer>();
		}
	}
	
	void addEdge(int src, int dest)
	{
		adj[src].add(dest);
		adj[dest].add(src);
	}
	
	void DFS(int vertex)
	{
		boolean visited[] = new boolean[vertexCount];
		Stack<Integer> stack = new Stack<Integer>();
		
		stack.add(vertex);
		while(!stack.isEmpty())
		{
			int element = stack.pop();
			if(!visited[element])
			{
				System.out.print(element+" ");
				visited[element] = true;
			}
			
			Iterator<Integer> it = adj[element].listIterator();
			while(it.hasNext())
			{
				int x = it.next();
				if(!visited[x])
				{
					stack.push(x);
				}
			}
		}
	}
	
	public static void main(String[] args) {
		
		Graph g = new Graph(5); 
        
        g.addEdge(1, 0); 
        g.addEdge(0, 2); 
        g.addEdge(2, 1); 
        g.addEdge(0, 3); 
        g.addEdge(1, 4); 
        
        System.out.print("DFS Traversal from vertex 0 is : ");
        g.DFS(0);
        
        
       
	}
}
