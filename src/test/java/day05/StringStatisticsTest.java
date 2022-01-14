package day05;

import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class StringStatisticsTest {

    @Test
    void testStringStatistics() {
        StringStatistics stringStatistics = new StringStatistics();
        System.out.println(stringStatistics.getStatistic("almafa"));
        assertEquals(3,stringStatistics.getStatistic("almafa").get('a'));

    }
}