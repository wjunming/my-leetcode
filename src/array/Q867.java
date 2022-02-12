package array;

/**
 * @see <a href="https://leetcode-cn.com/problems/transpose-matrix/">867. 转置矩阵</a>
 */
public class Q867 {

    public int[][] transpose(int[][] A) {
        int arrayLen = A.length;
        int elementLen = A[0].length;
        int[][] result = new int[elementLen][arrayLen];
        for (int i = 0; i < arrayLen; i++) {
            for (int j = 0; j < elementLen; j++) {
                result[j][i] = A[i][j];
            }
        }
        return result;
    }
}
