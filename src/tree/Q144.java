package tree;

import java.util.LinkedList;
import java.util.List;

/**
 * @see <a href="https://leetcode-cn.com/problems/binary-tree-preorder-traversal/">144. 二叉树的前序遍历</a>
 */
public class Q144 {

    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new LinkedList<>();
        helper(list, root);
        return list;
    }

    private void helper(List<Integer> list, TreeNode root) {
        if (root != null) {
            list.add(root.val);
            helper(list, root.left);
            helper(list, root.right);
        }
    }

}
