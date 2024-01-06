package seminar5.task1;
import java.util.ArrayList;
import java.util.List;

import java.util.Random;

public class NumberGenerator {
    public List<Integer> generateRandomNumbers(int count, int minValue, int maxValue) {
        List<Integer> numbers = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < count; i++) {
            int randomNumber = random.nextInt(maxValue - minValue + 1) + minValue;
            numbers.add(randomNumber);
        }

        return numbers;
    }
}
