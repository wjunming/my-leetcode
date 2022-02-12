package hash;

/**
 * @see <a href="https://leetcode-cn.com/problems/design-hashset/">705. 设计哈希集合</a>
 */
public class Q705 {

    private boolean[] data;

    public Q705() {
        data = new boolean[1000001];
    }

    public void add(int key) {
        data[key] = true;
    }

    public void remove(int key) {
        data[key] = false;
    }

    public boolean contains(int key) {
        return data[key];
    }
}
