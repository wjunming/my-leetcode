package other;

import java.util.Collections;
import java.util.List;

/**
 * @see <a href="https://leetcode.cn/problems/minimum-time-difference/">539. 最小时间差</a>
 */
public class Q539 {

    public int findMinDifference(List<String> timePoints) {
        if (timePoints.size() > 1440) {
            return 0;
        }
        Collections.sort(timePoints);
        int res = Integer.MAX_VALUE;
        int time0Minutes = getMinutes(timePoints.get(0));
        int preMinutes = time0Minutes;
        for (int i = 1; i < timePoints.size(); i++) {
            int minutes = getMinutes(timePoints.get(i));
            res = Math.min(res, minutes - preMinutes);
            preMinutes = minutes;
        }
        res = Math.min(res, time0Minutes + 1440 - preMinutes);
        return res;
    }

    private int getMinutes(String time) {
        return ((time.charAt(0) - '0') * 10 + (time.charAt(1) - '0')) * 60 +
            (time.charAt(3) - '0') * 10 + (time.charAt(4) - '0');
    }
}
