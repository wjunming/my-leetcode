package array;

/**
 * @see <a href="https://leetcode-cn.com/problems/concatenation-of-array/">1929. 数组串联</a>
 */
public class Q1929 {

    public int[] getConcatenation(int[] nums) {
        int length = nums.length;
        int[] ans = new int[length * 2];
        for (int i = 0; i < length; i++) {
            ans[i + length] = ans[i] = nums[i];
        }
        return ans;
    }

    public int[] getConcatenation2(int[] nums) {
        int length = nums.length;
        int[] ans = new int[length * 2];
        for (int i = 0; i < ans.length; i++) {
            ans[i] = nums[i % length];
        }
        return ans;
    }
}
