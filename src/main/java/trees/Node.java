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

    /**
     * Depth-first search IN ORDER - DFS
     */
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
     * Depth-first search POST ORDER - DFS
     */
    public void printInPostOrder() {
        if (left != null) {
            left.printInPostOrder();
        }
        if (right != null) {
            right.printInPostOrder();
        }
        System.out.println(data);
    }

    /**
     * Depth-first search PRE ORDER - DFS
     */
    public void printInPreOrder() {
        System.out.println(data);
        if (left != null) {
            left.printInOrder();
        }
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

    public int maxDepth(Node node) {

        if (node == null) {
            return 0;
        }

        int lefDepth = maxDepth(node.left);
        int rightDepth = maxDepth(node.right);

        return Math.max(lefDepth, rightDepth) + 1;
    }

}
