package ee.bcs.java.demo.tasks.lesson1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Lesson1Test {

    @Test
    void min() {
        assertEquals(2, Lesson1.min(2, 3));
        assertEquals(-3, Lesson1.min(2, -3));
    }

    @Test
    void max() {
        assertEquals(3, Lesson1.max(2, 3));
        assertEquals(2, Lesson1.max(2, -3));
    }

    @Test
    void abs() {
        assertEquals(2, Lesson1.abs(2));
        assertEquals(2, Lesson1.abs(-2));
    }

    @Test
    void isEven() {
        assertTrue( Lesson1.isEven(-4));
        assertFalse(Lesson1.isEven(3));
    }

    @Test
    void testMin() {
        assertEquals(2, Lesson1.min3(2,3,4));
        assertEquals(2, Lesson1.min3(2,2,4));
        assertEquals(2, Lesson1.min3(2,4,4));
    }

    @Test
    void testMax() {
        assertEquals(4, Lesson1.max3(2,3,4));
        assertEquals(4, Lesson1.max3(3,3,4));
        assertEquals(4, Lesson1.max3(2,4,4));
    }
}
