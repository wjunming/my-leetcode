package tree;

import java.util.ArrayList;
import java.util.List;

/**
 * @see <a href="https://leetcode.cn/problems/binary-tree-postorder-traversal/">145. 二叉树的后序遍历</a>
 */
public class Q145 {

    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        helper(list, root);
        return list;
    }

    private void helper(List<Integer> list, TreeNode root) {
        if (root != null) {
            helper(list, root.left);
            helper(list, root.right);
            list.add(root.val);
        }
    }
}
