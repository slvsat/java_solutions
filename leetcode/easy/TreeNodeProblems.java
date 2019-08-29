package leetcode.easy;

import leetcode.structures.TreeNode;

import java.util.*;

public class TreeNodeProblems {
    // 100
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p != null && q != null) {
            if (p.val != q.val) return false;
        }
        else if (p != null && q == null) return false;
        else if (p == null && q != null) return false;
        else if (p == null && q == null) return true;
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }

    // Less code -->
//    public boolean isSameTree(DoneProblems.TreeNode p, DoneProblems.TreeNode q) {
//        if (p == null && q == null) return true;
//        if (p == null || q == null) return false;
//        if (p.val != q.val) return false;
//        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
//    }

    // 101
    public static boolean isSymmetric(TreeNode root) {
        if (root == null) return true;
        return isEqual(root.left, root.right);
    }

    public static boolean isEqual(TreeNode a, TreeNode b) {
        if (a == null && b == null) return true;
        if (a == null || b == null) return false;
        if (a.val != b.val) return false;
        return isEqual(a.left, b.right) && isEqual(a.right, b.left);
    }

    // 104
    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        return Math.max(maxDepth(root.left)+1, maxDepth(root.right)+1);
    }

    // 102
    public List<List<Integer>> levelOrder(TreeNode root) {
        if (root == null) return new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        List<List<Integer>> result = new ArrayList<>();
        queue.add(root);
        int count = 1;
        List<Integer> temp = new ArrayList<>();
        int secondsCount = 0;
        while(queue.size() != 0) {
            TreeNode s = queue.poll();
            if (s.left != null) {
                queue.add(s.left);
                secondsCount++;
            }
            if (s.right != null) {
                queue.add(s.right);
                secondsCount++;
            }
            if (count > 0) {
                temp.add(s.val);
                count--;
            }
            if (count == 0) {
                result.add(temp);
                temp = new ArrayList<>();
                count = secondsCount;
                secondsCount = 0;
            }
        }
        return result;
    }

    // 107
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> result = levelOrder(root);
        Collections.reverse(result);
        return result;
    }

    // 108
    public static TreeNode sortedArrayToBST(int[] nums) {
        if (nums.length < 1) return null;
        return binaryConstructor(nums, 0, nums.length - 1);
    }

    public static TreeNode binaryConstructor(int[] nums, int low, int high) {
        if (low > high) return null;
        int k = (low + high) / 2;
        TreeNode node = new TreeNode(nums[k]);
        node.left = binaryConstructor(nums, low, k - 1);
        node.right = binaryConstructor(nums, k + 1, high);
        return node;
    }
}
