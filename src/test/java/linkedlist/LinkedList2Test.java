package linkedlist;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LinkedList2Test {

    @Test
    public void addFrontTest() {
        LinkedList2 linkedList2 = new LinkedList2();
        linkedList2.addFront(1);
        linkedList2.addFront(2);
        linkedList2.addFront(3);
        assertEquals(linkedList2.getHead(), 3);
    }

    @Test
    public void getFirstTest() {
        LinkedList2 linkedList2 = new LinkedList2();
        linkedList2.addFront(1);
        linkedList2.addFront(2);
        linkedList2.addFront(3);
        assertEquals(linkedList2.getFirst(), 3);
    }

    @Test
    public void getLastTest() {
        LinkedList2 linkedList2 = new LinkedList2();
        linkedList2.addFront(1);
        linkedList2.addFront(2);
        linkedList2.addFront(3);
        assertEquals(linkedList2.getLast(), 1);
    }

    @Test
    public void addBack() {
        LinkedList2 linkedList2 = new LinkedList2();
        linkedList2.addFront(1);
        linkedList2.addFront(2);
        linkedList2.addFront(3);
        linkedList2.addBack(4);
        assertEquals(linkedList2.getLast(), 4);
    }

    @Test
    public void getSizeTest() {
        LinkedList2 linkedList2 = new LinkedList2();
        linkedList2.addFront(1);
        linkedList2.addFront(2);
        linkedList2.addFront(3);
        linkedList2.addBack(4);
        assertEquals(linkedList2.size(), 4);
    }

    @Test
    public void clearTest() {
        LinkedList2 linkedList2 = new LinkedList2();
        linkedList2.addFront(1);
        linkedList2.addFront(2);
        linkedList2.addFront(3);
        linkedList2.clear();
        assertEquals(linkedList2.size(), 0);
    }

    @Test
    public void deleteValue() {
        LinkedList2 linkedList2 = new LinkedList2();
        linkedList2.addBack(1);
        linkedList2.addBack(2);
        linkedList2.addBack(3);
        linkedList2.deleteValue(2);
        assertEquals(linkedList2.getLast(), 3);
        assertEquals(linkedList2.getFirst(), 1);
    }

}
