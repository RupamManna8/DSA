package LinkedList.Problems;

public class DoublyLinkedList {
    public static class Node {
        int val;
        Node prev;
        Node next;

        Node(int val) {
            this.val = val;
            this.prev = null;
            this.next = null;
        }
    }

    public static class InnerDoublyLinkedList {

        Node head;

        void addNodeAtFirst(int val) {
            Node newNode = new Node(val);
            if (head == null) {
                head = newNode;
            } else {
                newNode.prev = head.prev;
                newNode.next = head;
                head = newNode;
            }
        }

        void addNodeAtLast(int val) {
            Node newNode = new Node(val);
            if (head == null) {
                head = newNode;
            } else {
                Node temp = head;
                while (temp.next != null) {
                    temp = temp.next;
                }
                newNode.next = temp.next;
                temp.next = newNode;
                newNode.prev = temp;
            }
        }

        void addNodeAtPos(int val,int pos) {
            Node newNode = new Node(val);
            Node temp = head;
            int count = 0;
            while (count != pos) {
                temp = temp.next;
                count++;
            }
            newNode.next = temp.next.next;
            temp.next.prev = newNode;
            temp.next = newNode;
            newNode.prev = temp;
        }

        Void Print() {
            Node temp = head;
            while (temp != null) {
                System.out.println(temp.val);
                temp = temp.next;
            }
            return null;
        }
    }

    public static void main(String[] args) {
        InnerDoublyLinkedList mylist = new InnerDoublyLinkedList();
        mylist.addNodeAtLast(10);
        mylist.addNodeAtLast(45);
        mylist.addNodeAtLast(55);
        mylist.addNodeAtLast(65);
        mylist.addNodeAtPos(90, 1);
        mylist.Print();
    }
}
