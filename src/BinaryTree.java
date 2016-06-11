class Node
{
    int data;
    Node left, right;
 
    public Node(int item)
    {
        data = item;
        left = right = null;
    }
}

class BinaryTree
{
    Node root;

    static int k = 0;

    static void printLastKNodes(Node node) {
    	if (node == null || k == 0)
    		return;

    		printLastKNodes(node.right);
    	
    	if (k > 0) {
            System.out.print(node.data + " ");
            k--;
    	}
        
        printLastKNodes(node.left);    	
    }
 
    /* testing for example nodes */
    public static void main(String args[])
    {
        /* creating a binary tree and entering the nodes */
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(12);
        tree.root.left = new Node(10);
        tree.root.right = new Node(30);
        tree.root.right.left = new Node(25);
        tree.root.right.right = new Node(40);
        
        k = 3;
        printLastKNodes(tree.root);        
    }
}