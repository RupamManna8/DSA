package Tree;

public class FirstTree {

    public static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static class InnerFirstTree {
        Node root;

        void insert(int val) {
            root = insertRec(root, val);
        }

        Node insertRec(Node root, int val) {
            if (root == null) {
                root = new Node(val);
            } else if (val < root.data) {
                root.left = insertRec(root.left, val);
            } else if (val > root.data) {
                root.right = insertRec(root.right, val); 
            }
            return root;
        }

        void print() {
            inorder(root);
            System.out.println();
        }

        void inorder(Node root) {
            if (root != null) {
                System.out.print(root.data + " "); 
                inorder(root.left);
                inorder(root.right);
            }
        }
    }

    public static void main(String[] args) {
        InnerFirstTree tree = new InnerFirstTree();
        tree.insert(10);
        tree.insert(12);
        tree.insert(5);
        tree.insert(3);
        tree.insert(1);
        tree.insert(15);
        
        tree.print(); 
        
    }
}