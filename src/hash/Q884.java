package hash;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @see <a href="https://leetcode-cn.com/problems/uncommon-words-from-two-sentences/">884. 两句话中的不常见单词</a>
 */
public class Q884 {

    public String[] uncommonFromSentences(String s1, String s2) {
        Map<String, Integer> map = new HashMap<>();
        insertToMap(map, s1);
        insertToMap(map, s2);
        List<String> result = new ArrayList<>();
        map.forEach((key, value) -> {
            if (map.get(key) == 1) {
                result.add(key);
            }
        });
        return result.toArray(new String[0]);
    }

    private void insertToMap(Map<String, Integer> map, String s) {
        String[] array = s.split(" ");
        for (String arr : array) {
            map.put(arr, map.getOrDefault(arr, 0) + 1);
        }
    }
}
