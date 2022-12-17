package bit;

/**
 * @see <a href="https://leetcode.cn/problems/number-of-1-bits/">191. 位1的个数</a>
 */
public class Q191 {

    public int hammingWeight(int n) {
        int count = 0;
        while (n != 0) {
            n &= (n - 1);
            count++;
        }
        return count;
    }

    public int hammingWeight2(int n) {
        int count = 0;
        String s = Integer.toBinaryString(n);
        for (int i = 0; i < s.length(); i++) {
            if ('1' == s.charAt(i)) {
                count++;
            }
        }
        return count;
    }
}
