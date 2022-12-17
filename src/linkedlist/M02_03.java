package linkedlist;

/**
 * @see <a href="https://leetcode.cn/problems/delete-middle-node-lcci/">面试题 02.03. 删除中间节点</a>
 */
public class M02_03 {

    public void deleteNode(ListNode node) {
        if (node == null || node.next == null) {
            return;
        }
        ListNode slow = node, fast = node.next;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            if (fast == null || fast.next == null) {
                break;
            }
            slow = slow.next;
        }
        slow.next = slow.next.next;
    }

    public static void main(String[] args) {
        ListNode node = new ListNode(4);
        node.next = new ListNode(5);
        node.next.next = new ListNode(1);
        node.next.next.next = new ListNode(9);
        node.next.next.next.next = new ListNode(8);
        M02_03 obj = new M02_03();
        obj.deleteNode(node);
        System.out.println(node);
    }
}
