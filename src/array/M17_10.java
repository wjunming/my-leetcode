package array;

import java.util.HashMap;
import java.util.Map;

/**
 * @see <a href="https://leetcode.cn/problems/find-majority-element-lcci/">面试题 17.10. 主要元素</a>
 */
public class M17_10 {

    public int majorityElement(int[] nums) {
        int count = nums.length >> 1;
        Map<Integer, Integer> map = new HashMap<>(nums.length);
        for (int num : nums) {
            map.merge(num, 1, Integer::sum);
            if (map.get(num) > count) {
                return num;
            }
        }
        return -1;
    }
}
