package linkedlist;

import java.util.ArrayList;
import java.util.List;

/**
 * @see <a href="https://leetcode.cn/problems/palindrome-linked-list/">234. 回文链表</a>
 */
public class Q234 {

    public boolean isPalindrome(ListNode head) {
        List<Integer> list = new ArrayList<>();
        ListNode p = head;
        while (p != null) {
            list.add(p.val);
            p = p.next;
        }
        int left = 0;
        int right = list.size() - 1;
        while (left < right) {
            if (list.get(left++) != list.get(right--)) {
                return false;
            }
        }
        return true;
    }
}
