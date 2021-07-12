package leetcode.stormik.recursion;

import leetcode.structures.ListNode;

public class swap_pairs {

    public ListNode swapPairs(ListNode head) {
        return helper(head, 1);
    }

    public ListNode helper(ListNode head, int pointer) {
        if (head == null) return null;
        ListNode returnVal = head;
        ListNode next = null;
        if (pointer % 2 != 0) {
            if (head.next != null) {
                ListNode temp = head.next;
                head.next = temp.next;
                temp.next = head;
                returnVal = temp;
                next = temp.next;
            }
        } else {
            if (head.next != null && head.next.next != null) {
                next = head.next;
                head.next = head.next.next;
            }
        }
        helper(next, pointer+1);
        return returnVal;
    }



    // Better solution
//    public ListNode swapPairs(ListNode head) {
//
//        if(head==null)
//            return null;
//        if(head.next==null)
//            return head;
//        ListNode next=head.next;
//        ListNode third=next.next;
//        next.next=head;
//        head.next=swapPairs(third);
//        return next;
//    }
}
