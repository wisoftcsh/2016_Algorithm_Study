package binarysearch;

/**
 * Created by csh9196 on 2017-04-21.
 */
public class BinarySearchEx {
    public static void main(String[] args) {
        BinarySearch binarySearch = new BinarySearch();
        binarySearch.binarySearch();

        BinarySearchTree binarySearchTree = new BinarySearchTree(new Node(3));
        binarySearchTree.insertNode(binarySearchTree.getTree(), new Node(5));
        binarySearchTree.insertNode(binarySearchTree.getTree(), new Node(1));
        binarySearchTree.insertNode(binarySearchTree.getTree(), new Node(4));
        binarySearchTree.insertNode(binarySearchTree.getTree(), new Node(9));
        binarySearchTree.insertNode(binarySearchTree.getTree(), new Node(7));
        binarySearchTree.insertNode(binarySearchTree.getTree(), new Node(2));
        binarySearchTree.insertNode(binarySearchTree.getTree(), new Node(6));
        binarySearchTree.insertNode(binarySearchTree.getTree(), new Node(10));

        binarySearchTree.printTree(binarySearchTree.getTree());
        System.out.println();

        System.out.println(binarySearchTree.searchNode(binarySearchTree.getTree(), 4).getKey());
        System.out.println(binarySearchTree.searchMinNode(binarySearchTree.getTree()).getKey());
        System.out.println(binarySearchTree.deleteNode(binarySearchTree.getTree(), null, 2).getKey());

        binarySearchTree.printTree(binarySearchTree.getTree());

        binarySearchTree.destroyTree(binarySearchTree.getTree());
//        System.out.println(binarySearchTree.searchMinNode(binarySearchTree.getTree()).getKey());
    }
}
