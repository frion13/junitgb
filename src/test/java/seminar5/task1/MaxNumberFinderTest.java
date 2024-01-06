package seminar5.task1;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MaxNumberFinderTest {

    @Test
    void findMaxNumber() {
        MaxNumberFinder maxNumberFinder = new MaxNumberFinder();
        Integer num = maxNumberFinder.findMaxNumber(List.of(1, 4, 5, 6));
        assertNotNull(num);
        assertEquals(6, num);

    }
}