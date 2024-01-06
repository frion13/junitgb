package seminar6.hw;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ListComparerTest {

    @Test
    public void  FirstListHasGreaterAverage() {
        ListComparer comparer = new ListComparer(Arrays.asList(4, 5, 5), Arrays.asList(1, 2, 3));
        assertEquals("Первый список имеет большее среднее значение", comparer.compareLists());
    }

    @Test
    public void SecondListHasGreaterAverage() {
        ListComparer comparer = new ListComparer(Arrays.asList(1, 2, 3), Arrays.asList(4, 5, 6));
        assertEquals("Второй список имеет большее среднее значение", comparer.compareLists());
    }

    @Test
    public void AveragesAreEqual() {
        ListComparer comparer = new ListComparer(Arrays.asList(1, 2, 3), Arrays.asList(3, 2, 1));
        assertEquals("Средние значения равны", comparer.compareLists());
    }

    @Test
    public void FirstListIsEmpty() {
        ListComparer comparer = new ListComparer(Collections.emptyList(), Arrays.asList(4, 5, 6));
        assertEquals("Второй список имеет большее среднее значение", comparer.compareLists());
    }

    @Test
    public void BothListsAreEmpty() {
        ListComparer comparer = new ListComparer(Collections.emptyList(), Collections.emptyList());
        assertEquals("Средние значения равны", comparer.compareLists());
    }
}