package recursion;

import tree.TreeNode;

/**
 * @see <a href="https://leetcode.cn/problems/invert-binary-tree/">226. 翻转二叉树</a>
 */
public class Q226 {

    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }
        TreeNode left = invertTree(root.left);
        TreeNode right = invertTree(root.right);
        root.left = right;
        root.right = left;
        return root;
    }
}
