package hash;

import java.util.HashMap;
import java.util.Map;

/**
 * @see <a href="https://leetcode.cn/problems/decode-the-message/">2325. 解密消息</a>
 */
public class Q2325 {

    public String decodeMessage(String key, String message) {
        Map<Character, Character> map = new HashMap<>();
        char cur = 'a';
        for (int i = 0; i < key.length(); i++) {
            char c = key.charAt(i);
            if (c != ' ' & !map.containsKey(c)) {
                map.put(c, cur++);
            }
        }
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < message.length(); i++) {
            char c = message.charAt(i);
            if (c != ' ') {
                c = map.get(c);
            }
            builder.append(c);
        }
        return builder.toString();
    }

    public String decodeMessage2(String key, String message) {
        char[] map = new char[26];
        char curChar = 'a';
        for (char i : key.toCharArray()) {
            if (i != ' ' && map[i - 'a'] == 0) {
                map[i - 'a'] = curChar++;
            }
        }
        char[] res = message.toCharArray();
        for (int i = 0; i < res.length; i++) {
            if (res[i] != ' ') {
                res[i] = map[res[i] - 'a'];
            }
        }
        return new String(res);
    }
}
