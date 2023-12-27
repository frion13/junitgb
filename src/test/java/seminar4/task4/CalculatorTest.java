package seminar4.task4;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    @Test
    void testAddWithDummyMathOperations() {
// Создаем фиктивный объект DummyMathOperations
        MathOperations dummyMathOperations = new DummyMathOperations();

// Создаем калькулятор, передавая фиктивный объект вместо реального MathOperations
        Calculator calculator = new Calculator(dummyMathOperations);

// Вызываем метод add и проверяем результат
        int result = calculator.add(5, 3);

// Поскольку DummyMathOperations всегда возвращает 0, ожидаемый результат - 0
        assertEquals(0, result);
    }
}