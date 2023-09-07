package main;

import main.utils.TreeNode;

public class SymmetricTree {
	public SymmetricTree() {

	}

	public boolean isSymmetric(TreeNode root) {
		if (root == null) {
			return false;
		}
		if(root.getLeft() == null && root.getRight() == null) {
			return true;
		}
		
		if(root.getLeft() != null && root.getRight() != null && root.getLeft().getVal() == root.getRight().getVal()) {
			return mirror(root.getLeft(), root.getRight());
		}
		
		return false;
	}
	
	private boolean mirror(TreeNode left, TreeNode right) {
		if(left == null && right == null) {
			return true;
		}
		
		if(left == null || right == null) {
			return false;
		}
		
		if(left.getLeft() != null && right.getRight() != null && left.getLeft().getVal() != right.getRight().getVal()) {
			return false;
		}
		
		if(left.getRight() != null && right.getLeft() != null && left.getRight().getVal() != right.getLeft().getVal()) {
			return false;
		}
		
		return mirror(left.getLeft(),right.getRight()) && mirror(left.getRight(),right.getLeft());
	}
}
