package hash;

import java.util.HashMap;
import java.util.Map;

/**
 * @see <a href="https://leetcode.cn/problems/count-number-of-pairs-with-absolute-difference-k/">2006. 差的绝对值为 K 的数对数目</a>
 */
public class Q2006 {

    public int countKDifference(int[] nums, int k) {
        int res = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (Math.abs(nums[i] - nums[j]) == k) {
                    res++;
                }
            }
        }
        return res;
    }

    public int countKDifference2(int[] nums, int k) {
        int res = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            res += map.getOrDefault(nums[i] + k, 0);
            res += map.getOrDefault(nums[i] - k, 0);
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {3,2,1,5,4};
        new Q2006().countKDifference2(nums, 2);
    }
}
