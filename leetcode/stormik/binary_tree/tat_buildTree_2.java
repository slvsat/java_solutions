package leetcode.stormik.binary_tree;

import structures.TreeNode;

import java.util.HashMap;
import java.util.Map;

public class tat_buildTree_2 {

    Map<Integer, Integer> inordermap = new HashMap<>();
    int position = 0;

    public TreeNode buildTree(int[] preorder, int[] inorder) {

        for (int i = 0; i < inorder.length; i++) {
            inordermap.put(inorder[i], i);
        }
        return construct(preorder, 0, preorder.length-1);
    }

    public TreeNode construct(int[] preorder, int l, int r) {
        if (l > r) return null;
        if (l == r) return new TreeNode(preorder[position++]);

        int val = preorder[position++];
        TreeNode root = new TreeNode(val);

        root.left = construct(preorder, l, inordermap.get(val) - 1);
        root.right = construct(preorder, inordermap.get(val) + 1, r);

        return root;
    }

}
