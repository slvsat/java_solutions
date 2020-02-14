package leetcode.stormik.easy;

public class SymmetricTree_101 {

    public boolean isSymmetric(structures.TreeNode root) {
        if (root == null) return true;
        return isChildSymmetric(root.left, root.right);
    }

    private boolean isChildSymmetric(structures.TreeNode p, structures.TreeNode q) {
        if (p == null && q == null) return true;
        if (p != null && q == null) return false;
        if (p == null && q != null) return false;
        if (p.val != q.val) return false;
        return isChildSymmetric(p.left, q.right) & isChildSymmetric(p.right, q.left);
    }

}
