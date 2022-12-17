package tree;

import java.util.LinkedList;
import java.util.List;

/**
 * @see <a href="https://leetcode.cn/problems/n-ary-tree-preorder-traversal/description/">589. N 叉树的前序遍历</a>
 */
public class Q589 {

    public List<Integer> preorder(Node root) {
        List<Integer> list = new LinkedList<>();
        helper(list, root);
        return list;
    }

    private void helper(List<Integer> list, Node root) {
        if (root != null) {
            list.add(root.val);
            for (Node node : root.children) {
                helper(list, node);
            }
        }
    }
}
