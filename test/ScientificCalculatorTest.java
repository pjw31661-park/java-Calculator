import static org.junit.jupiter.api.Assertions.*;

class ScientificCalculatorTest {

    @org.junit.jupiter.api.Test
    void mod() {
        ScientificCalculator calc = new ScientificCalculator();
        calc.setNumbers(12,5);
        assertEquals(2,calc.mod());
    }
}