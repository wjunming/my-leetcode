package array;

import java.util.Arrays;

/**
 * @see <a href="https://leetcode.cn/problems/maximum-product-of-two-elements-in-an-array/">1464. 数组中两元素的最大乘积</a>
 */
public class Q1464 {

    public int maxProduct(int[] nums) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int res = (nums[i] - 1) * (nums[j] - 1);
                max = Math.max(max, res);
            }
        }
        return max;
    }

    public int maxProduct2(int[] nums) {
        Arrays.sort(nums);
        return (nums[nums.length - 2] - 1) * (nums[nums.length - 1] - 1);
    }

    public int maxProduct3(int[] nums) {
        int max1 = 0, max2 = 0;
        for (int num : nums) {
            if (num > max1) {
                max2 = max1;
                max1 = num;
            } else if (num > max2) {
                max2 = num;
            }
        }
        return (max1 - 1) * (max2 - 1);
    }
}
