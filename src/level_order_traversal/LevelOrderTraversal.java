
// Program to print height of tree, givenLevel print function and levelOrderTraversal function

package level_order_traversal;

import java.util.LinkedList;
import java.util.Queue;

class Node{
	int key;
	Node left;
	Node right;
	public Node(int item) {
		key = item;
		left=right=null;
	}
}

public class LevelOrderTraversal {
	
	Node root;
	public LevelOrderTraversal() {
		root = null;
	}
	public LevelOrderTraversal(int item) {
		root = new Node(item);
	}
	
	// =============Function to print Height of Tree==================
	int height(Node root)
	{
		if(root==null)
			return 0;
		else
		{
			int lheight = height(root.left);
			int rheight = height(root.right);
			if(lheight>rheight)
				return lheight+1;
			else
				return rheight+1;
		}
	}
	
	// ================Function to print givenLevel of Tree===============
	void printGivenLevel(Node root,int level)
	{
		if(root==null)
			return;
		if(level==1)
			System.out.print(root.key+" ");
		else if(level>1)
		{
			printGivenLevel(root.left, level-1);
			printGivenLevel(root.right, level-1);
		}
	}
	
	//====================== First Method to print levelOrderTraversal of Tree (all levels)==============
	void printLevelOrder()
	{
		int h = height(root);
		for(int i=1;i<=h;i++)
		{
			printGivenLevel(root, i);
		}
	}
	
	
	// ===================Second Method to print LevelOrderTraversal of Tree=======================
	
	void levelOrderQueue()
	{
		Queue<Node> queue = new LinkedList<Node>();
		queue.add(root);
		while(!queue.isEmpty())
		{
			Node tempNode = queue.poll();
			System.out.print(tempNode.key+" ");
			if(tempNode.left!=null)
			{
				queue.add(tempNode.left);
			}
			if(tempNode.right!=null)
			{
				queue.add(tempNode.right);
			}
		}
	}
	
	public static void main(String[] args) {
		LevelOrderTraversal tree = new LevelOrderTraversal();
		tree.root = new Node(10);
		tree.root.left = new Node(20);
		tree.root.right = new Node(30);
		tree.root.left.left = new Node(40);
		tree.root.left.right = new Node(50);
		tree.root.right.left = new Node(60);
		tree.root.right.right = new Node(70);
		
		int heightOfTree = tree.height(tree.root);
		System.out.println("Height of BinaryTree is : "+heightOfTree);
		
		System.out.print("Level 3 Elements of Tree are : ");
		tree.printGivenLevel(tree.root, 3);
		System.out.print("\nLevelOrderTraversal of Tree : ");
		tree.printLevelOrder();
		
		System.out.print("\nLevelOrderTraversal of Tree using queue: ");
		tree.levelOrderQueue();
	}
}
