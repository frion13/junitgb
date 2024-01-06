package seminar5.task1;

import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class NumberGeneratorTest {
    NumberGenerator numberGenerator = new NumberGenerator();
    @Test
    void generateRandomNumbers() {
        List<Integer> num = numberGenerator.generateRandomNumbers(10, 1, 10);
        assertEquals(10, num.size());
        Integer minVal = Collections.min(num);
        Integer maxVal = Collections.max(num);
        assertTrue(minVal >= 1 && maxVal <= 10);





    }
}