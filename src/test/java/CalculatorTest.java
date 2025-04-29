import com.javakeanu.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    @Test
    void testTambah() {
        // Arrange (siapkan input)
        int a = 5;
        int b = 3;

        // Act (panggil method yang mau dites)
        int result = Calculator.tambah(a, b);

        // Assert (cek hasilnya)
        assertEquals(10, result, "5 + 3 seharusnya 8");
    }
}
