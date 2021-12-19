package recursion;

import tree.TreeNode;

public class Q98 {

    public boolean isValidBST(TreeNode root) {
        return valid(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    private boolean valid(TreeNode root, long minValue, long maxValue) {
        if (root == null) {
            return true;
        }
        if (root.val >= maxValue || root.val <= minValue) {
            return false;
        }
        return valid(root.left, minValue, root.val) && valid(root.right, root.val, maxValue);
    }
}
