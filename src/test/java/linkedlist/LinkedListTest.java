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

    @Test
    public void testReverseLinkedList() {
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
        ListNode cycleNode = linkedList.reverse(n1);
        assertEquals(n5, cycleNode);
    }

    @Test
    public void testGetIntersectionNode() {
        LinkedList linkedList = new LinkedList();

        ListNode a1 = new ListNode(1);
        ListNode a2 = new ListNode(2);

        ListNode b1 = new ListNode(1);
        ListNode b2 = new ListNode(2);
        ListNode b3 = new ListNode(3);

        ListNode c1 = new ListNode(1);
        ListNode c2 = new ListNode(2);
        ListNode c3 = new ListNode(3);

        /*
         A:          a1 → a2
                            ↘
                             c1 → c2 → c3
                            ↗
         B:     b1 → b2 → b3
         */
        a1.next = a2;
        a2.next = c1;
        c1.next = c2;
        c2.next = c3;

        b1.next = b2;
        b2.next = b3;
        b3.next = c1;

        ListNode intersectionNode = linkedList.getIntersectionNode(a1, b1);
        assertEquals(c1, intersectionNode);
    }

    @Test
    public void testRemoveNthFromEnd() {
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

        linkedList.removeNthFromEnd(n1, 3);

        String expectedOrderString = "1245";
        StringBuilder sb = new StringBuilder();
        ListNode p = n1;

        while (p != null) {
            sb.append(p.val);
            p = p.next;
        }

        assertEquals(expectedOrderString, sb.toString());

    }

    @Test
    public void testGetIntersectionNodeTwoPointers() {
        LinkedList linkedList = new LinkedList();

        ListNode a1 = new ListNode(1);
        ListNode a2 = new ListNode(2);

        ListNode b1 = new ListNode(1);
        ListNode b2 = new ListNode(2);
        ListNode b3 = new ListNode(3);

        ListNode c1 = new ListNode(1);
        ListNode c2 = new ListNode(2);
        ListNode c3 = new ListNode(3);

        /*
         A:          a1 → a2
                            ↘
                             c1 → c2 → c3
                            ↗
         B:     b1 → b2 → b3
         */
        a1.next = a2;
        a2.next = c1;
        c1.next = c2;
        c2.next = c3;

        b1.next = b2;
        b2.next = b3;
        b3.next = c1;

        ListNode intersectionNode = linkedList.getIntersectionNodeTwoPointers(a1, b1);
        assertEquals(c1, intersectionNode);
    }
}
