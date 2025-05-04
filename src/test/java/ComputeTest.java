import com.javakeanu.*;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ComputeTest {

    @Test
    public void testComputeAdd() {
        int result = Computation.compute(10, 5, "+");

        assertEquals(15, result);
    }

    @Test
    public void testComputeSubtract() {
        int result = Computation.compute(10, 5, "-");

        assertEquals(5, result);
    }

    @Test
    public void testComputeMultiply() {
        int result = Computation.compute(2, 5, "*");

        assertEquals(10, result);
    }

    @Test
    public void testComputeDivide() {
        int result = Computation.compute(20, 5, "/");

        assertEquals(4, result);
    }

    @Test
    public void testComputeInvalidOperator() {
        Exception exception =
                assertThrows(IllegalStateException.class, () -> {
                    Computation.compute(5, 5, "^");
                });

        assertEquals("Error: Operasi tidak dikenali.", exception.getMessage());
    }

}
