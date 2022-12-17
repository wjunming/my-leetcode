package linkedlist;

/**
 * @see <a href="https://leetcode.cn/problems/merge-in-between-linked-lists/">1669. 合并两个链表</a>
 */
public class Q1669 {

    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode p1 = list1, p2 = list2, pre = null, suf = null;
        int pos = 0;
        while (p1 != null) {
            if (pos == a - 1) {
                pre = p1;
            }
            if (pos == b) {
                suf = p1.next;
            }
            p1 = p1.next;
            pos++;
        }
        pre.next = list2;
        while (p2.next != null) {
            p2 = p2.next;
        }
        p2.next = suf;
        return list1;
    }
}
