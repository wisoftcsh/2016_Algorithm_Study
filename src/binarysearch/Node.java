package binarysearch;

/**
 * Created by csh9196 on 2017-04-21.
 */
public class Node {
    private int key;
    private Node left;
    private Node right;

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

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

    Node(int key) {
        this.key = key;
        this.left = null;
        this.right = null;
    }

    Node () {
        this.left = null;
        this.right = null;
    }
}
