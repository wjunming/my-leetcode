package recursion;

import java.util.ArrayList;
import java.util.List;

public class Q78 {

    List<List<Integer>> ans = new ArrayList<>();
    List<Integer> t = new ArrayList<>();

    public List<List<Integer>> subsets(int[] nums) {
        dfs(0, nums);
        return ans;
    }

    private void dfs(int cur, int[] nums) {
        if (cur == nums.length) {
            ans.add(new ArrayList<>(t));
            return;
        }
        t.add(nums[cur]);
        dfs(cur + 1, nums);
        t.remove(t.size() - 1);
        dfs(cur + 1, nums);
    }

    public static void main(String[] args) {
        int[] nums = {1, 2};
        new Q78().subsets(nums);
    }
}
