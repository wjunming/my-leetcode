package linkedlist;

import java.util.HashSet;
import java.util.Set;

/**
 * @see <a href="https://leetcode.cn/problems/remove-duplicate-node-lcci/">面试题 02.01. 移除重复节点</a>
 */
public class M02_01 {

    public ListNode removeDuplicateNodes(ListNode head) {
        if (head == null) {
            return null;
        }
        Set<Integer> set = new HashSet<>();
        ListNode p = head;
        set.add(p.val);
        while (p.next != null) {
            if (!set.add(p.next.val)) {
                p.next = p.next.next;
            } else {
                p = p.next;
            }
        }
        return head;
    }
}
