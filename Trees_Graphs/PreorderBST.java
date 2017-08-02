import java.util.Stack;

public class PreorderBST {
	public static boolean checkBST(int[] arr, int n) {
		Stack<Integer> stack = new Stack<Integer>();
		int root  = Integer.MIN_VALUE;
		boolean bst = true;

		for (int i = 0; i < n; i++) {
			if (arr[i] < root) {
				bst = false;
			} 
			while(!stack.empty() && stack.peek() < arr[i]) {
				root = stack.peek();
				stack.pop();
			}
			stack.push(arr[i]);
		}
		
		return bst;
	}
	
	public static void main(String[] args) {
		int[] preorder = { 10, 5, 1, 7, 40, 50};
		
		if (checkBST(preorder, preorder.length)) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}
	}
}