package hash;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * @see <a href="https://leetcode.cn/problems/stock-price-fluctuation/">2034. 股票价格波动</a>
 */
public class Q2034 {

    private Map<Integer, Integer> timePriceMap;
    private TreeMap<Integer, Integer> priceMap;
    private int maxTimeStamp;

    public Q2034() {
        timePriceMap = new HashMap<>();
        priceMap = new TreeMap<>();
        maxTimeStamp = 0;
    }

    public void update(int timestamp, int price) {
        maxTimeStamp = Math.max(maxTimeStamp, timestamp);
        int prePrice = timePriceMap.getOrDefault(timestamp, 0);
        timePriceMap.put(timestamp, price);
        if (prePrice > 0) {
            priceMap.put(prePrice, priceMap.get(prePrice) - 1);
            if (priceMap.get(prePrice) == 0) {
                priceMap.remove(prePrice);
            }
        }
        priceMap.put(price, priceMap.getOrDefault(price, 0) + 1);
    }

    public int current() {
        return timePriceMap.get(maxTimeStamp);
    }

    public int maximum() {
        return priceMap.lastKey();
    }

    public int minimum() {
        return priceMap.firstKey();
    }
}
