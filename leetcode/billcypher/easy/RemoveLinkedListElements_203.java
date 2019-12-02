package billcypher.easy;

import structures.ListNode;

public class RemoveLinkedListElements_203 {

    public ListNode removeElements(ListNode head, int val) {
        ListNode prev = null;
        ListNode curr = head;

        while (curr != null) {
            if (curr.val == val) {
                ListNode newCurr = deleteNode(prev, curr);
                if (head == curr) {
                    head = newCurr;
                }
                curr = newCurr;
            } else {
                prev = curr;
                curr = curr.next;
            }
        }

        return head;
    }

    private ListNode deleteNode(ListNode prev, ListNode delete) {
        ListNode next = delete.next;
        delete.next = null;
        if (prev != null) {
            prev.next = next;
        }
        return next;
    }

}
