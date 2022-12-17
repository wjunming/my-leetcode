package stack;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @see <a href="https://leetcode.cn/problems/validate-stack-sequences/">946. 验证栈序列</a>
 */
public class Q946 {

    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Deque<Integer> stack = new ArrayDeque<>();
        for (int i = 0, j = 0; i < pushed.length; i++) {
            stack.push(pushed[i]);
            while (!stack.isEmpty() && stack.peek() == popped[j]) {
                stack.pop();
                j++;
            }
        }
        return stack.isEmpty();
    }
}
