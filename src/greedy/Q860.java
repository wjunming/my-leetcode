package greedy;

/**
 * @see <a href="https://leetcode.cn/problems/lemonade-change/description/">860. 柠檬水找零</a>
 */
public class Q860 {

    public boolean lemonadeChange(int[] bills) {
        int five = 0;
        int ten = 0;
        for (int bill : bills) {
            if (bill == 5) {
                five++;
            } else if (bill == 10) {
                if (five >= 1) {
                    ten++;
                    five--;
                } else {
                    return false;
                }
            } else if (bill == 20) {
                if (ten >= 1 && five >= 1) {
                    ten--;
                    five--;
                } else if (five >= 3) {
                    five -= 3;
                } else {
                    return false;
                }
            }
        }
        return true;
    }
}
