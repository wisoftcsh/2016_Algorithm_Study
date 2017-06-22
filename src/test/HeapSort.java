package test;

/**
 * Created by csh9196 on 2017-04-21.
 */
public class HeapSort {
    private int[] array;

    HeapSort(int[] array) {
        this.array = array;
    }

    void buildHeap() {
        for (int i = (array.length - 1) / 2; i >= 0; i--) {
            heapify(i, array.length - 1);
        }
    }

    void heapify(int parent, int n) {
        int left = (parent * 2) + 1;
        int right = (parent * 2) + 2;
        int smaller;

        if (right <= n) {
            if (array[right] < array[left]) {
                smaller = right;
            } else {
                smaller = left;
            }
        } else if (left <= n) {
            smaller = left;
        } else return;

        if(array[smaller] < array[parent]) {
            int tmp = array[parent];
            array[parent] = array[smaller];
            array[smaller] = tmp;
            heapify(smaller, n);
        }
    }

    void heapSort() {
        buildHeap();
        for(int i = array.length -1; i >=1; i--) {
            int tmp = array[0];
            array[0] = array[i];
            array[i] = tmp;
            heapify(0, i-1);
        }
    }

    void print() {
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
