package greedy;

import java.util.Arrays;

/**
 * @see <a href="https://leetcode.cn/problems/assign-cookies/description/">455. 分发饼干</a>
 */
public class Q455 {

    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int total = 0;
        int children = g.length;
        int cookies = s.length;
        for (int i = 0, j = 0; i < children && j < cookies; i++, j++) {
            while (j < cookies && g[i] > s[j]) {
                j++;
            }
            if (j < cookies) {
                total++;
            }
        }
        return total;
    }
}
