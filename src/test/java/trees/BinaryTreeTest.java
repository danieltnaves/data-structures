package trees;

import org.junit.Ignore;
import org.junit.Test;

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

}
