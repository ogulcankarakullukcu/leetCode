package main;

import main.utils.TreeNode;

public class ConvertSortedArraytoBinarySearchTree {
	public ConvertSortedArraytoBinarySearchTree() {
		
	}
	public TreeNode sortedArrayToBST(int[] nums) {
		if(nums.length == 1) {
			return new TreeNode(nums[0]);
		}		
		return bst(nums,0,nums.length - 1);
	}
	
	private TreeNode bst(int[] nums,int left,int right) {
	
		if(left > right) {
			return null;
		}
		
		int median = (left + right) / 2;
		TreeNode root = new TreeNode(nums[median]);
		root.setLeft(bst(nums,left,median -1));
		root.setRight(bst(nums,median + 1,right));
		
		
		return root;
    }
}
