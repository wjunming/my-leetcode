package array;

import java.util.Arrays;

public class Q977 {

    public int[] sortedSquares(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            nums[i] = nums[i] * nums[i];
        }
        Arrays.sort(nums);
        return nums;
    }

    public int[] sortedSquares2(int[] nums) {
        int len = nums.length;
        int[] result = new int[len];
        for (int i = 0, j = len - 1, pos = len - 1; i <= j; pos--) {
            if (nums[i] * nums[i] > nums[j] * nums[j]) {
                result[pos] = nums[i] * nums[i];
                i++;
            } else {
                result[pos] = nums[j] * nums[j];
                j--;
            }
        }
        return result;
    }
}
