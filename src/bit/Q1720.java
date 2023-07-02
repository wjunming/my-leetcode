package bit;

/**
 * @see <a href="https://leetcode.cn/problems/decode-xored-array/">1720. 解码异或后的数组</a>
 */
public class Q1720 {

    public int[] decode(int[] encoded, int first) {
        int n = encoded.length + 1;
        int[] res = new int[n];
        res[0] = first;
        for (int i = 1; i < res.length; i++) {
            res[i] = encoded[i - 1] ^ res[i - 1];
        }
        return res;
    }
}
