package dp;

import java.util.ArrayList;
import java.util.List;

/**
 * @see <a href="https://leetcode.cn/problems/pascals-triangle/">118. 杨辉三角</a>
 */
public class Q118 {

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    row.add(1);
                } else {
                    row.add(result.get(i - 1).get(j - 1) + result.get(i - 1).get(j));
                }
            }
            result.add(row);
        }
        return result;
    }

    private long count = 0;

    private void add() {
        int index = 0;
        while (index++ < 10000) {
            count++;
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Q118 obj = new Q118();
        Thread t1 = new Thread(() -> obj.add());
        Thread t2 = new Thread(() -> obj.add());
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(obj.count);
    }
}
