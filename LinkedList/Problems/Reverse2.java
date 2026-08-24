package LinkedList.Problems;

public class Reverse2 {
       public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
    public ListNode reverse(ListNode head, int count) {
        ListNode temp = head;
        ListNode prev = null;
        int idx = 1;
        ListNode temp2 = head;
        while (temp != null && idx <= count) {
            ListNode next = temp.next;
            temp.next = prev;
            prev = temp;
            temp = next;
            idx++;
        }
        temp2.next = temp;
        return prev;
    }

    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (left >= right || head == null) {
            return head;
        }
        int countToRev = right - left + 1;
        if (left == 1) {
            return reverse(head, countToRev);
        }
        ListNode slow = null;
        ListNode fast = head;
        int count = 1;
        while (fast != null && count != left) {
            slow = fast;
            fast = fast.next;
            count++;
        }
        ListNode next = reverse(fast, countToRev);
        slow.next = next;
        return head;
    }
}