package array;

public class Q1512 {

    public int numIdenticalPairs(int[] nums) {
        int res = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    res++;
                }
            }
        }
        return res;
    }

    public int numIdenticalPairs2(int[] nums) {
        int res = 0;
        int[] tmp = new int[101];
        for (int num : nums) {
            res += tmp[num]++;
        }
        return res;
    }
}
