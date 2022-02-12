package hash;

import java.util.HashMap;
import java.util.Map;

/**
 * @see <a href="https://leetcode-cn.com/problems/sum-of-unique-elements/">1748. 唯一元素的和</a>
 */
public class Q1748 {

    public int sumOfUnique(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        int result = 0;
        for (int key : map.keySet()) {
            if (map.get(key) == 1) {
                result += key;
            }
        }
        return result;
    }

    public int sumOfUnique2(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int result = 0;
        for (int num : nums) {
            if (!map.containsKey(num)) {
                result += num;
                map.put(num, 1);
            } else if (map.get(num) == 1) {
                result -= num;
                map.put(num, 2);
            }
        }
        return result;
    }
}
