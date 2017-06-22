package heapsort;

/**
 * Created by csh9196 on 2017-04-16.
 */
public class MaxHeapSort {
    private int[] array;

    MaxHeapSort(int[] array) {
        this.array = array;
    }

    private void buildHeap() {
        for(int i = (array.length-1)/2 ; i >=0 ; i--) {
            heapify(i, array.length-1);
        }
    }

    private void heapify(int k, int n) {
        int left = (2*k+1);
        int right = (2*k+2);
        int large;

        if(right <= n) {
            if(array[left] < array[right]) {
                large = right;
            }else {
                large = left;
            }
        } else if (left <= n) {
            large = n;
        } else return;

        if(array[large] > array[k]) {
            int tmp = array[k];
            array[k] = array[large];
            array[large] = tmp;
            heapify(large, n);
        }
    }

    void heapSort() {
        buildHeap();
        for(int i = array.length-1; i >=0; i--) {
            int tmp = array[0];
            array[0] = array[i];
            array[i] = tmp;
            heapify(0, i-1);
        }
    }

    public void print() {
        System.out.println("array : ");
        for (int n : array) {
            System.out.print(" " + n);
        }
        System.out.println();
    }
    public void ascendingPrintf() {
        System.out.println("내림차순 array : ");
        for (int i = array.length -1 ; i >= 0; i--) {
            System.out.print(" " + array[i]);
        }
        System.out.println();
    }

    public void descendingPrintf() {
        System.out.println("오름차순 array : ");
        for (int n : array) {
            System.out.print(" " + n);
        }
        System.out.println();
    }
}
