package array;

import java.util.Arrays;

public class Q1672 {

    public int maximumWealth(int[][] accounts) {
        int max = Integer.MIN_VALUE;
        for (int[] row : accounts) {
            int sum = 0;
            for (int i = 0; i < row.length; i++) {
                sum += row[i];
            }
            max = Math.max(max, sum);
        }
        return max;
    }

    public int maximumWealth2(int[][] accounts) {
        return Arrays.stream(accounts).mapToInt(i -> Arrays.stream(i).sum()).max().getAsInt();
    }
}
