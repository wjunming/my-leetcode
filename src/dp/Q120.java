package dp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q120 {

    Integer[][] cache;

    public int minimumTotal(List<List<Integer>> triangle) {
        cache = new Integer[triangle.size()][triangle.size()];
        return dfs(triangle, 0, 0);
    }

    private int dfs(List<List<Integer>> triangle, int i, int j) {
        if (i == triangle.size()) {
            return 0;
        }
        if (cache[i][j] != null) {
            return cache[i][j];
        }
        int left = dfs(triangle, i + 1, j);
        int right = dfs(triangle, i + 1, j + 1);
        return Math.min(left, right) + triangle.get(i).get(j);
    }

    public int minimumTotal2(List<List<Integer>> triangle) {
        int n = triangle.size();
        int[] dp = new int[n + 1];
        for (int i = n - 1; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                dp[j] = Math.min(dp[j], dp[j + 1]) + triangle.get(i).get(j);
            }
        }
        return dp[0];
    }

    public static void main(String[] args) {
        Q120 q120 = new Q120();
        List<List<Integer>> triangle = new ArrayList<>();
        triangle.add(Arrays.asList(2));
        triangle.add(Arrays.asList(3, 4));
        triangle.add(Arrays.asList(6, 5, 7));
        triangle.add(Arrays.asList(4, 1, 8, 3));
        q120.minimumTotal2(triangle);
    }
}
