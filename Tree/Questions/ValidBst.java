package Tree.Questions;
import Tree.TreeNode;

public class ValidBst {
    public boolean traverse(TreeNode root, long min, long max) {
        if (root == null) {
            return true;
        }

        if (root.val <= min || root.val >= max) {
            return false;
        }

        if (!traverse(root.left, min, root.val)) {
            return false;
        }

        if (!traverse(root.right, root.val, max)) {
            return false;
        }

        return true;
    }

    public boolean isValidBST(TreeNode root) {
        return traverse(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }
}
