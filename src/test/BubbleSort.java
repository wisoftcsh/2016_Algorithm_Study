package test;

/**
 * Created by csh9196 on 2017-04-21.
 */
public class BubbleSort {
    private int[] array;
    private boolean flag;

    BubbleSort(int[] array) {
        this.array = array;
    }

    void bubbleSort() {
        for(int i = array.length -1; i >= 1; i--) {
            flag = true;
            for(int j = 0; j < i; j++) {
                if(array[j] > array[j+1]) {
                    int tmp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = tmp;
                    flag = false;
                }
            }
            if(flag) {
                return;
            }
        }
    }

    void print() {
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
