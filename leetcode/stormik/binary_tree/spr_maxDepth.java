package leetcode.stormik.binary_tree;

import structures.TreeNode;

// spr means Solve Problem Recursively
public class spr_maxDepth {

    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
    }

}
