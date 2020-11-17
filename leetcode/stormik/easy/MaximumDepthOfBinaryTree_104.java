package leetcode.stormik.easy;

public class MaximumDepthOfBinaryTree_104 {

    public int maxDepth(structures.TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }

}
