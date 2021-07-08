package leetcode.stormik.binary_tree;

import structures.Node;

import java.util.LinkedList;
import java.util.Queue;

public class conclusion_connect {

    // Non recursion solution
    public Node connect(Node root) {
        Queue<Node> map = new LinkedList<>();
        map.add(root);
        int pointer = 1;
        while(!map.isEmpty()) {
            int blank = 0;
            for (int i = 0; i < pointer; i++) {
                Node temp = map.poll();
                if (temp == null) continue;
                map.add(temp.left);
                map.add(temp.right);
                blank += 2;
                if (i+1 == pointer) {
                    temp.next = null;
                } else {
                    temp.next = map.peek();
                }
            }
            pointer = blank;
        }
        return root;
    }

    public Node recursionConnect(Node root) {
        return helperRec(root);
    }

    public Node helperRec(Node one) {
        if (one == null || one.left == null) return one;
        one.left.next = one.right;

        if (one.next != null) {
            one.right.next = one.next.left;
        }
        helperRec(one.left);
        helperRec(one.right);
        return one;
    }

}
