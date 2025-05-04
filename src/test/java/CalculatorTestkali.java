import com.javakeanu.*;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTestkali {

    @Test
    void testKaliPositifPositif() {
        assertEquals(6, Calculator.kali(2, 3));  // 2 * 3 = 6
    }

    @Test
    void testKaliNegatifPositif() {
        assertEquals(-6, Calculator.kali(-2, 3));  // -2 * 3 = -6
    }

    @Test
    void testKaliNolPositif() {
        assertEquals(0, Calculator.kali(0, 5));  // 0 * 5 = 0
    }

    @Test
    void testKaliNegatifNegatif() {
        assertEquals(9, Calculator.kali(-3, -3));  // -3 * -3 = 9
    }
}
