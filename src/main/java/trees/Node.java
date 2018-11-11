package trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Node {

    Node left, right;

    int data;

    public Node(int data) {
        this.data = data;
    }

    public void insert(int val) {
        if (val <= data) {
            //left
            if (left == null) {
                left = new Node(val);
            } else {
                left.insert(val);
            }
        } else {
            //right
            if (right == null) {
                right = new Node(val);
            } else {
                right.insert(val);
            }
        }
    }

    public void printInOrder() {
        if (left != null) {
            left.printInOrder();
        }
        System.out.println(data);
        if (right != null) {
            right.printInOrder();
        }
    }

    /**
     * Prints the tree using Breadth-first search
     *
     */
    public List<Integer> getBFS() {

        List<Integer> bfs = new ArrayList<>();
        Queue<Node> queue = new LinkedList<>();
        queue.add(this);

        while (!queue.isEmpty()) {

            Node node = queue.poll();
            bfs.add(node.data);

            if (node.left != null) {
                queue.add(node.left);
            }

            if (node.right != null) {
                queue.add(node.right);
            }

        }

        return bfs;
    }

}
