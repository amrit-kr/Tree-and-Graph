

// PreOrder, PostOrder and InOrder Traversal of Tree

package traversal;

/**
 * @author Amrit1.Kumar
 *
 */
class Node{
	int key;
	Node left;
	Node right;
	
	public Node(int item) {
		key = item;
		right = left =null;
	}
}
public class TreeTraversal {
	Node root;
	
	public TreeTraversal() {
		root = null;
	}
	
	void preOrder(Node root)
	{
		if(root == null)
			return;
		System.out.print(root.key+" ");
		preOrder(root.left);
		preOrder(root.right);
	}
	void postOrder(Node root)
	{
		if(root == null)
			return;
		postOrder(root.left);
		postOrder(root.right);
		System.out.print(root.key+" ");
	}
	void inOrder(Node root)
	{
		if(root == null)
			return;
		inOrder(root.left);
		System.out.print(root.key+" ");
		inOrder(root.right);
	}
	
	
	public static void main(String[] args) {
		TreeTraversal tree = new TreeTraversal();
		tree.root = new Node(1);
		tree.root.left = new Node(2); 
	    tree.root.right = new Node(3); 
	    tree.root.left.left = new Node(4); 
	    tree.root.left.right = new Node(5);
	    
	    System.out.print(" PreOrder Traversal ==== > ");
	    tree.preOrder(tree.root);
	    System.out.print("\n PostOrder Traversal ==== > ");
	    tree.postOrder(tree.root);
	    System.out.print("\n InOrder Traversal ==== > ");
	    tree.inOrder(tree.root);
	}
}
