package graph;

/**
 * @see <a href="https://leetcode.cn/problems/find-center-of-star-graph/">1791. 找出星型图的中心节点</a>
 */
public class Q1791 {

    public int findCenter(int[][] edges) {
        return edges[0][0] == edges[1][0] || edges[0][0] == edges[1][1] ?
            edges[0][0] : edges[0][1];
    }
}
