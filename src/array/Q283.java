package array;

public class Q283 {

    /**
     * 双指针
     * @param nums
     */
    public void moveZeroes(int[] nums) {
        if (nums == null) {
            return;
        }
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != 0) {
                nums[i] = nums[j];
                if (i != j) {
                    nums[j] = 0;
                }
                i++;
            }
        }
    }

    /**
     * 相邻两个元素交换
     * @param nums
     */
    public void moveZeroes2(int[] nums) {
        if (nums == null) {
            return;
        }
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != 0) {
                int tmp = nums[i];
                nums[i++] = nums[j];
                nums[j] = tmp;
            }
        }
    }
}
