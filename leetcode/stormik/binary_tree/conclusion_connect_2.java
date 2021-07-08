package leetcode.stormik.binary_tree;

import structures.Node;

public class conclusion_connect_2 {

    public Node connect(Node root) {
        return helper(root);
    }

    public Node helper(Node node) {
        if (node == null) return node;

        if (node.left != null) {
            if (node.right != null) node.left.next = node.right;
            else {
                Node temp = node.next;
                while(temp != null && temp.left == null && temp.right == null) {
                    temp = temp.next;
                }
                if (temp != null) {
                    if (temp.left != null) node.left.next = temp.left;
                    else node.left.next = temp.right;
                }
            }
        }
        if (node.next != null && node.right != null) {
            Node temp = node.next;
            while(temp != null && temp.left == null && temp.right == null) {
                temp = temp.next;
            }
            if (temp != null) {
                if (temp.left != null) node.right.next = temp.left;
                else node.right.next = temp.right;
            }
        }

        if (node.left != null || node.right != null) {
            helper(node.left);
            helper(node.right);
        }
        return node;
    }

}
