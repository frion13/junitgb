package seminar2.task1.task3;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    private Calculator calculator;


    @BeforeEach
    void setup(){
        calculator = new Calculator();
    }
    @AfterEach
    void clean(){
        calculator = null;
    }

    @Test
    void add() {
        int result = calculator.add(3, 5);
        assertEquals(8, result, "3+5=8");
    }

    @Test
    void subtract() {
        int result = calculator.subtract(8, 3);
        assertEquals(5, result, "8-3=5");
    }

    @Test
    void multiply() {
        int result = calculator.multiply(3, 5);
        assertEquals(15, result, "15");
    }

    @Test
    void divide() {
        int result = calculator.divide(15, 3);
        assertEquals(5, result, "5");
    }

    @Test
    void divideZero(){
        assertThrows(ArithmeticException.class, () -> calculator.divide(10, 0), "Division by zero should throw ArithmeticException");
    }
}