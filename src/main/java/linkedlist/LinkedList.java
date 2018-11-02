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

        int headASize = getLinkedListSize(headA);
        int headBSize = getLinkedListSize(headB);
        int difference = Math.abs(headASize - headBSize);

        ListNode bigger;
        ListNode smaller;

        if (headASize > headBSize) {
            bigger = headA;
            smaller = headB;
        } else {
            bigger = headB;
            smaller = headA;
        }

        int i = 0;

        //to start at same point
        while (i < difference) {
            bigger = bigger.next;
            i++;
        }

        while (bigger != null && smaller != null) {
            if (bigger == smaller) return bigger;
            bigger = bigger.next;
            smaller = smaller.next;
        }

        return null;
    }

    public int getLinkedListSize(ListNode listNode) {
        if (listNode == null) return 0;
        int counter = 0;
        ListNode current = listNode;
        while (current != null) {
            counter++;
            current = current.next;
        }
        return counter;
    }

    /**
     * Given a linked list, remove the n-th node from the end of list and return its head.
     */
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode slower = head;
        ListNode faster = head;
        for (int i = 0; i < n; i++) {
            faster = faster.next;
        }
        if (faster == null) {
            head = head.next;
            return head;
        }
        while (faster.next != null) {
            slower = slower.next;
            faster = faster.next;
        }
        slower.next = slower.next.next;
        return head;
    }

    /**
     * Remove all elements from a linked list of integers that have value val.
     */
    public ListNode removeElements(ListNode head, int val) {
        if (head == null) return null;
        ListNode prev = null;
        ListNode cur = head;
        while (cur != null) {
            if (prev == null && cur.val == val) {
                head = head.next;
                cur = head;
                continue;
            } else if (cur.val == val) {
                prev.next = cur.next;
                cur = prev.next;
                continue;
            }
            prev = cur;
            cur = cur.next;
        }
        return head;
    }

    /**
     * Given a singly linked list, group all odd nodes together followed by the even nodes.
     * Please note here we are talking about the node number and not the value in the nodes.
     * You should try to do it in place. The program should run in O(1) space complexity
     * and O(nodes) time complexity.
     */
    public ListNode oddEvenList(ListNode head) {
        if (head == null) return null;
        ListNode odd = head;
        ListNode even = head.next;
        ListNode evenHead = even;
        while (even != null && even.next != null) {
            odd.next = even.next;
            odd = odd.next;
            even.next = odd.next;
            even = even.next;
        }
        odd.next = evenHead;
        return head;
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
