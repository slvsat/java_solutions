package leetcode.stormik.recursion;

import leetcode.structures.ListNode;

public class reverse_list {

    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode node = reverseList(head.next);
        ListNode per = node;
        while (node.next != null) {
            node = node.next;
        }
        node.next = head;
        head.next = null;
        return per;
    }

}
