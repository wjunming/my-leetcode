package array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @see <a href="https://leetcode.cn/problems/make-two-arrays-equal-by-reversing-sub-arrays/">1460. 通过翻转子数组使两个数组相等</a>
 */
public class Q1460 {

    public boolean canBeEqual(int[] target, int[] arr) {
        Arrays.sort(target);
        Arrays.sort(arr);
        return Arrays.equals(target, arr);
    }

    public boolean canBeEqual2(int[] target, int[] arr) {
        int[] tmp = new int[1001];
        for (int i = 0; i < target.length; i++) {
            tmp[target[i]]++;
            tmp[arr[i]]--;
        }
        for (int i = 0; i < tmp.length; i++) {
            if (tmp[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public boolean canBeEqual3(int[] target, int[] arr) {
        Map<Integer, Integer> map = new HashMap<>(target.length);
        for (int i = 0; i < target.length; i++) {
            map.put(target[i], map.getOrDefault(target[i], 0) + 1);
            map.put(arr[i], map.getOrDefault(arr[i], 0) - 1);
        }
        for (Integer i : map.keySet()) {
            if (map.get(i) != 0) {
                return false;
            }
        }
        return true;
    }
}
