package leetcode;

import leetcode.ListNode;

public class ReverseLinkedList_206 {

    public ListNode reverseList(ListNode head) {
        if (head == null) return head;
        ListNode previous = null;
        while(head != null) {
            ListNode tempNext = head.next;
            ListNode tempPrevious = head;
            head.next = previous;
            previous = tempPrevious;
            head = tempNext;
        }
        return previous;
    }

}
