package seminar2;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.*;


public class Task2Test {
    @ParameterizedTest
    @CsvSource({"5, 3, 8", "10, 4, 6", "6, 7, 42"})
    void testAddition(int a, int b, int expectedResult) {
        assertEquals(expectedResult, a + b, "Incorrect result for " + a + " + " + b);
    }
}
