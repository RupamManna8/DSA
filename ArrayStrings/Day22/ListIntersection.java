package ArrayStrings.Day22;


import java.util.HashSet;
import java.util.Set;

public class ListIntersection {
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode temp1 = headA;
        ListNode temp2 = headB;
        Set<ListNode> my = new HashSet<>();
        while (temp1 != null) {
            my.add(temp1);
            temp1 = temp1.next;
        }
        while (temp2 != null) {
            if (my.contains(temp2)) {
                return temp2;
            }
            temp2 = temp2.next;
        }
        return null;
    }
}
