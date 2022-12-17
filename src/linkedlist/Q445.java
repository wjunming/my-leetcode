package linkedlist;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @see <a href="https://leetcode.cn/problems/add-two-numbers-ii/">445. 两数相加 II</a>
 */
public class Q445 {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Deque<Integer> stack1 = new ArrayDeque<>(), stack2 = new ArrayDeque<>();
        while (l1 != null) {
            stack1.push(l1.val);
            l1 = l1.next;
        }
        while (l2 != null) {
            stack2.push(l2.val);
            l2 = l2.next;
        }
        ListNode res = null;
        int carry = 0;
        while (!stack1.isEmpty() || !stack2.isEmpty() || carry != 0) {
            int a = stack1.isEmpty() ? 0 : stack1.pop();
            int b = stack2.isEmpty() ? 0 : stack2.pop();
            int sum = a + b + carry;
            carry = sum / 10;
            ListNode tmp = new ListNode(sum % 10);
            tmp.next = res;
            res = tmp;
        }
        return res;
    }

}
