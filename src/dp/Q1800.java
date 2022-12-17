package dp;

/**
 * @see <a href="https://leetcode.cn/problems/maximum-ascending-subarray-sum/">1800. 最大升序子数组和</a>
 */
public class Q1800 {

    public int maxAscendingSum(int[] nums) {
        int res = 0, i = 0;
        while (i < nums.length) {
            int sum = nums[i++];
            while (i < nums.length && nums[i] > nums[i - 1]) {
                sum += nums[i++];
            }
            res = Math.max(res, sum);
        }
        return res;
    }

    public int maxAscendingSum2(int[] nums) {
        int res = nums[0], sum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1]) {
                sum += nums[i];
            } else {
                sum = nums[i];
            }
            res = Math.max(res, sum);
        }
        return res;
    }
}
