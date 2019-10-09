
// Program to print it's Nodes along with it's level.

package node_level;

import java.util.LinkedList;
import java.util.Queue;

public class NodeLevel {
	
	static class Node{
		int key;
		Node left;
		Node right;
		public Node(int item) {
			key=item;
			left=right=null;
		}
	}

	static class NodePair{
		Node n;
		int level;
		public NodePair(Node node,int i) {
			n = node;
			level = i;
		}
	}
	
	static void printLevel(Node root)
	{
		Queue<NodePair> queue = new LinkedList<NodePair>();
		queue.add(new NodePair(root, 1));
		NodePair temp;
		
		while(!queue.isEmpty())
		{
			 temp = queue.poll();
			 System.out.println("Level of Node "+temp.n.key+" is : "+temp.level);
			 
			 if(temp.n.left!=null)
			 {
				 queue.add(new NodePair(temp.n.left, temp.level+1));
			 }
			 if(temp.n.right!=null)
			 {
				 queue.add(new NodePair(temp.n.right, temp.level+1));
			 }
			
		}
	}
	
	public static void main(String[] args) {
		 Node root = null;
		 root = new Node(3); 
	     root.left = new Node(2); 
	     root.right = new Node(5); 
	     root.left.left = new Node(1); 
	     root.left.right = new Node(4); 
	     System.out.println("Nodes with levels : ");
	     printLevel(root);
	}
	
}
