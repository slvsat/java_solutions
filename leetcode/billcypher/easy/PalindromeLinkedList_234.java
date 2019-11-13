package leetcode.easy;

import leetcode.structures.ListNode;

import java.util.LinkedList;
import java.util.List;

public class PalindromeLinkedList_234 {


    // 827 ms - Native solution
    public boolean isPalindrome(ListNode head) {
        if (head == null) return true;
        List<Integer> res = new LinkedList<>();
        while(head != null) {
            res.add(head.val);
            head = head.next;
        }
        int len = res.size();
        for(int i = 0; i < len / 2; i++) {
            if (!res.get(i).equals(res.get(len - 1 - i))) return false;
        }
        return true;
    }

    // 1 ms - two pointers are always faster than any structure like List, Map, etc.
    public boolean isPalindromeTwoPointers(ListNode head) {
        ListNode fast = head, slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        if (fast != null) {
            slow = slow.next;
        }
        slow = reverse(slow);
        fast = head;
        while (slow != null) {
            if (fast.val != slow.val) {
                return false;
            }
            fast = fast.next;
            slow = slow.next;
        }
        return true;
    }


    private ListNode reverse(ListNode head) {
        ListNode prev = null;
        while (head != null) {
            ListNode next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
    }

}
