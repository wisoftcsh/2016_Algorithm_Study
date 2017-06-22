package test;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by csh9196 on 2017-04-21.
 */
public class TestEx {
    public static void main(String[] args) {
        int[] array;
        Scanner scanner = new Scanner(System.in);
        System.out.println("배열의 크기를 입력해주세요.");
        array = new int[scanner.nextInt()];
        System.out.println("최대값을 입력하세요.");
        int k = scanner.nextInt();
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(k + 1);
        }

        System.out.print("정렬 전 : ");
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();

//        SelectionSort selectionSort = new SelectionSort(array);
//        selectionSort.selectionSort();
//        selectionSort.print();

//        QuickSort quickSort = new QuickSort(array);
//        quickSort.quickSort(0, array.length - 1);
//        quickSort.print();

//        MergeSort mergeSort = new MergeSort(array);
//        mergeSort.mergeSort(0, array.length -1);
//        mergeSort.print();

//        InsertSort insertSort = new InsertSort(array);
//        insertSort.insertSort();
//        insertSort.print();

//        HeapSort heapSort = new HeapSort(array);
//        heapSort.heapSort();
//        heapSort.print();

//        MaxHeapSort maxHeapSort = new MaxHeapSort(array);
//        maxHeapSort.heapSort();
//        maxHeapSort.print();

//        CountingSort countingSort = new CountingSort(array);
//        countingSort.countingSort(k);
//        countingSort.print();

//        BubbleSort bubbleSort = new BubbleSort(array);
//        bubbleSort.bubbleSort();
//        bubbleSort.print();
        BinarySearchTree binarySearchTree = new BinarySearchTree(new Node(30));
        binarySearchTree.insertNode(binarySearchTree.getTree(), new Node(40));
        binarySearchTree.insertNode(binarySearchTree.getTree(), new Node(10));
        binarySearchTree.insertNode(binarySearchTree.getTree(), new Node(20));
        binarySearchTree.insertNode(binarySearchTree.getTree(), new Node(50));
        binarySearchTree.insertNode(binarySearchTree.getTree(), new Node(49));
        binarySearchTree.insertNode(binarySearchTree.getTree(), new Node(80));
        binarySearchTree.insertNode(binarySearchTree.getTree(), new Node(70));
        binarySearchTree.insertNode(binarySearchTree.getTree(), new Node(60));

        binarySearchTree.printTree(binarySearchTree.getTree());
        System.out.println();

        System.out.println(binarySearchTree.searchNode(binarySearchTree.getTree(), 40).getKey());
        System.out.println(binarySearchTree.searchMinNode(binarySearchTree.getTree()).getKey());
        System.out.println(binarySearchTree.deleteNode(binarySearchTree.getTree(), null, 50).getKey());

        binarySearchTree.printTree(binarySearchTree.getTree());

        binarySearchTree.destroyNode(binarySearchTree.getTree());
    }
}
