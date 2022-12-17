package array;

/**
 * @see <a href="https://leetcode.cn/problems/remove-duplicates-from-sorted-array/">26. 删除有序数组中的重复项</a>
 */
public class Q26 {

    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int j = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[j]) {
                nums[++j] = nums[i];
            }
        }
        return j + 1;
    }
}
