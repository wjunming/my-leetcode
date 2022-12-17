package array;

import java.util.Arrays;

/**
 * @see <a href="https://leetcode.cn/problems/minimum-difference-between-highest-and-lowest-of-k-scores/">1984. 学生分数的最小差值</a>
 */
public class Q1984 {

    public int minimumDifference(int[] nums, int k) {
        Arrays.sort(nums);
        int res = Integer.MAX_VALUE;
        for (int i = 0; i + k - 1 < nums.length; i++) {
            res = Math.min(res, nums[i + k - 1] - nums[i]);
        }
        return res;
    }
}
