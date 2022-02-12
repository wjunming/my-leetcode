package array;

import java.util.HashMap;
import java.util.Map;

/**
 * @see <a href="https://leetcode-cn.com/problems/find-majority-element-lcci/">面试题 17.10. 主要元素</a>
 */
public class M17_10 {

    public int majorityElement(int[] nums) {
        int count = nums.length >> 1;
        Map<Integer, Integer> map = new HashMap<>(nums.length);
        for (int i = 0; i < nums.length; i++) {
            if (map.get((Integer)nums[i]) == null) {
                map.put(nums[i], 1);
            } else {
                map.put(nums[i], map.get(nums[i]) + 1);
            }
            if (map.get(nums[i]) > count) {
                return nums[i];
            }
        }
        return -1;
    }
}
