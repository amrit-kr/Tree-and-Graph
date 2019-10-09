
// Program to find Lowest Common Ancestor of two given Nodes

package lowest_common_ancestor;

import java.util.ArrayList;
import java.util.List;

public class BinaryTree {
	
	Node root;
	List<Integer>l1 = new ArrayList<Integer>();
	List<Integer>l2 = new ArrayList<Integer>();
	
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
	
	void findLca(Node root,int n1,int n2)
	{
		
		l1.clear();
		l2.clear();
		
		boolean flag1,flag2;
		
		flag1 = findPath(root, n1, l1);
		flag2 = findPath(root, n2, l2);
		
	//	System.out.println("Path to N1 node is : "+l1);
	//	System.out.println("Path to N2 node is : "+l2);
		
		int i;
		if(flag1 && flag2)
		{
			for(i=0;i<l1.size() && i<l2.size();i++)
			{
				if(!l1.get(i).equals(l2.get(i)))
					break;
			}
			System.out.println("Lowest Common Ancestor of ("+n1+","+n2+") is : "+l1.get(i-1));
		}
		else
			System.out.println("Lowest Common Ancestor of ("+n1+","+n2+")  does not Exists");
		
	}
	 boolean findPath(Node root,int n,List<Integer> path)
	 {
		 if(root==null)
		 return false;
		 
		 path.add(root.key);
		 
		 if(root.key==n)
			 return true;
		 
		 if(findPath(root.left, n, path) || findPath(root.right, n, path))
			 return true;
		
		 path.remove(path.size()-1);
		 return false;
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
        
        tree.findLca(tree.root, 4, 5);
        tree.findLca(tree.root, 6, 7);
        tree.findLca(tree.root, 5, 7);
        tree.findLca(tree.root, 5, 8);
	}

}
