package IntList;

import static org.junit.Assert.*;
import org.junit.Test;

public class SquarePrimesTest {

    /**
     * Here is a test for isPrime method. Try running it.
     * It passes, but the starter code implementation of isPrime
     * is broken. Write your own JUnit Test to try to uncover the bug!
     */
    @Test
    public void testSquarePrimesSimple() {
        IntList lst = IntList.of(14, 15, 17, 16, 18);
        boolean changed = IntListExercises.squarePrimes(lst);
        assertEquals("14 -> 15 -> 289 -> 16 -> 18", lst.toString());
        assertTrue(changed);
    }

    @Test
    public void testSquarePrimesSimple1() {
        IntList lst = IntList.of(10, 12, 14, 16, 18);
        boolean changed = IntListExercises.squarePrimes(lst);
        assertEquals("10 -> 12 -> 14 -> 16 -> 18", lst.toString());
        assertFalse(changed);
    }

    @Test
    public void testSquarePrimesSimple2() {
        IntList lst = IntList.of(2, 3, 5, 7, 11);
        boolean changed = IntListExercises.squarePrimes(lst);
        assertEquals("4 -> 9 -> 25 -> 49 -> 121", lst.toString());
        assertTrue(changed);
    }

    @Test
    public void testSquarePrimesSimple3() {
        IntList lst = null;
        boolean changed = IntListExercises.squarePrimes(lst);
        assertFalse(changed);
    }
}
