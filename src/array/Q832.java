package array;

/**
 * @see <a href="https://leetcode-cn.com/problems/flipping-an-image/">832. 翻转图像</a>
 */
public class Q832 {

    public int[][] flipAndInvertImage(int[][] A) {
        int len = A[0].length;
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < (len + 1) >> 1; j++) {
                int tmp = A[i][j] ^ 1;
                A[i][j] = A[i][len - 1 - j] ^ 1;
                A[i][len - 1 - j] = tmp;
            }
        }
        return A;
    }

    public static int[][] flipAndInvertImage2(int[][] A) {
        int len = A.length;
        for (int[] row : A) {
            for (int i = 0; i * 2 < len; i++) {
                if (row[i] == row[len - i - 1]) {
                    row[i] = row[len - i - 1] ^= 1;
                }
            }
        }
        return A;
    }
}
