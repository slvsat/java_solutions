package leetcode.stormik.binary_tree;

import structures.TreeNode;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class spr_isSymmetric {

    public boolean isSymmetric(TreeNode root) {
        return isMirror(root.left, root.right);
    }

    public boolean isMirror(TreeNode left, TreeNode right) {
        if (left == null && right == null) return true;
        if (left == null || right == null) return false;
        return (left.val == right.val) && isMirror(left.left, right.right) && isMirror(left.right, right.left);
    }

    public boolean isSymmetricIterative(TreeNode root) {
        Queue<TreeNode> it = new LinkedList<>();
        it.add(root);
        it.add(root);
        while(!it.isEmpty()) {
            TreeNode t1 = it.poll();
            TreeNode t2 = it.poll();
            if (t1 == null && t2 == null) continue;
            if (t1 == null || t2 == null) return false;
            if (t1.val != t2.val) return false;
            it.add(t1.left);
            it.add(t2.right);
            it.add(t1.right);
            it.add(t2.left);
        }
        return true;
    }

}
