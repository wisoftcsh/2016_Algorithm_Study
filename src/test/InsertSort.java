package test;

/**
 * Created by csh9196 on 2017-04-21.
 */
public class InsertSort {
    private int[] array;

    InsertSort(int[] array) {
        this.array = array;
    }

    void insertSort() {
        int loc;
        int newItem;
        for (int i = 1; i < array.length; i++) {
            loc = i - 1;
            newItem = array[i];
            while (loc >= 0 && array[loc] > newItem) {
                array[loc + 1] = array[loc];
                loc --;
            }
            array[loc + 1] = newItem;
        }
    }

    void print() {
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
