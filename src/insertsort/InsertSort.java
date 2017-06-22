package insertsort;

/**
 * Created by csh9196 on 2017-04-05.
 */

class InsertSort {
    private int[] array;

    InsertSort(int[] array) {
        this.array = array;
    }

    void insertSort() {
        for (int i = 1; i < array.length; i++) {
            int loc = i - 1;
            int newItem = array[i];
            while (loc >= 0 && newItem < array[loc]) {
                array[loc + 1] = array[loc];
                loc--;
            }
            array[loc + 1] = newItem;
        }
    }

    void print() {
        for (int n : array) {
            System.out.print(" " + n);
        }
        System.out.println();
    }
}
