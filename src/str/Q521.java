package str;

/**
 * @see <a href="https://leetcode.cn/problems/longest-uncommon-subsequence-i/">521. 最长特殊序列 Ⅰ</a>
 */
public class Q521 {

    public int findLUSlength(String a, String b) {
        return !a.equals(b) ? Math.max(a.length(), b.length()) : -1;
    }
}
