package leetcode.stormik.recursion;

import structures.TreeNode;

public class search_bst {

    public TreeNode searchBST(TreeNode root, int val) {
        if (root == null) return null;
        if (val == root.val) return root;
        return val < root.val ? searchBST(root.left, val) : searchBST(root.right, val);
    }

}
