package day05;

import java.util.HashMap;
import java.util.Map;

public class StringStatistics {

    public Map<Character, Integer> getStatistic(String text) {
        Map<Character, Integer> stringStatistic = new HashMap<>();
        for (Character c : text.toCharArray()) {
            if (!stringStatistic.containsKey(c)) {
                stringStatistic.put(c, 0);
            }
            stringStatistic.put(c, stringStatistic.get(c) + 1);
        }
        return stringStatistic;
    }
}
