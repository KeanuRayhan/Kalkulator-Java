import com.javakeanu.Computation;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ParseInput {

    @Test
    void TC1_inputNull_throwException() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            Computation.parseInput(null);
        });
        assertEquals("Error: Input tidak boleh null.", exception.getMessage());
    }

    @Test
    void TC2_inputKosong_throwException() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            Computation.parseInput("   ");
        });
        assertEquals("Error: Input tidak boleh kosong.", exception.getMessage());
    }

    @Test
    void TC3_inputValidAngkaPositif_returnParsedInt() {
        int result = Computation.parseInput(" 320 ");
        assertEquals(320, result);
    }

    @Test
    void TC4_inputValidAngkaNegatif_returnParsedInt() {
        int result = Computation.parseInput(" -60 ");
        assertEquals(-60, result);
    }

    @Test
    void TC5_inputStringBukanAngka_throwException() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            Computation.parseInput("dua belas");
        });
        assertEquals("Error: Input harus berupa angka.", exception.getMessage());
    }

    @Test
    void TC6_inputKarakterSpesial_throwException() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            Computation.parseInput("*");
        });
        assertEquals("Error: Input harus berupa angka.", exception.getMessage());
    }
}
