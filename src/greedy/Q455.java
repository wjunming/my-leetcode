package greedy;

import java.util.Arrays;

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
