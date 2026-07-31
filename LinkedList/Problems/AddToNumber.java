package LinkedList.Problems;

public class AddToNumber {
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

    public void addNode(ListNode head, int val) {
        ListNode newNode = new ListNode(val);
        ListNode temp = head;
        if (head == null) {
            head = newNode;
            return;
        }
        while (temp.next != null) {
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;

    }
    public void Print(ListNode head){
        ListNode temp = head;
        while (temp != null) {
            System.out.println(temp.val);
            temp = temp.next;
        }
    }

    // public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    // ListNode ans = new ListNode(0);
    // ListNode temp1 = l1;
    // ListNode temp2 = l2;
    // int carry = 0;
    // while (temp1 != null && temp2 != null) {
    // int sum = temp1.val + temp2.val + carry;
    // if (sum > 9) {
    // addNode(ans, sum % 10);
    // carry = 1;
    // } else {
    // addNode(ans, sum);
    // carry = 0;
    // }

    // temp1 = temp1.next;
    // temp2 = temp2.next;
    // }
    // while (temp1 != null) {
    // int sum = temp1.val + carry;
    // if (sum > 9) {
    // addNode(ans, sum % 10);
    // carry = 1;
    // } else {
    // addNode(ans, sum);
    // carry = 0;
    // }
    // temp1 = temp1.next;
    // }
    // while (temp2 != null) {
    // int sum = temp2.val + carry;
    // if (sum > 9) {
    // addNode(ans, sum % 10);
    // carry = 1;
    // } else {
    // addNode(ans, sum);
    // carry = 0;
    // }
    // temp2 = temp2.next;
    // }
    // if(carry == 0){
    // return ans;
    // }else{
    // addNode(ans, carry);
    // return ans;
    // }

    // }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode ans = new ListNode(0);
        ListNode temp = ans;
        int carry = 0;
        while (l1 != null || l2 != null || carry != 0) {
            int sum = carry;
            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }
            carry = sum / 10;
            temp.next = new ListNode(sum % 10);
            temp = temp.next;
        }
        return ans.next;

    }
}
