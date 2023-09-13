package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import main.ConvertSortedArraytoBinarySearchTree;
import main.utils.TreeNode;

class ConvertSortedArraytoBinarySearchTreeTest {

	@Test
	void test() {
		int[] nums = new int[] {-10,-3,0,2,5};
		
		TreeNode left = new TreeNode(-10,null,new TreeNode(-3));
		TreeNode right = new TreeNode(2,null,new TreeNode(5));
		TreeNode expected = new TreeNode(0,left,right);
		
		ConvertSortedArraytoBinarySearchTree underTest = new ConvertSortedArraytoBinarySearchTree();
	
		TreeNode result = underTest.sortedArrayToBST(nums);
		
		assertEquals(expected, result);
	}

}
