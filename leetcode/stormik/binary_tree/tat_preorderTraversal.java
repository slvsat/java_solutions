package leetcode.stormik.binary_tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import structures.TreeNode;

// tat - traverse a tree
public class tat_preorderTraversal {

    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if (root == null) return res;

        Stack<TreeNode> preoder = new Stack<>();
        preoder.push(root);

        while(!preoder.empty()) {
            TreeNode curr = preoder.pop();
            if (curr.right != null) preoder.push(curr.right);
            if (curr.left != null) preoder.push(curr.left);
            res.add(curr.val);
        }
        return res;
    }

    public List<Integer> preorderTraversalRecursion(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if (root == null) return res;
        res.add(root.val);
        if (root.left != null) res.addAll(preorderTraversalRecursion(root.left));
        if (root.right != null) res.addAll(preorderTraversalRecursion(root.right));
        return res;
    }

}
