package linkedlist;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @see <a href="https://leetcode.cn/problems/remove-nth-node-from-end-of-list/">19. 删除链表的倒数第 N 个结点</a>
 */
public class Q19 {

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0, head);
        Deque<ListNode> stack = new ArrayDeque<>();
        ListNode temp = dummy;
        while (temp != null) {
            stack.push(temp);
            temp = temp.next;
        }
        for (int i = 0; i < n; i++) {
            stack.pop();
        }
        ListNode prev = stack.peek();
        prev.next = prev.next.next;
        return dummy.next;
    }
}
