package leetcode.stormik.binary_tree;

import java.util.*;

import structures.TreeNode;

public class tat_levelOrderTraversal {

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null) return res;
        Queue<TreeNode> st = new LinkedList<>();
        st.add(root);
        int point = 1;

        while(!st.isEmpty()) {
            int tempPoint = 0;
            List<Integer> tempRes = new ArrayList<>();
            for (int i = 0; i < point; i++) {
                TreeNode temp = st.poll();
                tempRes.add(temp.val);
                if (temp.left != null) {
                    st.add(temp.left);
                    tempPoint++;
                }
                if (temp.right != null) {
                    st.add(temp.right);
                    tempPoint++;
                }
            }
            point = tempPoint;
            res.add(tempRes);
        }
        return res;
    }

}
