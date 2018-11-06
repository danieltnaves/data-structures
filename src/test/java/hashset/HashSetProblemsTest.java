package hashset;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertTrue;


public class HashSetProblemsTest {

    @Test
    public void testContainsDuplicate() {
        HashSetProblems hashSetProblems = new HashSetProblems();
        assertTrue(hashSetProblems.containsDuplicate(new int[]{1,2,3,4,5,5}));
        assertFalse(hashSetProblems.containsDuplicate(new int[]{1,2,3,4,5}));
    }

    @Test
    public void testSingleNumber() {
        HashSetProblems hashSetProblems = new HashSetProblems();
        assertEquals(1, hashSetProblems.singleNumber(new int[]{2,2,2,3,3,3,4,1,4,4}));
    }

    @Test
    public void testIntersection() {
        HashSetProblems hashSetProblems = new HashSetProblems();
        assertArrayEquals(new int[]{1,2,3}, hashSetProblems.intersection(new int[]{4,5,6,1,2,3}, new int[]{0,9,8,1,2,3,10,11}));
    }

}
