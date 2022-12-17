package other;

import java.util.ArrayList;
import java.util.List;

/**
 * @see <a href="https://leetcode.cn/problems/simplified-fractions/">1447. 最简分数</a>
 */
public class Q1447 {

    public List<String> simplifiedFractions(int n) {
        List<String> result = new ArrayList<>();
        for (int i = 2; i <= n; i++) {
            for (int j = 1; j < i; j++) {
                if (gcd(j, i) == 1) {
                    result.add(j + "/" + i);
                }
            }
        }
        return result;
    }

    private int gcd(int a, int b) {
        return b != 0 ? gcd(b, a % b) : a;
    }
}
