package undirected_graph_list;

import java.util.LinkedList;

public class Graph {

	int vertexCount;
	LinkedList<Integer> adj[];
	
	public Graph(int count) {
		vertexCount = count;
		adj = new LinkedList[vertexCount];
		
		for(int i=0;i<vertexCount;i++)
		{
			adj[i] = new LinkedList<Integer>();
		}
	}
	
	void addEdge(Graph g,int src,int dest)
	{
		g.adj[src].add(dest);
		g.adj[dest].add(src);
		
		System.out.println("Edge added successfully!");
	}
	
	void printGraph(Graph g)
	{
		for(int i=0;i<g.vertexCount;i++)
		{
			System.out.print("Vertix "+i+" List ==> ");
			for(int j=0;j<adj[i].size()-1;j++)
			{
				System.out.print(adj[i].get(j)+"->");
			}
			System.out.print(adj[i].get(adj[i].size()-1)+"\n");
			
		}
	}
	
	public static void main(String[] args) {
		Graph g = new Graph(5);
		 g.addEdge(g, 0, 1); 
		 g.addEdge(g, 0, 4); 
		 g.addEdge(g, 1, 2); 
		 g.addEdge(g, 1, 3); 
		 g.addEdge(g, 1, 4); 
		 g.addEdge(g, 2, 3); 
		 g.addEdge(g, 3, 4); 
		 
		 g.printGraph(g);
	}
}
