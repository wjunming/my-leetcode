package array;

public class Q11 {

    public int maxArea(int[] height) {
        int max = 0;
        for (int i = 0; i < height.length - 1; i++) {
            for (int j = i + 1; j < height.length; j++) {
                int area = Math.min(height[i], height[j]) * (j - i);
                max = Math.max(max, area);
            }
        }
        return max;
    }

    public int maxArea2(int[] height) {
        int max = 0;
        for (int i = 0, j = height.length - 1; i < j; ) {
            int low = height[i] < height[j] ? height[i++] : height[j--];
            max = Math.max(max, (j - i + 1) * low);
        }
        return max;
    }
}
