class Node {
	int data;
	Node left, right;
	public Node(int item) {
		data = item;
		left = null;
		right = null;
	}
}

public class BinarySearchTree {
	Node root;
	
	int minimumDepth(){
		return minimumDepth(root);
	}
	
	int minimumDepth(Node root) {
		if (root == null) return 0;
		if (root.left == null && root.right == null) return 1;
		if (root.left == null) return minimumDepth(root.right) + 1;
		if (root.right == null) return minimumDepth(root.left) + 1;
		
		return Math.min(minimumDepth(root.left), minimumDepth(root.right)) + 1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinarySearchTree bst = new BinarySearchTree();
		bst.root = new Node(1);
        bst.root.left = new Node(2);
        bst.root.right = new Node(3);
        bst.root.left.left = new Node(4);
        bst.root.left.right = new Node(5);
 
        System.out.println("The minimum depth of " + "binary tree is : " + bst.minimumDepth());
	}

}