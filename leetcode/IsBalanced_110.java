package leetcode;

public class IsBalanced_110 {

    public boolean isBalanced(TreeNode root) {
        if (root == null) return true;
        return (dfs(root) != -1);
    }

    public int dfs(TreeNode node) {
        if (node == null) return 0;
        int left = dfs(node.left);
        int right = dfs(node.right);
        if (left == -1 || right == -1) return -1;
        if (Math.abs(left - right) > 1) return -1;
        return Math.max(left, right) + 1;
    }

}
