package graph;

/**
 * @see <a href="https://leetcode.cn/problems/find-the-town-judge/">997. 找到小镇的法官</a>
 */
public class Q997 {

    public int findJudge(int n, int[][] trust) {
        int[] inDegrees = new int[n + 1];
        int[] outDegrees = new int[n + 1];
        for (int[] t : trust) {
            inDegrees[t[1]]++;
            outDegrees[t[0]]++;
        }
        for (int i = 1; i <= n; i++) {
            if (inDegrees[i] == n - 1 && outDegrees[i] == 0) {
                return i;
            }
        }
        return -1;
    }

    public int findJudge2(int n, int[][] trust) {
        int[] count = new int[n + 1];
        for (int[] t : trust) {
            count[t[0]]--;
            count[t[1]]++;
        }
        for (int i = 1; i <= n; i++) {
            if (count[i] == n - 1) {
                return i;
            }
        }
        return -1;
    }
}
