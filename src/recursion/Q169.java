package recursion;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @see <a href="https://leetcode-cn.com/problems/majority-element/">169. 多数元素</a>
 */
public class Q169 {

    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length / 2];
    }

    public int majorityElement2(int[] nums) {
        int n = nums.length / 2;
        int ret = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            if (!map.containsKey(num)) {
                map.put(num, 1);
            } else {
                map.put(num, map.get(num) + 1);
            }
            if (map.get(num) > n) {
                ret = num;
                break;
            }
        }
        return ret;
    }

    public int majorityElement3(int[] nums) {
        int count = 0;
        int ret = 0;
        for (int num : nums) {
            if (count == 0) {
                ret = num;
            }
            if (num != ret) {
                count--;
            } else {
                count++;
            }
        }
        return ret;
    }
}
