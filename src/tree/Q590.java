package tree;

import java.util.LinkedList;
import java.util.List;

/**
 * @see <a href="https://leetcode-cn.com/problems/n-ary-tree-postorder-traversal/">590. N 叉树的后序遍历</a>
 */
public class Q590 {

    public List<Integer> postorder(Node root) {
        List<Integer> list = new LinkedList<>();
        helper(list, root);
        return list;
    }

    private void helper(List<Integer> list, Node root) {
        if (root != null) {
            for (Node node : root.children) {
                helper(list, node);
            }
            list.add(root.val);
        }
    }
}
