import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import static org.junit.Assert.*;
import java.util.Stack;

public class ValidBstPt2 {
	public static class Node {
		public int value;
		public Node left;
		public Node right;
		
		Node(int value) {
			this.value = value;
		}
		
		Node insertLeft(int leftValue) {
			this.left = new Node(leftValue);
			return left;
		}
		
		Node insertRight(int rightValue) {
			this.right = new Node(rightValue);
			return right;
		}
	}
	
	private static class BoundNode {
		Node node;
		int lowerBound;
		int upperBound;
		
		BoundNode(Node node,int lowerBound, int upperBound) {
			this.node = node;
			this.lowerBound = lowerBound;
			this.upperBound = upperBound;
		}
	}
	
	public static boolean isBinarySearchTree(Node root) {
		Stack<BoundNode> stack = new Stack<>();
		stack.add(new BoundNode(root, Integer.MIN_VALUE, Integer.MAX_VALUE));
		
		while(!stack.isEmpty()) {
			BoundNode bNode = stack.pop();
			Node currentNode = bNode.node;
			int upperBound = bNode.upperBound;
			int lowerBound = bNode.lowerBound;
			
			if (currentNode.value <= lowerBound || currentNode.value >= upperBound) {
				return false;
			}
			
			if (currentNode.left != null) {
				stack.push(new BoundNode(currentNode.left, lowerBound, currentNode.value));
			}
			if (currentNode.right != null) {
				stack.push(new BoundNode(currentNode.right, currentNode.value, upperBound));
			}
		}
		return true;
	}
	
    @Test
    public void validFullTreeTest() {
        final Node root = new Node(50);
        final Node a = root.insertLeft(30);
        a.insertLeft(10);
        a.insertRight(40);
        final Node b = root.insertRight(70);
        b.insertLeft(60);
        b.insertRight(80);
        final boolean result = isBinarySearchTree(root);
        assertTrue(result);
    }

    @Test
    public void bothSubtreesValidTest() {
        final Node root = new Node(50);
        final Node a = root.insertLeft(30);
        a.insertLeft(20);
        a.insertRight(60);
        final Node b = root.insertRight(80);
        b.insertLeft(70);
        b.insertRight(90);
        final boolean result = isBinarySearchTree(root);
        assertFalse(result);
    }

    @Test
    public void descendingLinkedListTest() {
        final Node root = new Node(50);
        root.insertLeft(40).insertLeft(30).insertLeft(20).insertLeft(10);
        final boolean result = isBinarySearchTree(root);
        assertTrue(result);
    }

    @Test
    public void outOfOrderLinkedListTest() {
        final Node root = new Node(50);
        root.insertRight(70).insertRight(60).insertRight(80);
        final boolean result = isBinarySearchTree(root);
        assertFalse(result);
    }

    @Test
    public void oneNodeTreeTest() {
        final Node root = new Node(50);
        final boolean result = isBinarySearchTree(root);
        assertTrue(result);
    }

    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(ValidBstPt2.class);
        for (Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }
        if (result.wasSuccessful()) {
            System.out.println("All tests passed.");
        }
    }
}
