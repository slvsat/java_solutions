package leetcode.stormik.binary_tree;

import com.sun.org.apache.xpath.internal.operations.Bool;
import structures.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class conclusion_lca {

    private TreeNode res;

    public conclusion_lca(){
        res = null;
    }

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        helper(root, p, q);
        return this.res;
    }

    public boolean helper(TreeNode node, TreeNode p, TreeNode q) {
        if (node == null) return false;

        int left = helper(node.left, p, q) ? 1 : 0;
        int right = helper(node.right, p, q) ? 1 : 0;

        int mid = (node == p || node == q) ? 1 : 0;

        if (mid + left + right >= 2) this.res = node;

        return (mid + left + right > 0);
    }

    // Best submission by time
    // public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
    //
    //        if(root == null)
    //	            return null;
    //
    //	         if(root == (p) || root == (q))
    //	        	 return root;
    //
    //	        TreeNode left = lowestCommonAncestor(root.left,p, q);
    //	        TreeNode right = lowestCommonAncestor(root.right,p, q);
    //
    //	        if(left != null && right != null) return root;
    //
    //	        return (left != null) ? left : right;
    //
    //    }

}
