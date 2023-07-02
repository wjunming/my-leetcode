package recursion;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * @see <a href="https://leetcode.cn/problems/find-the-winner-of-the-circular-game/">1823. 找出游戏的获胜者</a>
 */
public class Q1823 {

    public int findTheWinner(int n, int k) {
        Queue<Integer> queue = new ArrayDeque<>();
        for (int i = 1; i <= n; i++) {
            queue.offer(i);
        }
        while (queue.size() > 1) {
            for (int i = 1; i < k; i++) {
                queue.offer(queue.poll());
            }
            queue.poll();
        }
        return queue.peek();
    }

    public int findTheWinner2(int n, int k) {
        if (n == 1) {
            return 1;
        }
        return (k + findTheWinner2(n - 1, k) - 1) % n + 1;
    }

    public int findTheWinner3(int n, int k) {
        int winner = 1;
        for (int i = 2; i <= n; i++) {
            winner = (k + winner - 1) % i + 1;
        }
        return winner;
    }
}
