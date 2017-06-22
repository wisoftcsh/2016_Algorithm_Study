package test;

/**
 * Created by csh9196 on 2017-04-21.
 */
public class CountingSort {
    private int[] array;

    CountingSort(int[] array) {
        this.array = array;
    }

    void countingSort(int k) {
        int[] countingArray = new int[k + 1];
        int[] tmp = new int[array.length + 1];

        for (int i = 0; i < countingArray.length; i++) {
            countingArray[i] = 0;
        }

        for (int anArray : array) {
            countingArray[anArray]++;
        }

        for (int i = 1; i < countingArray.length; i++) {
            countingArray[i] += countingArray[i - 1];
        }

        for (int i = array.length - 1; i >= 0; i--) {
            tmp[countingArray[array[i]]--] = array[i];
        }

        array = tmp;
    }

    void print() {
        for (int i = 1; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
