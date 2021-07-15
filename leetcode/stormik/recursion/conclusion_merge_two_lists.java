package leetcode.stormik.recursion;

import leetcode.structures.ListNode;

public class conclusion_merge_two_lists {

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) return l2;
        if (l2 == null) return l1;
        ListNode root = null;
        if (l1.val < l2.val) {
            root = l1;
            helper(l1, l2);
        } else {
            root = l2;
            helper(l2, l1);
        }

        return root;
    }

    public ListNode helper(ListNode l1, ListNode l2) {
        if (l1 == null || l2 == null) return l1;

        ListNode second = null;
        ListNode first = null;

        if (l2.val >= l1.val) {
            if (l1.next != null) {
                if (l2.val <= l1.next.val) {
                    second = l2.next;
                    l2.next = l1.next;
                    l1.next = l2;
                    first = l2;
                } else {
                    first = l1.next;
                    second = l2;
                }
            } else {
                l1.next = l2;
            }
        } else {
            if (l2.next == null) {
                l1.next = l2;
            }
            second = l2.next;
        }
        return helper(first, second);
    }

    // Better solution
//    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
//        if (l1 == null) return l2;
//        if (l2 == null) return l1;
//        if (l1.val < l2.val) {
//            l1.next = mergeTwoLists(l1.next, l2);
//            return l1;
//        } else {
//            l2.next = mergeTwoLists(l1, l2.next);
//            return l2;
//        }
//    }

}
