package array;

import java.util.Arrays;

/**
 * @see <a href="https://leetcode.cn/problems/merge-sorted-array/">88. 合并两个有序数组</a>
 */
public class Q88 {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int i = 0; i != n; i++) {
            nums1[m + i] = nums2[i];
        }
        Arrays.sort(nums1);
    }

    public void merge2(int[] nums1, int m, int[] nums2, int n) {
        int[] tmp = new int[m + n];
        for (int i = m - 1, j = n - 1, pos = m + n - 1; i >= 0 || j >= 0; pos--) {
            if (i == -1) {
                tmp[pos] = nums2[j];
                j--;
            } else if (j == -1) {
                tmp[pos] = nums1[i];
                i--;
            } else if (nums1[i] > nums2[j]) {
                tmp[pos] = nums1[i];
                i--;
            } else {
                tmp[pos] = nums2[j];
                j--;
            }
        }
        for (int i = 0; i < tmp.length; i++) {
            nums1[i] = tmp[i];
        }
    }

    public void merge3(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;
        int j = n - 1;
        int pos = m + n - 1;
        int cur;
        while (i >= 0 || j >= 0) {
            if (i == -1) {
                cur = nums2[j--];
            } else if (j == -1) {
                cur = nums1[i--];
            } else if (nums1[i] > nums2[j]) {
                cur = nums1[i--];
            } else {
                cur = nums2[j--];
            }
            nums1[pos--] = cur;
        }
    }
}
