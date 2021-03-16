package leetcode.stormik.easy;

import java.util.LinkedList;
import java.util.Queue;

public class HasPathSum_112 {

    public boolean hasPathSum(structures.TreeNode root, int targetSum) {
        if (root == null) return false;

        int current = targetSum - root.val;
        if (root.left == null && root.right == null) {
            return current == 0;
        }
        if (root.left == null) return hasPathSum(root.right, current);
        if (root.right == null) return hasPathSum(root.left, current);
        return hasPathSum(root.left, current) | hasPathSum(root.right, current);
    }

}
