package linkedlist;

/**
 * @see <a href="https://leetcode.cn/problems/middle-of-the-linked-list/">876. 链表的中间结点</a>
 */
public class Q876 {

    public ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}
