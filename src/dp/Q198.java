package dp;

/**
 * @see <a href="https://leetcode.cn/problems/house-robber/">198. 打家劫舍</a>
 */
public class Q198 {

    public int rob(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int len = nums.length;
        if (len == 1) {
            return nums[0];
        }
        int first = nums[0];
        int second = Math.max(first, nums[1]);
        for (int i = 2; i < len; i++) {
            int temp = second;
            second = Math.max(first + nums[i], second);
            first = temp;
        }
        return second;
    }
}
