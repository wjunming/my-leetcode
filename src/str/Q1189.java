package str;

import java.util.Arrays;

/**
 * @see <a href="https://leetcode.cn/problems/maximum-number-of-balloons/">1189. “气球” 的最大数量</a>
 */
public class Q1189 {

    public int maxNumberOfBalloons(String text) {
        int[] arr = new int[5];
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch == 'b') {
                arr[0]++;
            } else if (ch == 'a') {
                arr[1]++;
            } else if (ch == 'l') {
                arr[2]++;
            } else if (ch == 'o') {
                arr[3]++;
            } else if (ch == 'n') {
                arr[4]++;
            }
        }
        arr[2] /= 2;
        arr[3] /= 2;
        return Arrays.stream(arr).min().getAsInt();
    }
}
