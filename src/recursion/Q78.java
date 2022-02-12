package recursion;

import java.util.ArrayList;
import java.util.List;

/**
 * @see <a href="https://leetcode-cn.com/problems/subsets/">78. 子集</a>
 */
public class Q78 {

    private List<List<Integer>> result = new ArrayList<>();
    private List<Integer> current = new ArrayList<>();

    public List<List<Integer>> subsets(int[] nums) {
        dfs(nums, 0);
        return result;
    }

    private void dfs(int[] nums, int level) {
        if (nums.length == level) {
            result.add(new ArrayList<>(current));
            return;
        }
        current.add(nums[level]);
        dfs(nums, level + 1);
        current.remove(current.size() - 1);
        dfs(nums, level + 1);
    }

    public static void main(String[] args) {
        int[] nums = {1, 2};
        new Q78().subsets(nums);
    }
}
