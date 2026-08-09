package LinkedList.Problems;

import LinkedList.Problems.AddToNumber.ListNode;

public class RemoveElement {
    public ListNode removeElements(ListNode head, int val) {
        // Dummy node points to head so 'slow' can stay one step behind 'fast'
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode slow = dummy;
        ListNode fast = head;
    

        while (fast != null) {
            if (fast.val == val) {
                // Bypass the target node
                slow.next = fast.next;
                // Advance fast to the next unexamined node, keeping slow in place
                fast = fast.next;
            } else {
                // Move both pointers forward if no deletion happened
                slow = slow.next;
                fast = fast.next;
            }
        }

        // Return the new head (handles cases where the original head was removed)
        return dummy.next;
    }
}
