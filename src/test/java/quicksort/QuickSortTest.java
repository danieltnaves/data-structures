package quicksort;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.core.Is.is;


public class QuickSortTest {

    @Test
    public void testOrderArray() {
        List<Integer> nums = new ArrayList<>(Arrays.asList(5, 4, 3, 2, 10, 1, 50));
        Assert.assertThat(Arrays.asList(1, 2, 3, 4, 5, 10, 50), is(QuickSort.sort(nums)));
    }

}
