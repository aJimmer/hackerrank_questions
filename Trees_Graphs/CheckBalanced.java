class CheckBalanced {
	class TreeNode {
		TreeNode left;
		TreeNode right;
		int data;
	}

	int checkHeight(TreeNode root) {
		if (root == null) return -1;

		int leftHeight = checkHeight(root.left);
		if (leftHeight == Integer.MIN_VALUE) return Integer.MIN_VALUE;

		int rightHeight = checkHeight(root.right);
		if (rightHeight == Integer.MIN_VALUE) return Integer.MIN_VALUE;

		int heightDff = leftHeight - rightHeight;
		if (Math.abs(heightDff) > 1) {
			return Integer.MIN_VALUE;
		} else {
			return Math.max(leftHeight, rightHeight) + 1;
		}
	}

	boolean isBalanced(TreeNode root) {
		return checkHeight(root) != Integer.MIN_VALUE;
	}
}