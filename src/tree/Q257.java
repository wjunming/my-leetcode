package tree;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

/**
 * @see <a href="https://leetcode.cn/problems/binary-tree-paths/">257. 二叉树的所有路径</a>
 */
public class Q257 {

    public List<String> binaryTreePaths(TreeNode root) {
        List<String> list = new ArrayList<>();
        recursion(list, root, "");
        return list;
    }

    private void recursion(List<String> list, TreeNode root, String path) {
        if (root != null) {
            StringBuilder builder = new StringBuilder(path);
            builder.append(root.val);
            if (root.left == null && root.right == null) {
                list.add(builder.toString());
            } else {
                builder.append("->");
                recursion(list, root.left, builder.toString());
                recursion(list, root.right, builder.toString());
            }
        }
    }

    public List<String> binaryTreePaths2(TreeNode root) {
        List<String> list = new ArrayList<>();
        if (root == null) {
            return list;
        }
        Queue<TreeNode> nodeQueue = new ArrayDeque<>();
        Queue<String> pathQueue = new ArrayDeque<>();
        nodeQueue.offer(root);
        pathQueue.offer(Integer.toString(root.val));
        while (!nodeQueue.isEmpty()) {
            TreeNode node = nodeQueue.poll();
            String path = pathQueue.poll();
            if (node.left == null && node.right == null) {
                list.add(path);
            } else {
                if (node.left != null) {
                    nodeQueue.offer(node.left);
                    pathQueue.offer(path + "->" + node.left.val);
                }
                if (node.right != null) {
                    nodeQueue.offer(node.right);
                    pathQueue.offer(path + "->" + node.right.val);
                }
            }
        }
        return list;
    }
}
