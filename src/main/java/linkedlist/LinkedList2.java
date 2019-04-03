package linkedlist;

public class LinkedList2 {

    private Node head;

    public Object getHead() {
        return head.data;
    }

    public void addFront(Object element) {
        if (head == null) {
            head = new Node(element);
            return;
        }
        Node node = new Node(element);
        node.next = head;
        head = node;
    }

    public Object getFirst() {
        return head.data;
    }

    public Object getLast() {
        if (head == null) {
            throw new IndexOutOfBoundsException();
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        return current.data;
    }

    public void addBack(Object element) {
        Node newNode = new Node(element);
        if (head == null) {
            head = newNode;
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    public int size() {
        if (head == null) {
            return 0;
        }
        Node current = head;
        int counter = 1;
        while (current.next != null) {
            counter++;
            current = current.next;
        }
        return counter;
    }

    public void clear() {
        head = null;
    }

    public void deleteValue(Object value) {
        if (head == null) {
            throw new IndexOutOfBoundsException();
        }
        Node prev = null;
        Node current = head;
        while (current.next != null) {
            if (current.data == value && prev == null) {
                head = current.next;
                return;
            }
            if (current.data == value) {
                prev.next = current.next;
                return;
            }
            prev = current;
            current = current.next;
        }
    }
}

class Node {

    Object data;
    Node next;

    public Node(Object data) {
        this.data = data;
    }

}
