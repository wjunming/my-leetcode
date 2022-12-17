package str;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @see <a href="https://leetcode.cn/problems/subdomain-visit-count/">811. 子域名访问计数</a>
 */
public class Q811 {

    public List<String> subdomainVisits(String[] cpdomains) {
        Map<String, Integer> map = new HashMap<>();
        for (String domain : cpdomains) {
            String[] arr1 = domain.split(" ");
            int count = Integer.parseInt(arr1[0]);
            String[] arr2 = arr1[1].split("\\.");
            for (int i = 0; i < arr2.length; i++) {
                StringBuilder builder = new StringBuilder();
                for (int j = i; j < arr2.length; j++) {
                    builder.append(arr2[j]);
                    if (j != arr2.length - 1) {
                        builder.append(".");
                    }
                }
                map.merge(builder.toString(), count, Integer::sum);
            }
        }
        List<String> list = new ArrayList<>(map.size());
        map.forEach((k, v) -> list.add(v + " " + k));
        return list;
    }

    public List<String> subdomainVisits2(String[] cpdomains) {
        Map<String, Integer> map = new HashMap<>();
        for (String domain : cpdomains) {
            int spaceIndex = domain.indexOf(" ");
            int count = Integer.parseInt(domain.substring(0, spaceIndex));
            String str = domain.substring(spaceIndex + 1);
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == '.') {
                    String d = str.substring(i + 1);
                    map.put(d, map.getOrDefault(d, 0) + count);
                }
            }
            map.put(str, map.getOrDefault(str, 0) + count);
        }
        List<String> list = new ArrayList<>(map.size());
        map.forEach((k, v) -> list.add(v + " " + k));
        return list;
    }
}
