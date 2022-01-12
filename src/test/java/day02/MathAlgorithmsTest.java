package day02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MathAlgorithmsTest {

    @Test
    void testMathAlgorithms() {
        MathAlgorithms mathAlgorithms = new MathAlgorithms();
        assertEquals(6,mathAlgorithms.findBiggestCommonDivider(12,18));
        assertEquals(1,mathAlgorithms.findBiggestCommonDivider(25,9));
        assertEquals(13,mathAlgorithms.findBiggestCommonDivider(13,26));
        assertEquals(12,mathAlgorithms.findBiggestCommonDivider(84,48));
    }
}
