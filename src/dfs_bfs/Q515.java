package dfs_bfs;

import tree.TreeNode;

import java.util.*;

/**
 * @see <a href="https://leetcode-cn.com/problems/find-largest-value-in-each-tree-row/">515. 在每个树行中找最大值</a>
 */
public class Q515 {

    public List<Integer> largestValues(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root != null) {
            dfs(result, root, 0);
        }
        return result;
    }

    private void dfs(List<Integer> result, TreeNode root, int level) {
        if (result.size() == level) {
            result.add(Integer.MIN_VALUE);
        }
        if (root.val > result.get(level)) {
            result.set(level, root.val);
        }
        if (root.left != null) {
            dfs(result, root.left, level + 1);
        }
        if (root.right != null) {
            dfs(result, root.right, level + 1);
        }
    }

    private void dfs2(List<Integer> result, TreeNode root, int level) {
        if (root == null) {
            return;
        }
        if (result.size() == level) {
            result.add(root.val);
        } else {
            result.set(level, Math.max(root.val, result.get(level)));
        }
        dfs(result, root.left, level + 1);
        dfs(result, root.right, level + 1);
    }

    public List<Integer> largestValues2(TreeNode root) {
        List<Integer> result = new LinkedList<>();
        Queue<TreeNode> queue = new ArrayDeque<>();
        if (root != null) {
            queue.add(root);
        }
        while (!queue.isEmpty()) {
            int max = Integer.MIN_VALUE;
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                max = Math.max(max, node.val);
                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }
            }
            result.add(max);
        }
        return result;
    }
}
