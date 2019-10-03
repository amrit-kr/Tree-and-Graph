// Program to print Binary Tree levels in sorted order

package sorted_level_order;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

class Node{
	int key;
	Node left;
	Node right;
	public Node(int item) {
		key=item;
		left=right=null;
	}
}

/**
 * @author Amrit1.Kumar
 *
 */
public class BinaryTree {
	Node root;
	public BinaryTree() {
		root=null;
	}
    public BinaryTree(int item) {
		root = new Node(item);
	}
    
    void printSortedOrder(Node node)
    {
    	Queue<Node> queue = new LinkedList<Node>();
    	Set<Integer> s = new HashSet<Integer>();
    	queue.add(node);
    	queue.add(null);
    	
    	while(!queue.isEmpty())
    	{
    		Node temp = queue.poll();
    		if(temp==null)
    		{
    			if(s.isEmpty())
    				break;
    			Iterator<Integer> val = s.iterator();
    			while(val.hasNext())
    			{
    				System.out.print(val.next()+" ");
    			}
    			queue.add(null);
    			s.clear();
    		}
    		else {
    			s.add(temp.key);
    			if(temp.left!=null)
    				queue.add(temp.left);
    			if(temp.right!=null)
    				queue.add(temp.right);
    		}
    	}
    }
    
    public static void main(String[] args) {
		BinaryTree tree = new BinaryTree();
		tree.root = new Node(7); 
		tree.root.left = new Node(6); 
		tree.root.right = new Node(5); 
		tree.root.left.left = new Node(4); 
	    tree.root.left.right = new Node(3); 
	    tree.root.right.left = new Node(2); 
	    tree.root.right.right = new Node(1);  
	    
	    System.out.println("Sorted Level Order : ");
	    tree.printSortedOrder(tree.root); 
	}
}
