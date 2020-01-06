package leetcode.stormik;

import structures.ListNode;

public class MergeTwoLists_21 {

    public structures.ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) return l2;
        else if (l2 == null) return l1;
        ListNode root = new ListNode(-1);
        ListNode head = root;
        while(l1 != null && l2 != null) {
            if (l1.val > l2.val) {
                root.next = l2;
                l2 = l2.next;
            } else {
                root.next = l1;
                l1 = l1.next;
            }
            root = root.next;
        }
        if (l1 == null) {
            root.next = l2;
        } else {
            root.next = l1;
        }
        return head.next;
    }

}
