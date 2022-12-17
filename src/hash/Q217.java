package hash;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @see <a href="https://leetcode.cn/problems/contains-duplicate/">217. 存在重复元素</a>
 */
public class Q217 {

    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>(nums.length);
        for (int num : nums) {
            if (!set.add(num)) {
                return true;
            }
        }
        return false;
    }

    public boolean containsDuplicate2(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                return true;
            }
        }
        return false;
    }
}
