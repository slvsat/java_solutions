package leetcode.stormik.medium;

import leetcode.structures.ListNode;

import java.util.List;

public class AddTwoNumbers_2 {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
        ListNode current = head;
        int carry = 0;
        while(l1 != null && l2 != null) {
            int val = l1.val + l2.val + carry;
            if (val >= 10) {
                carry = val / 10;
            } else {
                carry = 0;
            }
            current.next = new ListNode(val % 10);
            current = current.next;
            l1 = l1.next;
            l2 = l2.next;
        }
        if (l1 != null && l2 == null) {
            while (l1 != null) {
                int val = l1.val + carry;
                if (val >= 10) {
                    carry = val / 10;
                } else {
                    carry = 0;
                }
                current.next = new ListNode(val % 10);
                current = current.next;
                l1 = l1.next;
            }
            if (carry != 0) {
                current.next = new ListNode(carry);
            }
        } else if (l1 == null && l2 != null) {
            while(l2 != null){
                int val = l2.val + carry;
                if (val >= 10) {
                    carry = val / 10;
                } else {
                    carry = 0;
                }
                current.next = new ListNode(val % 10);
                current = current.next;
                l2 = l2.next;
            }
            if (carry != 0) {
                current.next = new ListNode(carry);
            }
        } else if (l1 == null && l2 == null) {
            if (carry != 0) {
                current.next = new ListNode(carry);
            }
        }
        return head.next;
    }

}
