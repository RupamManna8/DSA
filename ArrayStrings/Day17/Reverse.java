package ArrayStrings.Day17;
/**
 * Reverse
 */

public class Reverse {
    /**
     * Node
     */
    public static class Node {
        int val;
        Node next;
        Node(int val){
            this.val = val;
            this.next = null;
        }
    }
   
    public Node insert(Node head,int val){
        Node temp = head;
        Node newNode = new Node(val);
        temp.next = newNode;
        return newNode;

    }
    public Node createList(int arr[]){
        Node head = new Node(arr[0]);
        Node temp = head;
        for(int i = 1;i < arr.length;i++){
            temp = insert(temp, arr[i]);
        }
        return head;
    }

    public void Print(Node head){
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + "->");
            temp = temp.next;
        }
    }
    public Node reverse(Node head){
        Node temp = head;
        Node prev = null;
        while(temp != null){
            Node next = temp.next;
            temp.next = prev;
            prev = temp;
            temp = next;
        }
     return prev;
    }

    public static void main(String[] args) {
        int node[] = {1,2,3,4,5,6};
        Reverse myNode = new Reverse();
        Node head = myNode.createList(node);
        Node ans = myNode.reverse(head);
        myNode.Print(ans);
    }
    
}
