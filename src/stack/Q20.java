package stack;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * @see <a href="https://leetcode.cn/problems/valid-parentheses/">20. 有效的括号</a>
 */
public class Q20 {

    public boolean isValid(String s) {
        if (s.length() % 2 != 0) {
            return false;
        }
        char[] chars = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        for (char ch : chars) {
            if (ch == '(') {
                stack.push(')');
            } else if (ch == '[') {
                stack.push(']');
            } else if (ch == '{') {
                stack.push('}');
            } else if (stack.isEmpty() || ch != stack.pop()) {
                return false;
            }
        }
        return stack.isEmpty();
    }

    public boolean isValid2(String s) {
        if (s.length() % 2 != 0) {
            return false;
        }
        Map<Character, Character> map = new HashMap<>();
        map.put(')', '(');
        map.put(']', '[');
        map.put('}', '{');
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (map.containsKey(c)) {
                if (stack.isEmpty() || !stack.pop().equals(map.get(c))) {
                    return false;
                }
            } else {
                stack.push(c);
            }
        }
        return stack.isEmpty();
    }

    public boolean isValid3(String s) {
        int len = s.length();
        if (len % 2 != 0) {
            return false;
        }
        do {
            len = s.length();
            s = replace(s);
        } while (s.length() < len);
        return s.isEmpty();
    }

    private String replace(String s) {
        return s.replace("()", "").replace("[]", "").replace("{}", "");
    }

    public static void main(String[] args) {
        boolean result = new Q20().isValid3("()");
        System.out.println(result);
    }
}
