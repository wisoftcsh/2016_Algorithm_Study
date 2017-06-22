package test;

/**
 * Created by csh9196 on 2017-04-21.
 */
public class QuickSort {
    private int[] array;

    QuickSort(int[] array) {
        this.array = array;
    }

    void quickSort(int front, int last) {
        if(front < last) {
            int q = partition(front, last);
            quickSort(front, q-1);
            quickSort(q+1, last);
        }
    }

    int partition(int front, int last) {
        int pivot = array[last];
        int i = front -1;
        for(int j = front; j < last; j++) {
            if(array[j] <= pivot) {
                int tmp = array[++i];
                array[i] = array[j];
                array[j] = tmp;
            }
        }
        int tmp = array[i+1];
        array[i+1] = pivot;
        array[last] = tmp;

        return i+1;
    }

    void print() {
        for(int i : array) {
            System.out.print(i+ " ");
        }
    }
}
