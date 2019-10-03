package binaryTree;

class Node{
	int key;
	Node left;
	Node right;
	
	public Node(int item) {
		key = item;
		left = right =null;
	}
}
public class SimpleBinaryTree {
	Node root;
	
	public SimpleBinaryTree(int k) {
		root = new Node(k);
	}
	public SimpleBinaryTree() {
		root = null;
	}
	
	public static void main(String[] args) {
		SimpleBinaryTree binaryTree = new SimpleBinaryTree();
		binaryTree.root = new Node(10);
		binaryTree.root.left = new Node(12);
		binaryTree.root.right = new Node(13);
		
		System.out.println("Simple Binary Tree Created");
	}
}
