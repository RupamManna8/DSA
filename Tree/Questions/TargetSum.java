package Tree.Questions;

import java.util.ArrayList;

public class TargetSum {
    public static class Node {
        int data;
        Node left;
        Node right;

        Node(int val) {
            this.data = val;
            this.left = null;
            this.right = null;
        }
    }

    public static class Solution {
        Node root;
        ArrayList<Integer> ans = new ArrayList<>();

        void insertAll(int[] nodes) {
            int idx = 0;
            while (idx < nodes.length) {
                root = insertrec(root, nodes[idx]);
                idx++;
            }
        }

        int countNodes(Node node) {
            if (node == null) {
                return 0;
            }
            return 1 + countNodes(node.left) + countNodes(node.right);
        }

        Node insertrec(Node root, int val) {
            if (root == null) {
                return new Node(val);
            }
            int left = countNodes(root.left);
            int right = countNodes(root.right);
            if (left <= right) {
                root.left = insertrec(root.left, val);
            } else {
                root.right = insertrec(root.right, val);
            }
            return root;
        }

        void print() {
            inorderrec(root);
            System.out.println();
        }

        void inorderrec(Node root) {
            if (root != null) {
                inorderrec(root.left);
                System.out.print(root.data + " ");
                inorderrec(root.right);
            }
        }

        // Corrected TargetSum method with Backtracking
        boolean findTargetSum(Node root, int target) {
            if (root == null) {
                return false;
            }

            // 1. Choose: add current node to path
            ans.add(root.data);

            // 2. Base Case: Leaf node check
            if (root.left == null && root.right == null) {
                if (target == root.data) {
                    return true; // Target sum found along this path
                }
            }

            // 3. Recurse down left and right subtrees with updated target
            boolean leftFound = findTargetSum(root.left, target - root.data);
            boolean rightFound = findTargetSum(root.right, target - root.data);

            if (leftFound || rightFound) {
                return true;
            }

            // 4. Backtrack: remove current node if no valid path was found below
            ans.remove(ans.size() - 1);
            return false;
        }
    }

    public static void main(String[] args) {
        Solution tree = new Solution();
        int arr[] = {1, 2, 4, 5, 7, 9, 4, 5};
        tree.insertAll(arr);

        System.out.print("In-order Traversal: ");
        tree.print();

        int target = 13; // Example: Path 1 -> 2 -> 5 -> 5 = 13
        if (tree.findTargetSum(tree.root, target)) {
            System.out.println("Path found with sum " + target + ": " + tree.ans);
        } else {
            System.out.println("No path found with sum " + target);
        }
    }
}