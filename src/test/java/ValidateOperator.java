import com.javakeanu.*;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ValidateOperator {

    @Test
    void TestOperatorNull() {
        IllegalArgumentException exception =
                assertThrows(IllegalArgumentException.class, () -> {
                    Computation.validateOperator(null);
                });

        assertEquals("Error: Operator tidak boleh kosong.", exception.getMessage());
    }

    @Test
    void TestOperatorEmpty() {
        IllegalArgumentException exception =
                assertThrows(IllegalArgumentException.class, () -> {
                    Computation.validateOperator(" ");
                });

        assertEquals("Error: Operator tidak boleh kosong.", exception.getMessage());
    }

    @Test
    void TestOperatorString() {
        IllegalArgumentException exception =
                assertThrows(IllegalArgumentException.class, () -> {
                    Computation.validateOperator("test");
                });

        assertEquals("Error: Operator tidak valid.", exception.getMessage());
    }

    @Test
    void TestOperatorNumber() {
        IllegalArgumentException exception =
                assertThrows(IllegalArgumentException.class, () -> {
                    Computation.validateOperator("12345");
                });

        assertEquals("Error: Operator tidak valid.", exception.getMessage());
    }

    @Test
    void TestOperatorAdd() {
        assertDoesNotThrow(() -> Computation.validateOperator("+"));
    }

    @Test
    void TestOperatorSubtract() {
        assertDoesNotThrow(() -> Computation.validateOperator("-"));
    }

    @Test
    void TestOperatorMultiply() {
        assertDoesNotThrow(() -> Computation.validateOperator("*"));
    }

    @Test
    void TestOperatorDivide() {
        assertDoesNotThrow(() -> Computation.validateOperator("/"));
    }

}
