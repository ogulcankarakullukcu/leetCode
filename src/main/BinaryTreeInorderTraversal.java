package main;

import java.util.ArrayList;
import java.util.List;

import main.utils.TreeNode;

public class BinaryTreeInorderTraversal {

		public List<Integer> inorderTraversal(TreeNode root){
			List<Integer> result = new ArrayList<Integer>();
			if(root != null) {
				TreeNode left = root.getLeft();
				result.addAll(inorderTraversal(left));
				
				result.add(root.getVal());
				
				TreeNode right = root.getRight();
				result.addAll(inorderTraversal(right));				
			}
			
			return result;
		}
	
}
