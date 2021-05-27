package leetcode.stormik.binary_tree;

import java.util.*;

import structures.TreeNode;

public class tat_inorderTraversal {

    public List<Integer> inorderTraversalRecursive(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if (root == null) return res;

        if (root.left != null) res.addAll(inorderTraversalRecursive(root.left));
        res.add(root.val);
        if (root.right != null) res.addAll(inorderTraversalRecursive(root.right));
        return res;
    }

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if (root == null) return res;
        Map<TreeNode, Integer> walked = new HashMap<>();
        Stack<TreeNode> walk = new Stack<>();
        walk.push(root);
        while(!walk.empty()) {
            TreeNode temp = walk.pop();
            if (walked.get(temp) != null && walked.get(temp) == 1) {
                res.add(temp.val);
                continue;
            }
            if (temp.left != null || temp.right != null) {
                if (temp.right != null) {
                    walk.push(temp.right);
                }
                walk.push(temp);
                walked.put(temp, 1);
                if (temp.left != null) {
                    walk.push(temp.left);
                }
            } else {
                res.add(temp.val);
            }
        }

        return res;
    }

}
