package recursion;

import java.util.*;

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

    public static void main(String[] args) {
        System.out.println(new Q17().letterCombinations("23"));
    }
}
