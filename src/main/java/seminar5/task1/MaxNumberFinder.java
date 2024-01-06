package seminar5.task1;

import java.util.List;

public class MaxNumberFinder {
    public int findMaxNumber(List<Integer> numbers) {
        if (numbers.isEmpty()) {
            throw new IllegalArgumentException("List is empty");
        }

        int maxNumber = numbers.get(0);
        for (int number : numbers) {
            if (number > maxNumber) {
                maxNumber = number;
            }
        }

        return maxNumber;
    }
}
