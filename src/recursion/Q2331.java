package recursion;

import tree.TreeNode;

/**
 * @see <a href="https://leetcode.cn/problems/evaluate-boolean-binary-tree/">2331. 计算布尔二叉树的值</a>
 */
public class Q2331 {

    public boolean evaluateTree(TreeNode root) {
        if (root.left == null) {
            return root.val == 1;
        }
        return root.val == 2 ? evaluateTree(root.left) || evaluateTree(root.right) :
            evaluateTree(root.left) && evaluateTree(root.right);
    }
}
