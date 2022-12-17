package dfs_bfs;

import java.util.*;

/**
 * @see <a href="https://leetcode.cn/problems/clone-graph/">133. 克隆图</a>
 */
public class Q133 {

    Map<Node, Node> map = new HashMap<>();

    public Node cloneGraph_dfs(Node node) {
        if (node == null) {
            return null;
        }
        if (map.containsKey(node)) {
            return map.get(node);
        }
        Node cloneNode = new Node(node.val, new ArrayList<>());
        map.put(node, cloneNode);
        for (Node neighbor : node.neighbors) {
            cloneNode.neighbors.add(cloneGraph_dfs(neighbor));
        }
        return cloneNode;
    }

    public Node cloneGraph_bfs(Node node) {
        if (node == null) {
            return null;
        }
        Queue<Node> queue = new ArrayDeque<>();
        queue.add(node);
        map.put(node, new Node(node.val, new ArrayList<>()));
        while (!queue.isEmpty()) {
            Node curNode = queue.poll();
            for (Node neighbor : curNode.neighbors) {
                if (!map.containsKey(neighbor)) {
                    map.put(neighbor, new Node(neighbor.val, new ArrayList<>()));
                    queue.add(neighbor);
                }
                map.get(curNode).neighbors.add(map.get(neighbor));
            }
        }
        return map.get(node);
    }
}

class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
