package hash;

import java.util.*;

/**
 * @see <a href="https://leetcode.cn/problems/majority-element-ii/">229. 多数元素 II</a>
 */
public class Q229 {

    public List<Integer> majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        Set<Integer> set = new HashSet<>();
        int size = nums.length / 3;
        for (int num : nums) {
            map.merge(num, 1, Integer::sum);
            if (map.get(num) > size) {
                set.add(num);
            }
        }
        return new ArrayList<>(set);
    }

    public List<Integer> majorityElement2(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.merge(num, 1, Integer::sum);
        }
        List<Integer> res = new ArrayList<>();
        int size = nums.length / 3;
        map.forEach((k, v) -> {
            if (v > size) {
                res.add(k);
            }
        });
        return res;
    }
}
