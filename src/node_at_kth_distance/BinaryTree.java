
// Program to print Nodes present at Kth distance from Root

package node_at_kth_distance;

public class BinaryTree {

	Node root;
	static class Node
	{
		int key;
		Node left;
		Node right;
		
		public Node(int item) {
			key=item;
			left=right=null;
		}
	}
	public BinaryTree() {
		root=null;
	}
	
	void printKthDistanceNode(Node root,int k)
	{
		if(root==null)
			return;
		if(k==0)
		{
			System.out.print(root.key+" ");
		}
		else {
			if(root.left!=null)
				printKthDistanceNode(root.left, k-1);
			if(root.right!=null)
				printKthDistanceNode(root.right, k-1);
		}
		
	}
	
	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree();
         
	        /* Constructed binary tree is 
	                1 
	              /   \ 
	             2     3 
	            /  \   / 
	           4    5 8  
	           
	        */
	      tree.root = new Node(1); 
	      tree.root.left = new Node(2); 
	      tree.root.right = new Node(3); 
	      tree.root.left.left = new Node(4); 
	      tree.root.left.right = new Node(5); 
	      tree.root.right.left = new Node(8); 
	      
	      System.out.println("Nodes present at 2th distance from root are : ");
	      tree.printKthDistanceNode(tree.root, 2);
	}
}
