package linkedlist;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @see <a href="https://leetcode.cn/problems/linked-list-random-node/">382. 链表随机节点</a>
 */
public class Q382 {

    private List<Integer> list;
    private Random random;

    public Q382(ListNode head) {
        list = new ArrayList<>();
        while (head != null) {
            list.add(head.val);
            head = head.next;
        }
        random = new Random();
    }
}
