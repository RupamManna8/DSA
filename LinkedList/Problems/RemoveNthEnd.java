package LinkedList.Problems;

import LinkedList.Problems.AddToNumber.ListNode;

import java.util.List;

import LinkedList.Problems.AddToNumber;

public class RemoveNthEnd {
    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode countNode = head;
        ListNode temp = head;
        int length = 0;
        int pos = 0;
        while (countNode != null) {
            length = length + 1;
            countNode = countNode.next;
        }
        while (pos != length - n - 1 && length - n - 1 >= 0) {
            temp = temp.next;
            pos++;
        }
        if (n == length) {
            return head.next;
        } else {
            temp.next = temp.next.next;
        }

        return head;
    }

    public static void main(String[] args) {
        AddToNumber obj = new AddToNumber();
        ListNode head = new ListNode();
        obj.addNode(head, 1);
        obj.addNode(head, 2);
        // obj.addNode(head, 3);
        // obj.addNode(head, 4);

        removeNthFromEnd(head, 2);
        obj.Print(head.next);
    }
}
