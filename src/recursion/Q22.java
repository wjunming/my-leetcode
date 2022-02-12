package recursion;

import java.util.LinkedList;
import java.util.List;

/**
 * @see <a href="https://leetcode-cn.com/problems/generate-parentheses/">22. 括号生成</a>
 */
public class Q22 {

    public List<String> generateParenthesis(int n) {
        List<String> list = new LinkedList<>();
        generate(list, 0, 0, n, new StringBuilder());
        return list;
    }

    private void generate(List<String> list, int left, int right, int n, StringBuilder builder) {
        if (left == n && right == n) {
            list.add(builder.toString());
            return;
        }
        if (left < n) {
            generate(list, left + 1, right, n, builder.append('('));
            builder.deleteCharAt(builder.length() - 1);
        }
        if (right < left) {
            generate(list, left, right + 1, n, builder.append(')'));
            builder.deleteCharAt(builder.length() - 1);
        }
    }

    public List<String> generateParenthesis2(int n) {
        List<String> list = new LinkedList<>();
        generate2(list, 0, 0, n, "");
        return list;
    }

    private void generate2(List<String> list, int left, int right, int n, String s) {
        if (left == n && right == n) {
            list.add(s);
            return;
        }
        if (left < n) {
            generate2(list, left + 1, right, n, s + "(");
        }
        if (right < left) {
            generate2(list, left, right + 1, n, s + ")");
        }
    }
}
