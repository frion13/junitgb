package test1;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class Task1 {
    @Test
    void testEquality() {
        assertEquals(4, 2 + 2);
    }

    @Test
    void testTrueAndFalse() {
        assertTrue(5 > 3);
        assertFalse(2 == 1);
    }

    @Test
    void testNullAndNotNull() {
        String str = null;
        assertNull(str);

        String notNullStr = "Hello";
        assertNotNull(notNullStr);
    }

    @Test
    void testArrayEquality() {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {1, 2, 3};

        assertArrayEquals(arr1, arr2);
    }


}
