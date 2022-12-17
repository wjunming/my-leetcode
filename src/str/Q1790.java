package str;

import java.util.ArrayList;
import java.util.List;

/**
 * @see <a href="https://leetcode.cn/problems/check-if-one-string-swap-can-make-strings-equal/">1790. 仅执行一次字符串交换能否使两个字符串相等</a>
 */
public class Q1790 {

    public boolean areAlmostEqual(String s1, String s2) {
        int len = s1.length();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < len; i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                if (list.size() >= 2) {
                    return false;
                }
                list.add(i);
            }
        }
        if (list.isEmpty()) {
            return true;
        }
        if (list.size() < 2) {
            return false;
        }
        return s1.charAt(list.get(0)) == s2.charAt(list.get(1)) && s1.charAt(list.get(1)) == s2.charAt(list.get(0));
    }
}
