package seminar3.task1.hw;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;



class MainhwTest {
    private Mainhw n;
    @BeforeEach
    public void setup(){
        n = new Mainhw();
}

    @ParameterizedTest
    @ValueSource(ints = {4, -2, 0})
    //Проверка четных чисел
    void evenNumber(int number) {
        assertTrue(n.evenOddNumber(number));

    }
    @ParameterizedTest
    @ValueSource(ints = {3, -5, 1})
        //Проверка нечетных чисел
    void oddNumber(int number) {
        assertFalse(n.evenOddNumber(number));

    }

    @ParameterizedTest
    @ValueSource(ints = {26, 99, 51})
    //Проверка чисел внутри интервала
    void numberInIntervalRange(int num) {
        assertTrue(n.numberInInterval(num));
    }
    @ParameterizedTest
    @ValueSource(ints = {25, 1, 0, -1, 100, 999})
    void numberNotInIntervalRange(int num) {
        assertFalse(n.numberInInterval(num));
    }

}