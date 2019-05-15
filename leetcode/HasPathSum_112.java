package leetcode;

public class HasPathSum_112 {

    public boolean hasPathSum(TreeNode root, int sum) {
        if (root == null) return false;
        return pathSum(root, sum, 0) == 0;
    }

    public int pathSum(TreeNode node, int initial, int temp) {
        if (node == null) return -1;
        temp += node.val;
        if (temp == initial && node.left == null && node.right == null) return 0;
        if (temp == initial && node.left == null && node.right != null) return -1;
        if (temp == initial && node.left != null && node.right == null) return -1;
        int left = pathSum(node.left, initial, temp);
        int right = pathSum(node.right, initial, temp);
        return left * right;
    }

}
