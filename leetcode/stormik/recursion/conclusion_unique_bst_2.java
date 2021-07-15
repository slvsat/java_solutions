package leetcode.stormik.recursion;

import structures.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class conclusion_unique_bst_2 {

    public List<TreeNode> generateTrees(int n) {
        help(1, n);
    }

    public List<TreeNode> help(int start, int end) {
        List<TreeNode> result = new ArrayList<>();

        if (start > end) {
            List<TreeNode> tRes = new ArrayList<>();
            tRes.add(null);
            return tRes;
        } else if (start == end) {
            List<TreeNode> tRes = new ArrayList<>();
            tRes.add(new TreeNode(start));
            return tRes;
        } else if (start <= 0) {
            List<TreeNode> tRes = new ArrayList<>();
            tRes.add(null);
            return tRes;
        }

        for (int i = start; i <= end; i++) {
            List<TreeNode> leftT = help(start, i-1);
            List<TreeNode> rightT = help(i+1, end);


            for (int d = 0; d < leftT.size(); d++) {
                TreeNode left = leftT.get(d);
                for (int f = 0; f < rightT.size(); f++) {
                    TreeNode right = rightT.get(f);

                    TreeNode curr = new TreeNode(i);
                    curr.left = left;
                    curr.right = right;
                    result.add(curr);
                }
            }

        }

        return result;
    }

}
