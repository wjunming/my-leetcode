package greedy;

public class Q121 {

    public int maxProfit(int[] prices) {
        int total = 0;
        int min = Integer.MAX_VALUE;
        for (int price : prices) {
            if (price < min) {
                min = price;
            } else if (price - min > total) {
                total = price - min;
            }
        }
        return total;
    }
}
