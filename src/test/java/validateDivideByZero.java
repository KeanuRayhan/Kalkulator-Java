import com.javakeanu.Computation;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class validateDivideByZero {

    @Test
    void TC1_operatorBagiDanBAdalahNol_throwException() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            Computation.validateDivideByZero("/", 0);
        });
        assertEquals("Error: Tidak bisa membagi dengan nol.", exception.getMessage());
    }

    @Test
    void TC2_operatorBagiDanBTidakNol_tidakThrowException() {
        assertDoesNotThrow(() -> {
            Computation.validateDivideByZero("/", 7);
        });
    }
}
