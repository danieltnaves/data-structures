package bubblesort;

import org.junit.Test;

import static org.junit.Assert.*;

public class BubbleSortTest {

    @Test
    public void testOrderArray() {
        int[] nums = {5, 4, 3, 2, 10, 1, 50};
        BubbleSort.sort(nums);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 10, 50}, nums);
    }

}
