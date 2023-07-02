package bit;

/**
 * @see <a href="https://leetcode.cn/problems/count-the-number-of-consistent-strings/">1684. 统计一致字符串的数目</a>
 */
public class Q1684 {

    public int countConsistentStrings(String allowed, String[] words) {
        int count = 0;
        int[] cache = new int[26];
        for (int i = 0; i < allowed.length(); i++) {
            cache[allowed.charAt(i) - 'a'] = 1;
        }
        for (String word : words) {
            boolean flag = true;
            for (int i = 0; i < word.length(); i++) {
                if (cache[word.charAt(i) - 'a'] != 1) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                count++;
            }
        }
        return count;
    }

    public int countConsistentStrings2(String allowed, String[] words) {
        int mask = 0;
        for (int i = 0; i < allowed.length(); i++) {
            mask |= 1 << allowed.charAt(i) - 'a';
        }
        int count = 0;
        for (String word : words) {
            int mask1 = 0;
            for (int i = 0; i < word.length(); i++) {
                mask1 |= 1 << word.charAt(i) - 'a';
            }
            if ((mask | mask1) == mask) {
                count++;
            }
        }
        return count;
    }
}
