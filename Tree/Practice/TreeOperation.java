package Tree.Practice;

import java.util.LinkedList;
import java.util.Queue;

import Tree.TreeNode;

public class TreeOperation {
    TreeNode Node;

    public void createTree(int val) {
        this.Node = new TreeNode(val);
    }

    public void addPosition(TreeNode node, int val) {
        Queue<TreeNode> store = new LinkedList<>();
        store.add(node);
        while (!store.isEmpty()) {
            TreeNode temp = store.poll();
            if (temp.left == null) {
                temp.left = new TreeNode(val);
                return;
            }
            if (temp.right == null) {
                temp.right = new TreeNode(val);
                return;
            }
            store.add(temp.left);
            store.add(temp.right);
        }
    }

    public void inorder(TreeNode node) {
        if (node == null) {
            return;
        }
        
        inorder(node.left);
        System.out.print(node.val + " ");
        inorder(node.right);
    }

    public void addNodeBst(TreeNode node, int val) {
        if (node == null) {
            return;
        }
        if (node.val > val) {
            if(node.left == null){
                node.left = new TreeNode(val);
                return;
            }
            addNodeBst(node.left, val);
        } else {
            if(node.right == null){
               node.right = new TreeNode(val);
               return;
            }
            addNodeBst(node.right, val);
        }
    }

    public void buildBst(int arr[]) {
        TreeNode node = new TreeNode(arr[0]);
        this.Node = node;
        for (int ele : arr) {
            addNodeBst(node, ele);
        }
    }

    public void printTree() {
        inorder(this.Node);
    }

    public void addNode(int val) {
        addPosition(this.Node, val);
    }

    public static void main(String[] args) {
        TreeOperation ob = new TreeOperation();
        // ob.createTree(0);
        // ob.addNode(1);
        // ob.addNode(2);
        // ob.addNode(3);
        // ob.addNode(5);
        // ob.printTree();
        int arr[] = {10,5,89,64,11,7,8,2,3,1};
        ob.buildBst(arr);
        ob.printTree();
    }
}
