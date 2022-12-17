package str;

/**
 * @see <a href="https://leetcode.cn/problems/complex-number-multiplication/">537. 复数乘法</a>
 */
public class Q537 {

    public String complexNumberMultiply(String num1, String num2) {
        String[] complex1 = num1.split("\\+|i");
        String[] complex2 = num2.split("\\+|i");
        int real1 = Integer.parseInt(complex1[0]);
        int imag1 = Integer.parseInt(complex1[1]);
        int real2 = Integer.parseInt(complex2[0]);
        int imag2 = Integer.parseInt(complex2[1]);
        return String.format("%d+%di", real1 * real2 - imag1 * imag2, real1 * imag2 + real2 * imag1);
    }

    public static void main(String[] args) {
        String s1 = "1+1i";
        String s2 = "1+1i";
        new Q537().complexNumberMultiply(s1, s2);
    }
}
