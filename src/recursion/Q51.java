package recursion;

import java.util.*;

/**
 * @see <a href="https://leetcode.cn/problems/n-queens/">51. N 皇后</a>
 */
public class Q51 {

    public List<List<String>> solveNQueens(int n) {
        List<List<String>> result = new ArrayList<>();
        int[] queens = new int[n];
        Arrays.fill(queens, -1);
        Set<Integer> columns = new HashSet<>();
        Set<Integer> diagonals1 = new HashSet<>();
        Set<Integer> diagonals2 = new HashSet<>();
        backtrack(result, queens, n, 0, columns, diagonals1, diagonals2);
        return result;
    }

    private void backtrack(List<List<String>> result, int[] queens, int n, int row, Set<Integer> columns,
                           Set<Integer> diagonals1, Set<Integer> diagonals2) {
        if (n == row) {
            List<String> board = generateBoard(queens, n);
            result.add(board);
        } else {
            for (int i = 0; i < n; i++) {
                if (columns.contains(i)) {
                    continue;
                }
                int diagonal1 = row + i;
                if (diagonals1.contains(diagonal1)) {
                    continue;
                }
                int diagonal2 = row - i;
                if (diagonals2.contains(diagonal2)) {
                    continue;
                }
                queens[row] = i;
                columns.add(i);
                diagonals1.add(diagonal1);
                diagonals2.add(diagonal2);
                backtrack(result, queens, n, row + 1, columns, diagonals1, diagonals2);
                queens[row] = -1;
                columns.remove(i);
                diagonals1.remove(diagonal1);
                diagonals2.remove(diagonal2);
            }
        }
    }

    private List<String> generateBoard(int[] queens, int n) {
        List<String> board = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            char[] row = new char[n];
            Arrays.fill(row, '.');
            row[queens[i]] = 'Q';
            board.add(new String(row));
        }
        return board;
    }
}
