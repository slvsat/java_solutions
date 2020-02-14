package leetcode.stormik.easy;

public class SameTree_100 {

    public boolean isSameTree(structures.TreeNode p, structures.TreeNode q) {
        if (p == null && q != null) return false;
        else if (q == null && p != null) return false;
        else if (q == null && p == null) return true;
        if (p.val != q.val) return false;
        return isSameTree(p.left, q.left) & isSameTree(p.right, q.right);
    }

}
