package LinkedList.Problems;

import java.util.*;

import LinkedList.Problems.AddToNumber.ListNode;


public class PalindromeCheck {
    public boolean isPalindrome(ListNode head) {
        ListNode temp = head;
        int first = 0;
        List<Integer> myList = new ArrayList<>();
        while(temp != null){
            myList.add(temp.val);
            temp = temp.next;
        }
        int last = myList.size() - 1;
        while(first < last){
            if(myList.get(first) != myList.get(last)){
                return false;
            }
            first++;
            last--;
        }
     
        return true;
    }
}
