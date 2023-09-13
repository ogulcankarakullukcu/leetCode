package test;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import main.MaxDepthBinaryTree;
import main.utils.TreeNode;

class MaxDepthBinaryTreeTest {

	@Test
	void testMaxDepth() {
	
		TreeNode left = new TreeNode(2);
		TreeNode rightRight = new TreeNode(7,new TreeNode(8),null);
		TreeNode right = new TreeNode(3, new TreeNode(6), rightRight);
		TreeNode input = new TreeNode(1, left, right);

		int expected = 4;
		
		MaxDepthBinaryTree underTest = new MaxDepthBinaryTree();
		
		assertTrue(expected == underTest.maxDepth(input));
	}

}
