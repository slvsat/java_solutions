import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IntersectionOfTwoLinkedLists_160 {

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        Map<ListNode, Integer> res = new HashMap<>();
        while(headA != null) {
            res.put(headA, 1);
            headA = headA.next;
        }
        while(headB != null) {
            if (res.get(headB) != null && res.get(headB) == 1) return headB;
            headB = headB.next;
        }
        return null;
    }

    public ListNode getIntersectionNodeTwoPointersMine(ListNode headA, ListNode headB) {
        ListNode a = headA;
        ListNode b = headB;
        while(a != null && b != null) {
            if (a == b) return a;
            if (a.next == null && b.next != null) {
                a = headB;
                b = b.next;
                continue;
            }
            else if (b.next == null && a.next != null) {
                b = headA;
                a = a.next;
                continue;
            }
            a = a.next;
            b = b.next;
        }
        return null;
    }

    public ListNode getIntersectionNodeTwoPointersFromSolutions(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) return null;

        ListNode nextA = headA;
        ListNode nextB = headB;

        while(nextA != nextB) {
            nextA = nextA == null ? headB : nextA.next;
            nextB = nextB == null ? headA : nextB.next;
        }

        return nextA;

    }

}
