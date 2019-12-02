package billcypher.easy;

import structures.TreeNode;
import sun.reflect.generics.tree.Tree;

public class SumOfLeftLeaves_404 {

    public int sumOfLeftLeaves(TreeNode root) {
        if (root == null) return 0;
        if (root.left == null && root.right == null) return 0;
        return getVal(root.left, true) + getVal(root.right, false);
    }

    private int getVal(TreeNode root, Boolean leftLeaf) {
        if (root == null) return 0;
        if (root.left == null && root.right == null) return leftLeaf ? root.val : 0;
        if (root.left == null && root.right != null) {
            return getVal(root.right, false);
        }
        if (root.right == null && root.left != null) {
            return getVal(root.left, true);
        }
        return getVal(root.left, true) + getVal(root.right, false);
    }

}
