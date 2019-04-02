package dynamicarray;

import org.junit.Assert;
import org.junit.Test;

import java.util.stream.IntStream;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class DynamicArrayTest {

    @Test
    public void testInsertion() {
        DynamicArray<Integer> dynamicArray = new DynamicArray<>();
        dynamicArray.add(0);
        dynamicArray.add(1);
        dynamicArray.add(2);
        assertEquals(3, dynamicArray.size());
    }

    @Test
    public void testDynamicCapacity() {
        DynamicArray<Integer> dynamicArray = new DynamicArray<>();
        IntStream.rangeClosed(0, 10000).forEach( i -> dynamicArray.add(i));
        assertEquals(10001, dynamicArray.size());
    }

    @Test
    public void testAddElementAtPosition() {
        DynamicArray<Integer> dynamicArray = new DynamicArray<>();
        dynamicArray.add(0);
        dynamicArray.add(1);
        dynamicArray.add(2);
        dynamicArray.add(3);
        dynamicArray.add(4);
        dynamicArray.add(10, 2);
        assertEquals(dynamicArray.get(2), (Integer) 10);
    }

    @Test
    public void testDeleteElementAtPosition() {
        DynamicArray<Integer> dynamicArray = new DynamicArray<>();
        dynamicArray.add(0);
        dynamicArray.add(1);
        dynamicArray.add(2);
        dynamicArray.add(3);
        dynamicArray.add(4);
        dynamicArray.delete(0);
        assertEquals(dynamicArray.get(0), (Integer) 1);
    }

    @Test
    public void testIsEmptyArray() {
        DynamicArray<Integer> dynamicArray = new DynamicArray<>();
        dynamicArray.add(0);
        dynamicArray.add(1);
        dynamicArray.add(2);
        dynamicArray.delete(0);
        dynamicArray.delete(0);
        dynamicArray.delete(0);
        assertTrue(dynamicArray.isEmpty());
    }

    @Test
    public void testContainsElement() {
        DynamicArray<Integer> dynamicArray = new DynamicArray<>();
        dynamicArray.add(0);
        dynamicArray.add(1);
        dynamicArray.add(2);
        assertTrue(dynamicArray.contains(2));
    }

}
