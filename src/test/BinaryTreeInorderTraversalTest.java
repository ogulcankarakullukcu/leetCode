package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

import main.BinaryTreeInorderTraversal;
import main.utils.TreeNode;

class BinaryTreeInorderTraversalTest {

	@Test
	void testInorderTraversal() {
		/*TreeNode left = new TreeNode(2, new TreeNode(4), new TreeNode(5));
		TreeNode right = new TreeNode(3, new TreeNode(6), new TreeNode(7));
		TreeNode input = new TreeNode(1, left, right);
		
		List<Integer> expected = Arrays.asList(4,2,5,1,6,3,7);*/
		
		TreeNode left = new TreeNode(2);
		TreeNode right = new TreeNode(3, new TreeNode(6), new TreeNode(7));
		TreeNode input = new TreeNode(1, left, right);
		
		List<Integer> expected = Arrays.asList(2,1,6,3,7);
		
		BinaryTreeInorderTraversal underTest = new BinaryTreeInorderTraversal();
		
		List<Integer> actual = underTest.inorderTraversal(input);
		
		assertEquals(expected, actual);
	}

}
