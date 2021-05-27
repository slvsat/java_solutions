package leetcode.stormik.binary_tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import structures.TreeNode;

public class tat_postorderTraversal {

    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if (root == null) return res;
        Stack<TreeNode> treeStack = new Stack<>();
        TreeNode curr = root;

        while(curr != null || !treeStack.isEmpty()) {
            while(curr != null) {
                treeStack.push(curr);
                curr = curr.left;
            }
            curr = treeStack.peek();
            if (curr.left == null || curr.left.val == 101) {
                if (curr.right == null || curr.right.val == 101) {
                    treeStack.pop();
                    res.add(curr.val);
                    curr.val = 101;
                    curr = null;
                } else {
                    curr = curr.right;
                }
            }
        }
        return res;
    }

    public List<Integer> postorderTraversalRecursion(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if (root == null) return res;

        if (root.left != null) res.addAll(postorderTraversalRecursion(root.left));
        if (root.right != null) res.addAll(postorderTraversalRecursion(root.right));
        res.add(root.val);
        return res;
    }

}
