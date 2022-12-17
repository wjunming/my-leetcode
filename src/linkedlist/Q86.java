package linkedlist;

/**
 * @see <a href="https://leetcode.cn/problems/partition-list/">86. 分隔链表</a>
 */
public class Q86 {

    public ListNode partition(ListNode head, int x) {
        ListNode small = new ListNode(0), smallHead = small;
        ListNode large = new ListNode(0), largeHead = large;
        while (head != null) {
            if (head.val < x) {
                small.next = head;
                small = small.next;
            } else {
                large.next = head;
                large = large.next;
            }
            head = head.next;
        }
        large.next = null;
        small.next = largeHead.next;
        return smallHead.next;
    }
}
