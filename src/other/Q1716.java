package other;

/**
 * @see <a href="https://leetcode.cn/problems/calculate-money-in-leetcode-bank/">1716. 计算力扣银行的钱</a>
 */
public class Q1716 {

    public int totalMoney(int n) {
        int week = 1;
        int day = 1;
        int res = 0;
        for (int i = 0; i < n; i++) {
            res += week + day - 1;
            day++;
            if (day == 8) {
                week++;
                day = 1;
            }
        }
        return res;
    }

    public int totalMoney2(int n) {
        int weekNumber = n / 7;
        int firstWeekMoney = (1 + 7) * 7 / 2;
        int lastWeekMoney = firstWeekMoney + 7 * (weekNumber - 1);
        int totalWeeksMoney = (firstWeekMoney + lastWeekMoney) * weekNumber / 2;

        int dayNumber = n % 7;
        int firstDayMoney = weekNumber + 1;
        int lastDayMoney = firstDayMoney + dayNumber - 1;
        int totalDaysMoney = (firstDayMoney + lastDayMoney) * dayNumber / 2;
        return totalWeeksMoney + totalDaysMoney;
    }
}
