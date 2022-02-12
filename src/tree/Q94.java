package tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 * @see <a href="https://leetcode-cn.com/problems/binary-tree-inorder-traversal/">94. 二叉树的中序遍历</a>
 */
public class Q94 {

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new LinkedList<>();
        helper(result, root);
        return result;
    }

    private void helper(List<Integer> list, TreeNode root) {
        if (root == null) {
            return;
        }
        helper(list, root.left);
        list.add(root.val);
        helper(list, root.right);
    }

    public List<Integer> inorderTraversal2(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode curr = root;
        while (curr != null || !stack.isEmpty()) {
            while (curr != null) {
                stack.push(curr);
                curr = curr.left;
            }
            curr = stack.pop();
            list.add(curr.val);
            curr = curr.right;
        }
        return list;
    }

}
