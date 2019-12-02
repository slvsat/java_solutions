package billcypher.easy;

import structures.LevelNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class N_aryTreeLevelOrderTraversal_429 {

    public List<List<Integer>> levelOrder(LevelNode root) {
        List<List<Integer>> result = new LinkedList<>();
        if (root == null) return result;
        Queue<LevelNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            List<Integer> intList = new LinkedList<>();
            int length = queue.size();
            for (int i = 0; i < length; i++) {
                LevelNode n = queue.poll();
                intList.add(n.val);
                for (LevelNode child: n.children) {
                    queue.add(child);
                }
            }
            result.add(intList);
        }
        return result;
    }
}
