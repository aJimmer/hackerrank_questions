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
	
	boolean isFullTree(Node root) {
		if (root == null) return true;
		if (root.left == null && root.right == null) return true;
		if ((root.left != null) && (root.right != null)) return (isFullTree(root.right));
		
		return false;
	}
	
	public static void main(String[] args) {

		
	}
}