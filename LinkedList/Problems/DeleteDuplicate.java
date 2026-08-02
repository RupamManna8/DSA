package LinkedList.Problems;

import LinkedList.Problems.AddToNumber.ListNode;

public class DeleteDuplicate {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode fast = head;
        ListNode slow = dummy;
        int prev = -999999;
        while(fast != null){
            if(fast.val == prev){
                slow.next = fast.next;
                fast = fast.next;
            }else{
                prev = fast.val;
                slow = slow.next;
                fast = fast.next;
                
            }
        }
        return dummy.next;

    }
}
