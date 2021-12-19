package dp;

public class Q53 {

    public int maxSubArray(int[] nums) {
        int pre = 0;
        int result = nums[0];
        for (int num : nums) {
            pre = Math.max(pre + num, num);
            result = Math.max(result, pre);
            System.out.println("[" + pre + ", " + result + "]");
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        int result = new Q53().maxSubArray(nums);
        System.out.println(result);
    }
}
