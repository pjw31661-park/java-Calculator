import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @org.junit.jupiter.api.Test
    void add() {
        Calculator calc = new Calculator();
        calc.setNumbers(10, 20);
        assertEquals(30, calc.add());
    }

    @org.junit.jupiter.api.Test
    void subtract() {
    }

    @org.junit.jupiter.api.Test
    void multiply() {
    }

    @org.junit.jupiter.api.Test
    void divide() {
    }
}