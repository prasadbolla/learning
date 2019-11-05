/**
 * 
 */
package com.learning.algorithms.lowestcommonancestorofBinarysearch;

/**
 * @author PRASADBolla
 *
 */
public class LowestCommonAncestor {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		

	}
public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q){
	if(p.val < root.val && q.val < root.val){
		return lowestCommonAncestor(root.left, p, q);
	}else if(p.val > root.val && q.val > root.val){
		return lowestCommonAncestor(root.right, p, q);
	}else{
		return root;
	}
}
public class TreeNode{
	int val;
	TreeNode left;
	TreeNode right;
	TreeNode(int x){val =x;};
}
}
