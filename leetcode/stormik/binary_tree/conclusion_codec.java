package leetcode.stormik.binary_tree;

import structures.TreeNode;

import java.util.*;

public class conclusion_codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        StringBuilder r = new StringBuilder();
        dfs(r, root);
        return r.toString();
    }

    public void dfs(StringBuilder path, TreeNode root) {
        if (root == null) path.append("null ");
        else {
            path.append(root.val + " ");
            dfs(path, root.left);
            dfs(path, root.right);
        }
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        Queue<String> in = new LinkedList<>(Arrays.asList(data.split(" ")));
        return helper(in);
    }

    public TreeNode helper(Queue<String> q) {
        TreeNode node;
        String curr = q.poll();
        if (curr.equals("null")) return null;
        else node = new TreeNode(Integer.parseInt(curr));

        node.left = helper(q);
        node.right = helper(q);

        return node;
    }

}
