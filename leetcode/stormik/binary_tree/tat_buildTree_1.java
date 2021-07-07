package leetcode.stormik.binary_tree;

import structures.TreeNode;

import java.util.HashMap;
import java.util.Map;


public class tat_buildTree_1 {

    // Inorder & Postorder traversal results
    Map<Integer, Integer> inordermap = new HashMap<>();
    int position = 0;

    public TreeNode buildTree(int[] inorder, int[] postorder) {
        position = inorder.length-1;
        for (int i = 0; i < inorder.length; i++) {
            inordermap.put(inorder[i], i);
        }
        return construct(postorder, 0, inorder.length-1);
    }

    public TreeNode construct(int[] post, int l, int r) {
        //System.out.println("Current node: " + post[position] + " left: " + l + " right: " + r);
        if (l > r) return null;
        if (l == r) return new TreeNode(post[position--]);

        int val = post[position--];
        TreeNode root = new TreeNode(val);

        root.right = construct(post, inordermap.get(val)+1, r);
        root.left = construct(post, l, inordermap.get(val)-1);

        return root;
    }

}
