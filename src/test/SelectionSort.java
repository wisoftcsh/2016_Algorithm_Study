package test;

/**
 * Created by csh9196 on 2017-04-21.
 */
public class SelectionSort {
    private int[] array;

    SelectionSort(int[] array) {
        this.array = array;
    }

    void selectionSort() {
        for (int i = array.length - 1; i > 0; i--) {
            int max = theLargest(i);
            int tmp = array[max];
            array[max] = array[i];
            array[i] = tmp;
        }
    }

    int theLargest(int last) {
        int maxIndex = 0;
        for (int i = 1; i <= last; i++) {
            if(array[maxIndex] < array[i]) {
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    void print() {
        for(int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
