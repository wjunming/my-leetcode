package array;

/**
 * @see <a href="https://leetcode.cn/problems/build-array-from-permutation/">1920. 基于排列构建数组</a>
 */
public class Q1920 {

    public int[] buildArray(int[] nums) {
        int[] ans = new int[nums.length];
        for (int i = 0; i < ans.length; i++) {
            ans[i] = nums[nums[i]];
        }
        return ans;
    }
}
