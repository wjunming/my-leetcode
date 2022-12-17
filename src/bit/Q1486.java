package bit;

/**
 * @see <a href="https://leetcode.cn/problems/xor-operation-in-an-array/">1486. 数组异或操作</a>
 */
public class Q1486 {

    public int xorOperation(int n, int start) {
        int result = 0;
        for (int i = 0; i < n; i++) {
            int num = start + 2 * i;
            result ^= num;
        }
        return result;
    }
}
