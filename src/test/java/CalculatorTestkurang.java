package com.javakeanu;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTestkurang {

    @Test
    void testKurang3Minus2() {
        assertEquals(1, Calculator.kurang(3, 2));  // 3 - 2 = 1
    }

    @Test
    void testKurang2Minus3() {
        assertEquals(-1, Calculator.kurang(2, 3)); // 2 - 3 = -1
    }

    @Test
    void testKurang5Minus5() {
        assertEquals(0, Calculator.kurang(5, 5));  // 5 - 5 = 0
    }

    @Test
    void testKurangNeg5Minus5() {
        assertEquals(-10, Calculator.kurang(-5, 5)); // -5 - 5 = -10
    }
}
