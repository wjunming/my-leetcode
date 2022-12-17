package greedy;

/**
 * @see <a href="https://leetcode.cn/problems/minimum-add-to-make-parentheses-valid/">921. 使括号有效的最少添加</a>
 */
public class Q921 {

    public int minAddToMakeValid(String s) {
        int left = 0;
        int ans = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') {
                left++;
            } else {
                if (left > 0) {
                    left--;
                } else {
                    ans++;
                }
            }
        }
        return ans + left;
    }
}
