package dfs_bfs;

public class Q79 {

    public boolean exist(char[][] board, String word) {
        int h = board.length;
        int w = board[0].length;
        boolean[][] visited = new boolean[h][w];
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                boolean flag = check(board, visited, i, j, word, 0);
                if (flag) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean check(char[][] board, boolean[][] visited, int i, int j, String word, int level) {
        if (board[i][j] != word.charAt(level)) {
            return false;
        }
        if (level == word.length() - 1) {
            return true;
        }
        visited[i][j] = true;
        int[][] directions = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
        boolean result = false;
        for (int[] dir : directions) {
            int newi = i + dir[0];
            int newj = j + dir[1];
            if (newi >= 0 && newi < board.length && newj >= 0 && newj < board[0].length) {
                if (!visited[newi][newj]) {
                    boolean flag = check(board, visited, newi, newj, word, level + 1);
                    if (flag) {
                        result = true;
                        break;
                    }
                }
            }
        }
        visited[i][j] = false;
        return result;
    }

    public boolean exist2(char[][] board, String word) {
        boolean[][] visited = new boolean[board.length][board[0].length];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (search(board, word, visited, i, j, 0)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean search(char[][] board, String word, boolean[][] visited, int i, int j, int index) {
        if (index == word.length()) {
            return true;
        }
        if (i < 0 || i >= board.length || j < 0 || j >= board[i].length || board[i][j] != word.charAt(index) || visited[i][j]) {
            return false;
        }
        visited[i][j] = true;
        if (search(board, word, visited, i + 1, j, index + 1) ||
                search(board, word, visited, i - 1, j, index + 1) ||
                search(board, word, visited, i, j + 1, index + 1) ||
                search(board, word, visited, i, j - 1, index + 1)) {
            return true;
        }
        visited[i][j] = false;
        return false;
    }
}
