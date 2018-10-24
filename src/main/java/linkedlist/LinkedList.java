package linkedlist;

import java.util.HashSet;
import java.util.Set;

public class LinkedList {

    /**
     * Given a linked list, determine if it has a cycle in it.
     *
     * This technique uses the Floyd's algorithm for cycle detection.
     *
     */
    public boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode faster = head;
        while (slow != null && faster != null && faster.next != null) {
            slow = slow.next;
            faster = faster.next.next;
            if (slow == faster) {
                return true;
            }
        }
        return false;
    }

    /**
     * Given a linked list, return the node where the cycle begins. If there is no cycle, return null.
     *
     * This technique uses the Floyd's algorithm for cycle detection.
     */
    public ListNode findCycleNode(ListNode head) {
        ListNode slow = head;
        ListNode faster = head;
        while (slow != null && faster != null && faster.next != null) {
            slow = slow.next;
            faster = faster.next.next;
            if (slow == faster) {
                slow = head;
                while (slow != null && faster != null) {
                    if (slow == faster) {
                        return slow;
                    }
                    slow = slow.next;
                    faster = faster.next;
                }
            }
        }
        return null;
    }

    /*
     * Reverse a singly linked list.
     */
    public ListNode reverse(ListNode head) {
        ListNode previous = null;
        ListNode current = head;
        ListNode next = null;
        //n1 -> n2 -> n3
        //n1 <- n2 <- n3
        while (current != null) {
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        return previous;
    }

    /**
     * The time complexity for this approach is O (n + m) and space complexity is O(n) or O(m). The reason for
     * O(n) or O(m) complexity is related to additional HashSet data structure.
     *
     */
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        Set<ListNode> set = new HashSet<>();
        ListNode current = headA;
        while (current != null) {
            set.add(current);
            current = current.next;
        }
        current = headB;
        while (current != null) {
            if (set.contains(current)) {
                return current;
            }
            current = current.next;
        }
        return null;
    }

    public ListNode getIntersectionNodeTwoPointers(ListNode headA, ListNode headB) {
        Set<ListNode> set = new HashSet<>();
        ListNode current = headA;
        while (current != null) {
            set.add(current);
            current = current.next;
        }
        current = headB;
        while (current != null) {
            if (set.contains(current)) {
                return current;
            }
            current = current.next;
        }
        return null;
    }

}

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
}
