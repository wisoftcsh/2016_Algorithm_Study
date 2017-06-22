package test;

/**
 * Created by csh9196 on 2017-04-21.
 */
public class BinarySearchTree {
    Node root;

    BinarySearchTree(Node node) {
        root = node;
    }

    void destroyNode(Node tree) {
        if (tree.getRight() != null) {
            destroyNode(tree.getRight());
        }
        if (tree.getLeft() != null) {
            destroyNode(tree.getLeft());
        }
        tree.setLeft(null);
        tree.setRight(null);
        root = null;
    }

    void insertNode(Node tree, Node node) {
        if (tree.getKey() < node.getKey()) {
            if (tree.getRight() == null) {
                tree.setRight(node);
            } else {
                insertNode(tree.getRight(), node);
            }
        } else if (tree.getKey() > node.getKey()) {
            if (tree.getLeft() == null) {
                tree.setLeft(node);
            } else {
                insertNode(tree.getLeft(), node);
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

    Node deleteNode(Node tree, Node parent, int target) {
        if (tree == null) {
            return null;
        }

        Node targetNode;
        if (tree.getKey() < target) {
            targetNode = deleteNode(tree.getRight(), tree, target);
        } else if (tree.getKey() > target) {
            targetNode = deleteNode(tree.getLeft(), tree, target);
        } else {
            targetNode = tree;
            if (targetNode.getRight() == null && targetNode.getLeft() == null) {
                if (parent.getLeft() == targetNode) {
                    parent.setLeft(null);
                } else {
                    parent.setRight(null);
                }
            } else if (targetNode.getRight() != null && targetNode.getLeft() != null) {
                Node minNode = searchMinNode(targetNode.getRight());
                minNode = deleteNode(targetNode, null, minNode.getKey());
                targetNode.setKey(minNode.getKey());
            } else {
                Node tmp;

                if(targetNode.getLeft() != null) {
                    tmp = targetNode.getLeft();
                } else {
                    tmp = targetNode.getRight();
                }

                if (parent.getLeft() == tree) {
                    parent.setLeft(tmp);
                } else {
                    parent.setRight(tmp);
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


    public Node getTree() {
        return root;
    }
}
