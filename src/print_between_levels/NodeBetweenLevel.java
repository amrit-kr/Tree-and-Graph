
// Program to print Nodes between two given levels

package print_between_levels;

import java.util.LinkedList;
import java.util.Queue;

public class NodeBetweenLevel {
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
	
	
	public NodeBetweenLevel() {
		root=null;
	}
	
	void printNodes(Node root,int start,int end)
	{
		if(root==null)
			return;
		Queue<Node> q = new LinkedList<Node>();
		q.add(root);
		int level = 0;
		int size = 0; 
		Node current = null;
		while(!q.isEmpty())
		{
			level++;
			size = q.size();
			
			
			while(size!=0)
			{
				current = q.poll();
				if(level>=start && level<=end)
				{
					System.out.print(current.key+" ");
				}
				if(current.left!=null)
				{
					q.add(current.left);
				}
				if(current.right!=null)
				{
					q.add(current.right);
				}
				size--;
			}
			System.out.println(" ");
		}
	}
	
	public static void main(String[] args) {
		
		NodeBetweenLevel tree = new NodeBetweenLevel();
		 tree.root = new Node(1);
		 tree.root.left = new Node(2); 
	     tree.root.right = new Node(3); 
	     tree.root.left.left = new Node(4); 
	     tree.root.left.right = new Node(5); 
	     tree.root.right.left = new Node(6); 
	     tree.root.right.right = new Node(7); 
	  
	        /* Constructed binary tree is  
	             1  
	           /  \  
	          2    3  
	         / \  / \ 
	        4   5 6  7 */
	  
	        int start = 2, end = 3; 
	  
	        tree.printNodes(tree.root, start, end); 
	}
}
