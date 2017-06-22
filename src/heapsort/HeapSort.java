package heapsort;

/**
 * Created by csh9196 on 2017-04-16.
 */
public class HeapSort {
    private int[] array;

    HeapSort(int[] array) {
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
        int smaller;

        if(right <= n) {
            if(array[left] < array[right]) {
                smaller = left;
            }else {
                smaller = right;
            }
        } else if (left <= n) {
            smaller = left;
        } else return;

        if(array[smaller] < array[k]) {
            int tmp = array[k];
            array[k] = array[smaller];
            array[smaller] = tmp;
            heapify(smaller, n);
        }
    }

    void heapSort() {
        buildHeap();
        for(int i = array.length-1; i >=1; i--) {
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
        System.out.println("오름차순 array : ");
        for (int i = array.length -1 ; i >= 0; i--) {
            System.out.print(" " + array[i]);
        }
        System.out.println();
    }

    public void descendingPrintf() {
        System.out.println("내림차순 array : ");
        for (int n : array) {
            System.out.print(" " + n);
        }
        System.out.println();
    }
}
