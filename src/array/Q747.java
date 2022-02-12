package array;

/**
 * @see <a href="https://leetcode-cn.com/problems/largest-number-at-least-twice-of-others/">747. 至少是其他数字两倍的最大数</a>
 */
public class Q747 {

    public int dominantIndex(int[] nums) {
        int m1 = -1;
        int m2 = -1;
        int index = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > m1) {
                m2 = m1;
                m1 = nums[i];
                index = i;
            } else if (nums[i] > m2) {
                m2 = nums[i];
            }
        }
        return m1 >= 2 * m2 ? index : -1;
    }
}
