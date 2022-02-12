package other;

/**
 * @see <a href="https://leetcode-cn.com/problems/remove-palindromic-subsequences/">1332. 删除回文子序列</a>
 */
public class Q1332 {

    public int removePalindromeSub(String s) {
        int n = s.length();
        for (int i = 0; i < n / 2; i++) {
            if (s.charAt(i) != s.charAt(n - 1 - i)) {
                return 2;
            }
        }
        return 1;
    }
}
