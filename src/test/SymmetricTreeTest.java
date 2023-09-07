package test;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.Test;

import main.SymmetricTree;
import main.utils.TreeNode;

class SymmetricTreeTest {

	@Test
	void testIsSymmetric() {
		TreeNode left = new TreeNode(2, new TreeNode(4), new TreeNode(5));
		TreeNode right = new TreeNode(2, new TreeNode(5), new TreeNode(4));
		TreeNode input = new TreeNode(1, left, right);
				
		SymmetricTree underTest = new SymmetricTree();
		
		assertTrue(underTest.isSymmetric(input));
	}
	
	@Test
	void IsNotSymmetric() {
	
		TreeNode falseLeft = new TreeNode(3);
		TreeNode falseRight = new TreeNode(2, new TreeNode(5), new TreeNode(4));
		TreeNode falseInput = new TreeNode(1, falseLeft, falseRight);
		
		SymmetricTree underTest = new SymmetricTree();
				
		assertFalse(underTest.isSymmetric(falseInput));
		
	}

}
