package binarysearch;

/**
 * @see <a href="https://leetcode.cn/problems/valid-perfect-square/">367. 有效的完全平方数</a>
 */
public class Q367 {

    public boolean isPerfectSquare(int num) {
        if (num < 2) {
            return true;
        }
        long left = 2;
        long right = num / 2;
        while (left <= right) {
            long mid = left + (right - left) / 2;
            long sqrt = mid * mid;
            if (sqrt == num) {
                return true;
            }
            if (sqrt > num) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return false;
    }

    public boolean isPerfectSquare2(int num) {
        int temp = 1;
        while (num > 0) {
            num -= temp;
            temp += 2;
        }
        return num == 0;
    }
}
