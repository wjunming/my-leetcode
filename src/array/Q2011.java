package array;

import java.util.Arrays;

/**
 * @see <a href="https://leetcode.cn/problems/final-value-of-variable-after-performing-operations/">2011. 执行操作后的变量值</a>
 */
public class Q2011 {

    public int finalValueAfterOperations(String[] operations) {
        int x = 0;
        for (String operation : operations) {
            if (operation.contains("++")) {
                x++;
            } else {
                x--;
            }
        }
        return x;
    }

    public int finalValueAfterOperations2(String[] operations) {
        int x = 0;
        for (String operation : operations) {
            if (operation.charAt(1) == '+') {
                x++;
            } else {
                x--;
            }
        }
        return x;
    }

    public int finalValueAfterOperations3(String[] operations) {
        return Arrays.stream(operations).mapToInt(o -> o.charAt(1) == '+' ? 1 : -1).sum();
    }
}
