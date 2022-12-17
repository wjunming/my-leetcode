package stack;

import java.util.Stack;

/**
 * @see <a href="https://leetcode.cn/problems/min-stack/">155. 最小栈</a>
 */
public class Q155 {

    private Stack<Integer> stack;

    private int min;

    public Q155() {
        stack = new Stack<>();
        min = Integer.MAX_VALUE;
    }

    public void push(int val) {
        if (val <= min) {
            stack.push(min);
            min = val;
        }
        stack.push(val);
    }

    public void pop() {
        if (stack.pop() == min) {
            min = stack.pop();
        }
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return min;
    }
}

class MinStack {

    private Node head;

    public MinStack() {

    }

    public void push(int val) {
        if (head == null) {
            head = new Node(val, val);
        } else {
            head = new Node(val, Math.min(head.getMin(), val), head);
        }
    }

    public void pop() {
        head = head.next;
    }

    public int top() {
        return head.getVal();
    }

    public int getMin() {
        return head.getMin();
    }

    private class Node {

        private int val;
        private int min;
        private Node next;

        public Node(int val, int min) {
            this(val, min, null);
        }

        public Node(int val, int min, Node next) {
            this.val = val;
            this.min = min;
            this.next = next;
        }

        public int getVal() {
            return val;
        }

        private int getMin() {
            return min;
        }
    }
}
