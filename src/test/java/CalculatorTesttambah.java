import com.javakeanu.Computation;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTesttambah {

    @Test
    void TC1_inputDuaAngkaPositif_tidakThrowException() {
        assertDoesNotThrow(() -> {
            int input1 = Computation.parseInput("300");
            int input2 = Computation.parseInput("578");
            int hasil = input1 + input2;
            assertEquals(878, hasil);
        });
    }

    @Test
    void TC2_inputDuaAngkaNegatif_tidakThrowException() {
        assertDoesNotThrow(() -> {
            int input1 = Computation.parseInput("-3200");
            int input2 = Computation.parseInput("-340");
            int hasil = input1 + input2;
            assertEquals(-3540, hasil);
        });
    }

    @Test
    void TC3_inputSatuPositifSatuNegatif_tidakThrowException() {
        assertDoesNotThrow(() -> {
            int input1 = Computation.parseInput("24560");
            int input2 = Computation.parseInput("-987");
            int hasil = input1 + input2;
            assertEquals(23573, hasil);
        });
    }
}
