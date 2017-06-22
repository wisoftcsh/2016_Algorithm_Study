package test;

/**
 * Created by csh9196 on 2017-04-21.
 */
public class Node {
    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    private Node left;
    private Node right;
    private int key;

    Node(int key) {
        this.key = key;
        left = null;
        right = null;
    }

}
