package array;

import javafx.util.Pair;

/**
 * @see <a href="https://leetcode.cn/problems/special-positions-in-a-binary-matrix/">1582. 二进制矩阵中的特殊位置</a>
 */
public class Q1582 {

    public int numSpecial(int[][] mat) {
        int m = mat.length, n = mat[0].length;
        int[] rows = new int[m], clos = new int[n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (mat[i][j] == 1) {
                    rows[i]++;
                    clos[j]++;
                }
            }
        }
        int res = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (mat[i][j] == 1 && rows[i] == 1 && clos[j] == 1) {
                    res++;
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Pair<String, String> pair = new Pair<>("left", "right");
        System.out.println(pair.getKey());
        System.out.println(pair.getValue());
    }
}
