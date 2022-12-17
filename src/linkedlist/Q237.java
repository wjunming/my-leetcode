package linkedlist;

/**
 * @see <a href="https://leetcode.cn/problems/delete-node-in-a-linked-list/">237. 删除链表中的节点</a>
 */
public class Q237 {

    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
