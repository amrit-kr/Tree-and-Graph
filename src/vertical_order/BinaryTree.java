// Program to print Binary Tree in Vertical Order using level order Traversal

package vertical_order;

class Node{
	int key;
	Node left;
	Node right;
	public Node(int item) {
		key=item;
		left=right=null;
	}
}

class Value{
	int min;
	int max;
	public Value() {
		min=max=0;
	}
}

/**
 * @author Amrit1.Kumar
 *
 */
public class BinaryTree {
	
	Node root;
	Value val = new Value();
	public BinaryTree() {
		root=null;
	}
    public BinaryTree(int item) {
		root=new Node(item);
	}
    
    void findMinMax(Node node,Value min,Value max,int hd)
    {
    	if(node==null)
    		return;
    	if(hd<min.min)
    		min.min=hd;
    	if(hd>max.max)
    		max.max=hd;
    	findMinMax(node.left, min, max, hd-1);
    	findMinMax(node.right, min, max,hd+1);
    }
    
    void printVerticalLine(Node node,int line_no,int hd)
    {
    	if(node==null)
    		return;
    	if(line_no==hd)
    		System.out.print(node.key+" ");
    	printVerticalLine(node.left, line_no, hd-1);
    	printVerticalLine(node.right,line_no, hd+1);
    }
    
    void printVerticalOrder(Node node)
    {
    	findMinMax(node, val, val, 0);
    	
    	for(int line_no=val.min;line_no<=val.max;line_no++)
    	{
    		printVerticalLine(node, line_no, 0);
    		System.out.println(" ");
    	}
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
         tree.root.right.left.right = new Node(8); 
         tree.root.right.right.right = new Node(9); 
    
         System.out.println("vertical order traversal is :"); 
         tree.printVerticalOrder(tree.root); 
	}
}
