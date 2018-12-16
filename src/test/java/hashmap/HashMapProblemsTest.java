package hashmap;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class HashMapProblemsTest {

    @Test
    public void testTwoSum() {
        HashMapProblems hashMapProblems = new HashMapProblems();
        assertArrayEquals(new int[]{0, 1}, hashMapProblems.twoSum(new int[]{2, 7, 11, 15}, 9));
    }

    @Test
    public void testFindRestaurant() {
        HashMapProblems hashMapProblems = new HashMapProblems();
        assertArrayEquals(new String[]{"Shogun"}, hashMapProblems.findRestaurant(new String[]{"Shogun","Tapioca Express","Burger King","KFC"},
                new String[]{"Piatti","The Grill at Torrey Pines","Hungry Hunter Steakhouse","Shogun"}));
    }

    @Test
    public void testFirstUniqChar() {
        HashMapProblems hashMapProblems = new HashMapProblems();
        assertEquals(0, hashMapProblems.firstUniqChar("leetcode"));
        assertEquals(-1, hashMapProblems.firstUniqChar("aadadaad"));
    }

}
