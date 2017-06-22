package test;

/**
 * Created by csh9196 on 2017-04-21.
 */
public class MergeSort {
    private int[] array;

    MergeSort(int[] array) {
        this.array = array;
    }

    void mergeSort(int front, int last) {
        if (front < last) {
            int mid = (front + last) / 2;
            mergeSort(front, mid);
            mergeSort(mid + 1, last);
            merge(front, mid, last);
        }
    }

    void merge(int front, int mid, int last) {
        int i = front, j = mid + 1, t = 0;
        int[] tmp = new int[array.length];

        while (i <= mid && j <= last) {
            if (array[i] <= array[j]) {
                tmp[t++] = array[i++];
            } else {
                tmp[t++] = array[j++];
            }
        }

        while (i <= mid) {
            tmp[t++] = array[i++];
        }
        while (j <= last) {
            tmp[t++] = array[j++];
        }

        t = 0;
        i = front;

        while(i <= last) {
            array[i++] = tmp[t++];
        }
    }

    void print() {
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
