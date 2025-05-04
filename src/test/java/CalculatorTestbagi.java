package com.javakeanu;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTestbagi {

    @Test
    void testBagi6Dibagi3() {
        assertEquals(2, Calculator.bagi(6, 3));    // 6 / 3 = 2
    }

    @Test
    void testBagi1Dibagi2() {
        assertEquals(0, Calculator.bagi(1, 2));    // 1 / 2 = 0 (karena integer division)
    }

    @Test
    void testBagiNegatif4Dibagi2() {
        assertEquals(-2, Calculator.bagi(-4, 2));  // -4 / 2 = -2
    }

    @Test
    void testBagi5Dibagi5() {
        assertEquals(1, Calculator.bagi(5, 5));    // 5 / 5 = 1
    }

    @Test
    void testBagiDenganNol() {
        Exception exception = assertThrows(ArithmeticException.class, () -> {
            Calculator.bagi(5, 0);  // 5 / 0 harus error
        });
        assertEquals("/ by zero", exception.getMessage());
    }
}
