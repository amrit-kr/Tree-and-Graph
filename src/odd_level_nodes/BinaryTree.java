
// Program to print nodes present at odd level of Binary Tree.

package odd_level_nodes;

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
	
	void printNodeAtOddLevel(Node root, boolean odd)
	{
		if(root==null)
			return;
		if(odd==true)
			System.out.print(root.key+" ");
		if(root.left!=null)
			printNodeAtOddLevel(root.left, !odd);
		if(root.right!=null)
			printNodeAtOddLevel(root.right, !odd);
	}
	
	public static void main(String[] args) {
		
		BinaryTree tree = new BinaryTree();
		tree.root =new Node(1);  
	    tree.root.left = new Node(2);  
	    tree.root.right = new Node(3);  
	    tree.root.left.left = new Node(4);  
	    tree.root.left.right = new Node(5);
	    tree.printNodeAtOddLevel(tree.root, true);
	}
}
