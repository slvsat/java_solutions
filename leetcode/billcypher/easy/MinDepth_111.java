package billcypher.easy;

import structures.TreeNode;

public class MinDepth_111 {

    public int minDepth(TreeNode root) {
        if (root == null) return 0;
        return depth(root);
    }

    public int depth(TreeNode node) {
        if (node == null) return -1;
        int left = depth(node.left);
        int right = depth(node.right);
        if (left == -1 && right == -1) return 1;
        if (left == -1 || right == -1) return Math.max(left, right) + 1;
        return Math.min(left, right) + 1;
    }


}
