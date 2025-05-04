import com.javakeanu.*;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ValidateRange {

    @Test
    public void testLessThanRange() {
        IllegalArgumentException exception =
                assertThrows(IllegalArgumentException.class, () -> {
                    Computation.validateRange(-50000);
                });

        assertEquals("Error: Nilai terlalu kecil dari batas minimum.", exception.getMessage());
    }

    @Test
    public void testGreaterThanRange() {
        IllegalArgumentException exception =
                assertThrows(IllegalArgumentException.class, () -> {
                    Computation.validateRange(50000);
                });

        assertEquals("Error: Nilai melebihi batas maksimum.", exception.getMessage());
    }

    @Test
    void testBetweenRangePositive() {
        assertDoesNotThrow(() -> Computation.validateRange(20));
    }

    @Test
    void testBetweenRangeNegative() {
        assertDoesNotThrow(() -> Computation.validateRange(-15));
    }

    @Test
    void testMaximumValueRange() {
        assertDoesNotThrow(() -> Computation.validateRange(32767));
    }

    @Test
    void testMinimumValueRange() {
        assertDoesNotThrow(() -> Computation.validateRange(-32768));
    }

}
