package main;

import main.utils.TreeNode;

public class MaxDepthBinaryTree {
	public MaxDepthBinaryTree() {
		
	}
	
	public int maxDepth(TreeNode root) {
		int depth = 1;
		if(root == null) {
			return 0;
		}
		
		if(root.getLeft() != null || root.getRight() != null) {
			return depth + compareChild(root.getLeft(),root.getRight());
		}
		
		return 1;
	}
	
	private int compareChild(TreeNode left,TreeNode right) {
		int leftDepth = 0;
		int rightDepth = 0;
		if(left != null) {
			leftDepth++;
			leftDepth += compareChild(left.getLeft(),left.getRight());
		}
		if(right != null) {
			rightDepth++;
			rightDepth += compareChild(right.getLeft(), right.getRight());
		}
		
		return rightDepth > leftDepth ? rightDepth : leftDepth;
		
	}
}
