package MinimalTree;

class MinimalTree {
	class TreeNode {
		TreeNode left;
		TreeNode right;
		int num;
		
		TreeNode(int num_) {
			num = num_;
		}
	}
	TreeNode createMinimalBST(int array[]) {
		return createMinimalBST(array, 0, array.length - 1);
	}

	TreeNode createMinimalBST(int arr[], int start, int end) {
		if (end < start) {
			return null;
		}
		int mid = (start + end) / 2;
		TreeNode n = new TreeNode(arr[mid]);
		n.left = createMinimalBST(arr, start, mid - 1);
		n.right = createMinimalBST(arr, mid + 1, end); 
		return n;
	}

	public void main(String args[]) {
		int[] arr = {3, 19, 20, 28, 29, 45, 46, 67, 72, 88};
		TreeNode bst = createMinimalBST(arr);
	}
}