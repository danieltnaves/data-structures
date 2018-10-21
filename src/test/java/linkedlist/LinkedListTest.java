package linkedlist;

import org.junit.Test;
import static org.junit.Assert.*;

public class LinkedListTest {

    @Test
    public void testIfHasNoCycle() {
        LinkedList linkedList = new LinkedList();
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(3);
        ListNode n4 = new ListNode(4);
        ListNode n5 = new ListNode(5);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        assertFalse(linkedList.hasCycle(n1));
    }

    @Test
    public void testIfHasCycle() {
        LinkedList linkedList = new LinkedList();
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(3);
        ListNode n4 = new ListNode(4);
        ListNode n5 = new ListNode(5);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n1;
        assertTrue(linkedList.hasCycle(n1));
    }

    @Test
    public void testFindCycleNodeElement() {
        LinkedList linkedList = new LinkedList();
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(3);
        ListNode n4 = new ListNode(4);
        ListNode n5 = new ListNode(5);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n2; //cycle
        ListNode cycleNode = linkedList.findCycleNode(n1);
        assertEquals(n2, cycleNode);
    }
}
