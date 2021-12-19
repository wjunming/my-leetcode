package array;

public class Q1652 {

    public int[] decrypt(int[] code, int k) {
        int len = code.length;
        int[] result = new int[len];
        if (k == 0) {
            return result;
        }
        for (int i = 0; i < len; i++) {
            if (k > 0) {
                for (int j = i  + 1; j <= i + k; j++) {
                    result[i] += code[j % len];
                }
            } else {
                for (int j = i + len - 1; j >= i + len + k; j--) {
                    result[i] += code[j % len];
                }
            }
        }
        return result;
    }
}
