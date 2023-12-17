package seminar2;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import static org.junit.jupiter.api.Assertions.*;


public class Task1Test {
    @ParameterizedTest
    @ValueSource(ints = {1, 2, 3, 4, 5})
    void testIsEven(int number) {
        assertTrue(number % 2 == 0, "Number " + number + " should be even");
    }
}
