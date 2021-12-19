package recursion;

public class Q50 {

    public double myPow(double x, int n) {
        if (n < 0) {
            x = 1 / x;
            n = -n;
        }
        return fastPow(x, n);
    }

    private double fastPow(double x, int n) {
        if (n == 0) {
            return 1;
        }
        double res = fastPow(x, n / 2);
        if (n % 2 == 0) {
            return res * res;
        }
        return res * res * x;
    }
}
