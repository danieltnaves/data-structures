package binarysearch;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class BinarySearchProblemsTest {

    @Test
    public void testBasicSearch() {
        assertEquals(4, BinarySearchProblems.search(new int[]{-1,0,3,5,9,12}, 9));
        assertEquals(-1, BinarySearchProblems.search(new int[]{-1,0,3,5,9,12}, 2));
    }

}
