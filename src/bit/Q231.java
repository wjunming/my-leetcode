package bit;

/**
 * @see <a href="https://leetcode.cn/problems/power-of-two/">231. 2 的幂</a>
 */
public class Q231 {

    private static final int BIG = 1 << 30;

    public boolean isPowerOfTwo(int n) {
        return n > 0 && (n & (n - 1)) == 0;
    }

    public boolean isPowerOfTwo2(int n) {
        return n > 0 && BIG % n == 0;
    }
}
