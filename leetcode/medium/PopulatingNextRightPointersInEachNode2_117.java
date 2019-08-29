package leetcode.medium;

import leetcode.structures.Node;

public class PopulatingNextRightPointersInEachNode2_117 {

    // Check this solutions out.
    public Node connect(Node root) {
        Node main = root;
        while(root != null){
            Node tempChild = new Node(0);
            Node currentChild = tempChild;
            while(root!=null){
                if(root.left != null) { currentChild.next = root.left; currentChild = currentChild.next;}
                if(root.right != null) { currentChild.next = root.right; currentChild = currentChild.next;}
                root = root.next;
            }
            root = tempChild.next;
        }
        return main;
    }

}
