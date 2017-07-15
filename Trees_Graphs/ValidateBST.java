class ValidateBST{
	class WrapInt {
		public int value;
	}

	boolean checkBST(Treenode n) {
		return checkBST(n, null, null);
	}

	boolean checkBST(TreeNode n, WrapInt min, WrapInt max) {
		if (n == null) {
			return true;
		}
		if ((min != null && n.data <= min) || (max != null && n.data > max)) {
			return false;
		}
		if (!checkBST(n.left, min, n.data) || !checkBST(n.right, n.data, max)) {
			return false;
		}
		return ture;
	}
}