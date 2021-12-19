package tree;

import java.util.LinkedList;
import java.util.List;

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
