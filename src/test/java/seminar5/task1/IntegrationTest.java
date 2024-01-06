package seminar5.task1;

import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class IntegrationTest {


    @Test
    void integrationTest(){
        MaxNumberFinder maxNumberFinder = new MaxNumberFinder();
        NumberGenerator numberGenerator = new NumberGenerator();
        List<Integer> num = numberGenerator.generateRandomNumbers(5, 1, 5);
        Integer maxNum = maxNumberFinder.findMaxNumber(num);
        Integer maxNuminList = Collections.max(num);
        assertEquals(maxNuminList, maxNum);
        System.out.println(num);
        System.out.println(maxNum);

    }

}
