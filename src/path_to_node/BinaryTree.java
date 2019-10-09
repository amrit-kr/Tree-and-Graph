
// Program to print Path of given Node using recursion

package path_to_node;

import java.util.ArrayList;
import java.util.List;

public class BinaryTree {
	
	Node root;
	static class Node{
		int key;
		Node left;
		Node right;
		
		public Node(int item) {
			key=item;
			left=right=null;
		}
	}
	public BinaryTree() {
		root = null;
	}
	
	boolean pathExist(Node root,int n,List<Integer> path)
	{
		if(root==null)
			return false;
		
		path.add(root.key);
		
		if(root.key==n)
			return true;
		
		if(pathExist(root.left, n, path) || pathExist(root.right, n, path))
			return true;
		
		path.remove(path.size()-1);
		return false;
	}
	
	void printPath(Node root,int n)
	{
	     List<Integer> list = new ArrayList<Integer>();
	     
	     if(pathExist(root, n, list))
	     {
	    	 System.out.print("Path to Node "+n+" is : ");
	    	 for(int j=0;j<list.size()-1;j++)
	    	 {
	    		 System.out.print(list.get(j)+"->");
	    	 }
	    	 System.out.print(list.get(list.size()-1));
	     }
	     else
	    	 System.out.println("No path Exists");
	}
	
	public static void main(String[] args) {
		
		BinaryTree tree = new BinaryTree();
		tree.root = new Node(1);
		tree.root.left = new Node(2);  
		tree.root.right = new Node(3);  
		tree.root.left.left = new Node(4);  
		tree.root.left.right = new Node(5);  
		tree.root.right.left = new Node(6);  
		tree.root.right.right = new Node(7);  
		tree.printPath(tree.root, 6);
	}
}
