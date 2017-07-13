/*
	CTCI Trees and Graphs
	 4.3 List of Depths: Given a binary tree, design an algorithm which creates a linked list of all the nodes at each depth.
*/

class ListOfDepths {

	class TreeNode {
		int data;
		TreeNode left;
		TreeNode right;
	}

	/* pre-order DFS implementation */
	public void createLevelLinkedListDFS(TreeNode root, ArrayList<LinkedList<TreeNode>> lists, int level) {
		if (root == null) return;

		LinkedList<TreeNode> list = null;
		if (list.size() == level) {
			list = new LinkedList<TreeNode>();
			lists.add(list);
		} else {
			list = lists.get(level);
		}
		list.add(root);
		createLevelLinkedListDFS(root.left, lists, level + 1);
		createLevelLinkedListDFS(root.right, lists, level + 1);
	}
	
	public ArrayList<LinkedList<TreeNode>> createLevelLinkedListDFS(TreeNode root) {
		ArrayList<LinkedList<TreeNode>> lists = new ArrayList<LinkedList<TreeNode>>();
		createLevelLinkedListDFS(root, lists, 0);
		return lists;
	}

	/* pre-order BFS implementation */
	public ArrayList<LinkedList<TreeNode>> createLevelLinkedListBFS(TreeNode root) {
		ArrayList<LinkedList<TreeNode>> result = new ArrayList<LinkedList<TreeNode>>();
		LinkedList<TreeNode> current = new LinkedList<TreeNode>();
		if(root != null) {
			current.add(root);
		}
		while(current.size() > 0) {
			result.add(current);
			LinkedList<TreeNode> parents = current;
			current = new LinkedList<TreeNode>();
			for(TreeNode parent : parents) {
				if(parent.left != null) {
					current.add(parent.left);
				}
				if(parent.right != null) {
					current.add(parent.right);
				}
			}
		}
		return result;
 	}
 	
	public static void main(String args[]){

	}
}
