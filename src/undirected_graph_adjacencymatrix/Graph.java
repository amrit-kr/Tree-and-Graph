
// Simple Undirected Graph Implementation

package undirected_graph_adjacencymatrix;

public class Graph {

	private boolean adjMatrix[][];
	private int vertexCount;
	
	public Graph(int count) {
		this.vertexCount = count;
		adjMatrix = new boolean[vertexCount][vertexCount];
	}
	
	// Function to add Edge between two vertices
	public void addEdge(int x,int y)
	{
		if(x>=0 && x<vertexCount && y>=0 && y<vertexCount)
		{
			adjMatrix[x][y] = true;
			adjMatrix[y][x] = true;
			
			System.out.println("Edge succesfully added!");
		}
	}
	
	// Function to remove Edge between two vertices
	public void removeEdge(int x,int y)
	{
		if(x>=0 && x<vertexCount && y>=0 && y<vertexCount)
		{
			adjMatrix[x][y] = false;
			adjMatrix[y][x] = false;
			
			System.out.println("Edge succesfully removed");
		}
	}
	
	// Function to check if there a edge exists between two vertices
	public boolean isEdge(int x,int y)
	{
		if(x>0 && x<vertexCount && y>0 && y<vertexCount)
		{
			return adjMatrix[x][y];
		}
		else
			return false;
	}
	
	public static void main(String[] args) {
		
		Graph g = new Graph(4);
		 
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        
        int input1 = 2,input2 = 3;
        if(g.isEdge(input1, input2))
        {
        	 System.out.println("Threre is an edge between "+input1+" and "+input2);
        }
        else {
        	System.out.println("No edge exists between "+input1+" and "+input2);
        }
        
        // After removing Edge
        g.removeEdge(input1, input2);
        
        if(g.isEdge(input1, input2))
        {
        	 System.out.println("Threre is an edge between "+input1+" and "+input2);
        }
        else {
        	System.out.println("No edge exists between "+input1+" and "+input2);
        }
        
        
	}
}
