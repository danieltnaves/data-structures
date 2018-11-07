package trees;

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
}
