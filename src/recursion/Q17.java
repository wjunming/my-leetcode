package recursion;

import java.util.*;

/**
 * @see <a href="https://leetcode-cn.com/problems/letter-combinations-of-a-phone-number/">17. 电话号码的字母组合</a>
 */
public class Q17 {

    public List<String> letterCombinations(String digits) {
        if (digits == null || digits.isEmpty()) {
            return Collections.emptyList();
        }
        Map<Character, String> map = new HashMap<>(8);
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");
        List<String> res = new LinkedList<>();
        search("", digits, res, map, 0);
        return res;
    }

    private void search(String s, String digits, List<String> res, Map<Character, String> map, int level) {
        if (level == digits.length()) {
            res.add(s);
            return;
        }
        String letters = map.get(digits.charAt(level));
        for (int i = 0; i < letters.length(); i++) {
            search(s + letters.charAt(i), digits, res, map, level + 1);
        }
    }

    public List<String> letterCombinations2(String digits) {
        if (digits == null || digits.isEmpty()) {
            return Collections.emptyList();
        }
        String[] map = {"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        List<String> result = new ArrayList<>();
        dfs(map, result, digits, "", 0);
        return result;
    }

    private void dfs(String[] map, List<String> result, String digits, String s, int n) {
        if (digits.length() == n) {
            result.add(s);
            return;
        }
        String letters = map[Character.getNumericValue(digits.charAt(n))];
        for (int i = 0; i < letters.length(); i++) {
            dfs(map, result, digits, s + letters.charAt(i), n + 1);
        }
    }

    public static void main(String[] args) {
        System.out.println(new Q17().letterCombinations("23"));
    }
}
