package trees;

import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class BinaryTreeTest {

    @Test
    @Ignore
    public void testNodesInsertion() {
        Node root = new Node(10);
        root.insert(5);
        root.insert(15);
        root.insert(8);
        root.printInOrder();
    }

    @Test
    public void bfsTest() {

        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        Node n5 = new Node(5);
        Node n6 = new Node(6);
        Node n7 = new Node(7);

        n1.left = n2;
        n1.right = n3;

        n2.left = n4;
        n2.right = n5;

        n3.left = n6;
        n3.right = n7;

        assertArrayEquals(new Integer[]{1, 2, 3, 4, 5, 6, 7}, n1.getBFS().toArray());
    }
}
