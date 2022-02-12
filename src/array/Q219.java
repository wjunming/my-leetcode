package array;

import java.util.HashSet;
import java.util.Set;

/**
 * @see <a href="https://leetcode-cn.com/problems/contains-duplicate-ii/">219. 存在重复元素 II</a>
 */
public class Q219 {

    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int len = nums.length;
        Set<Integer> set = new HashSet<>(len);
        for (int i = 0; i < len; i++) {
            if (set.contains(nums[i])) {
                return true;
            }
            set.add(nums[i]);
            if (set.size() > k) {
                set.remove(nums[i - k]);
            }
        }
        return false;
    }

    public boolean containsNearbyDuplicate2(int[] nums, int k) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (i > k) {
                set.remove(nums[i - k - 1]);
            }
            if (!set.add(nums[i])) {
                return true;
            }
        }
        return false;
    }

}
