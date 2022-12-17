package linkedlist;

import java.util.HashSet;
import java.util.Set;

/**
 * @see <a href="https://leetcode.cn/problems/intersection-of-two-linked-lists/">160. 相交链表</a>
 */
public class Q160 {

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        Set<ListNode> set = new HashSet<>();
        ListNode a = headA;
        while (a != null) {
            set.add(a);
            a = a.next;
        }
        ListNode b = headB;
        while (b != null) {
            if (set.contains(b)) {
                return b;
            }
            b = b.next;
        }
        return null;
    }

    public ListNode getIntersectionNode2(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) {
            return null;
        }
        ListNode a = headA, b = headB;
        while (a != b) {
            a = a == null ? headB : a.next;
            b = b == null ? headA : b.next;
        }
        return a;
    }
}
