package array;

/**
 * @see <a href="https://leetcode.cn/problems/crawler-log-folder/">1598. 文件夹操作日志搜集器</a>
 */
public class Q1598 {

    public int minOperations(String[] logs) {
        int res = 0;
        for (String log : logs) {
            if ("../".equals(log)) {
                if (res > 0) {
                    res--;
                }
            } else if (!"./".equals(log)) {
                res++;
            }
        }
        return res;
    }
}
