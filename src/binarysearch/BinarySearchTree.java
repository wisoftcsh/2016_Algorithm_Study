package binarysearch;

/**
 * Created by csh9196 on 2017-04-21.
 */
public class BinarySearchTree {
    Node root;

    BinarySearchTree(Node node) {
        this.root = node;
    }

    void destroyTree(Node tree) {
        if (tree.getRight() != null) {
            destroyTree(tree.getRight());
        }
        if (tree.getLeft() != null) {
            destroyTree(tree.getLeft());
        }
        tree.setRight(null);
        tree.setLeft(null);
        root = null;
    }

    void insertNode(Node tree, Node newNode) {
        if (tree.getKey() < newNode.getKey()) {
            if (tree.getRight() == null) {
                tree.setRight(newNode);
            } else {
                insertNode(tree.getRight(), newNode);
            }
        } else if (tree.getKey() > newNode.getKey()) {
            if (tree.getLeft() == null) {
                tree.setLeft(newNode);
            } else {
                insertNode(tree.getLeft(), newNode);
            }
        }
    }

    Node searchNode(Node tree, int target) {
        if (tree == null) {
            return null;
        }
        if (tree.getKey() < target) {
            return searchNode(tree.getRight(), target);
        } else if (tree.getKey() > target) {
            return searchNode(tree.getLeft(), target);
        } else {
            return tree;
        }
    }

    Node searchMinNode(Node tree) {
        if (tree == null) {
            return null;
        }

        if (tree.getLeft() == null) {
            return tree;
        } else {
            return searchMinNode(tree.getLeft());
        }
    }

    Node deleteNode(Node tree, Node parentNode, int target) {
        if (tree == null) {
            return null;
        }
        Node targetNode;
        if (tree.getKey() > target) {
            targetNode = deleteNode(tree.getLeft(), tree, target);
        } else if (tree.getKey() < target) {
            targetNode = deleteNode(tree.getRight(), tree, target);
        } else {
            targetNode = tree;
            if (tree.getLeft() == null && tree.getRight() == null) {
                if (parentNode.getLeft() == tree) {
                    parentNode.setLeft(null);
                } else {
                    parentNode.setRight(null);
                }
            } else {
                if (tree.getLeft() != null && tree.getRight() != null) {
                    Node minNode = searchMinNode(tree.getRight());
                    minNode = deleteNode(tree, null, minNode.getKey());
                    tree.setKey(minNode.getKey());
                } else {
                    Node temp;
                    if (tree.getLeft() != null) {
                        temp = tree.getLeft();
                    } else {
                        temp = tree.getRight();
                    }

                    if (parentNode.getLeft() == tree) {
                        parentNode.setLeft(temp);
                    } else if(parentNode.getRight() == tree) {
                        parentNode.setRight(temp);
                    }
                }
            }
        }
        return targetNode;
    }

    void printTree(Node node) {
        if(node == null ){
            return;
        }
        printTree(node.getLeft());
        System.out.print(node.getKey()+ " ");
        printTree(node.getRight());
    }

    Node getTree() {
        return root;
    }
}
