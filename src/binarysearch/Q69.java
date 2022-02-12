package binarysearch;

/**
 * @see <a href="https://leetcode-cn.com/problems/sqrtx/">69. Sqrt(x)</a>
 */
public class Q69 {

    public int mySqrt(int x) {
        if (x == 0) {
            return 0;
        }
        int left = 0;
        int right = x;
        int res = -1;
        while (left <= right) {
           int mid = left + (right - left) / 2;
           if ((long) mid * mid <= x) {
               left = mid + 1;
               res = mid;
           } else {
               right = mid - 1;
           }
        }
        return res;
    }
}
