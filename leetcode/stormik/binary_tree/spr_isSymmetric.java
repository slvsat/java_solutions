package leetcode.stormik.binary_tree;

import structures.TreeNode;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class spr_isSymmetric {

    public boolean isSymmetric(TreeNode root) {
        List<List<Integer>> toCompare = new ArrayList<>();
        Queue<TreeNode> qu = new LinkedList<>();
        qu.add(root);
        int point = 1;
        while(!qu.isEmpty()) {
            List<Integer> tempRes = new ArrayList<>();
            int tmpPoint = 0;
            for (int i = 0; i < point; i++) {
                TreeNode retr = qu.poll();
                if (retr == null) {
                    tempRes.add(-101);
                    continue;
                }
                qu.add(retr.left);
                qu.add(retr.right);
                tmpPoint += 2;
                tempRes.add(retr.val);
            }
            point = tmpPoint;
            if (tempRes.size() > 0) toCompare.add(tempRes);
        }

        for (List<Integer> ls : toCompare) {
            int l = 0;
            int r = ls.size() - 1;
            while (l < r) {
                if (!ls.get(l).equals(ls.get(r))) return false;
                l++;
                r--;
            }
        }
        return true;
    }

}
