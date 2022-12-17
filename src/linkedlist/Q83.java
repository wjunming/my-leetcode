package linkedlist;

/**
 * @see <a href="https://leetcode.cn/problems/remove-duplicates-from-sorted-list/">83. 删除排序链表中的重复元素</a>
 */
public class Q83 {

    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) {
            return head;
        }
        ListNode p = head;
        while (p.next != null) {
            if (p.val == p.next.val) {
                p.next = p.next.next;
            } else {
                p = p.next;
            }
        }
        return head;
    }
}
