package lv;

import rvt.Sorted;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Arrays;



public class SortedTest {

    @Test
    public void testSmallest() {
        int[] values = {6, 5, 8, 7, 11};
        int result = Sorted.smallest(values);
        assertEquals(5, result);
    }

    @Test
    public void testindexOfSmallest() {
        int[] values = {6, 5, 8, 7, 11};
        int result = Sorted.indexOfSmallest(values);
        assertEquals(1, result);
    }

    @Test
    public void testindexOfSmallestFrom() {
        int[] values = {6, 5, 8, 7, 11};
        int result = Sorted.indexOfSmallestFrom(values, 2);
        assertEquals(3, result);
    }
}
