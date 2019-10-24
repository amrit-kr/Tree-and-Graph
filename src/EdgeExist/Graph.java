package EdgeExist;

import java.util.LinkedList;
import java.util.Scanner;

public class Graph{
    
    private LinkedList<Integer> adj[];
    private int vertexCount;
    
    public Graph(int count)
    {
        vertexCount = count;
        adj = new LinkedList[vertexCount];
        for(int i=0;i<vertexCount;i++)
        {
            adj[i] = new LinkedList<Integer>();
        }
    }
    
        void addEdge(int src,int dest)
        {
                adj[src].add(dest);
                adj[dest].add(src);
        }
        
    public static void main(String args[])
    {
       
        Scanner sc = new Scanner(System.in);
        int m,n;
        // No of Node and Edge input
        n = sc.nextInt();
        m = sc.nextInt();
        
         Graph g = new Graph(n+1);
         
         for(int j =0;j<m;j++)
         {
             int x,y;
             x = sc.nextInt();
             y = sc.nextInt();
             
             g.addEdge(x,y);
         }
        int q;
        // Number of Queries 
        q = sc.nextInt();
        for(int i=0;i<q;i++)
        {
            int a,b;
            a = sc.nextInt();
            b = sc.nextInt();
            
            if(g.adj[a].contains(b))
            {
                System.out.println("YES");
            }
            else
            System.out.println("NO");
        }
    }
}


/*
  Custom Input

5 4
1 2
3 4
1 4
5 1
1
3 4
*/