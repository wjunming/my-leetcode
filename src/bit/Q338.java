package bit;

/**
 * @see <a href="https://leetcode.cn/problems/counting-bits/">338. 比特位计数</a>
 */
public class Q338 {

    public int[] countBits(int n) {
        int[] res = new int[n + 1];
        for (int i = 1; i < res.length; i++) {
            res[i] = countOnes(i);
        }
        return res;
    }

    private int countOnes(int i) {
        int count = 0;
        while (i > 0) {
            i &= i - 1;
            count++;
        }
        return count;
    }
}
