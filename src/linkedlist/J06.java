package linkedlist;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

/**
 * @see <a href="https://leetcode.cn/problems/cong-wei-dao-tou-da-yin-lian-biao-lcof/">剑指 Offer 06. 从尾到头打印链表</a>
 */
public class J06 {

    public int[] reversePrint(ListNode head) {
        if (head == null) {
            return new int[]{};
        }
        ListNode p = head;
        Deque<Integer> stack = new ArrayDeque<>();
        while (p != null) {
            stack.push(p.val);
            p = p.next;
        }
        int[] res = new int[stack.size()];
        for (int i = 0; i < res.length; i++) {
            res[i] = stack.pop();
        }
        return res;
    }

    public int[] reversePrint2(ListNode head) {
        List<Integer> list = new ArrayList<>();
        recursive(list, head);
        int[] res = new int[list.size()];
        for (int i = 0; i < res.length; i++) {
            res[i] = list.get(i);
        }
        return res;
    }

    private void recursive(List<Integer> list, ListNode head) {
        if (head == null) {
            return;
        }
        recursive(list, head.next);
        list.add(head.val);
    }
}
