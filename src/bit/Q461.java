package bit;

/**
 * @see <a href="https://leetcode.cn/problems/hamming-distance/">461. 汉明距离</a>
 */
public class Q461 {

    public int hammingDistance(int x, int y) {
        int z = x ^ y;
        int count = 0;
        while (z != 0) {
            z &= z - 1;
            count++;
        }
        return count;
    }

    public int hammingDistance2(int x, int y) {
        return Integer.bitCount(x ^ y);
    }
}
