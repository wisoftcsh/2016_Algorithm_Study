package test;

/**
 * Created by csh9196 on 2017-04-21.
 */
public class MaxHeapSort {
    private int[] array;

    MaxHeapSort(int[] array) {
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
        int large;

        if(right <= n ) {
            if(array[right] < array[left]) {
                large = left;
            } else {
                large = right;
            }
        } else if(left <= n) {
            large = left;
        } else return;

        if(array[large] > array[parent]) {
            int tmp = array[parent];
            array[parent] = array[large];
            array[large] = tmp;
            heapify(large, n);
        }
    }

    void heapSort() {
        buildHeap();
        for(int i = array.length -1; i >= 1; i--) {
            int tmp = array[0];
            array[0] = array[i];
            array[i] = tmp;
            heapify(0, i-1);
        }
    }

    void print() {
        for(int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
