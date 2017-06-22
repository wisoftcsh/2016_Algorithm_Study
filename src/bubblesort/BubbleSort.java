package bubblesort;

/**
 * Created by csh9196 on 2017-03-28.
 */
public class BubbleSort {
    private int[] array;
    boolean sorted = false;

    BubbleSort(int[] array) {
        this.array = array;
    }

    public void bubbleSort() {
        for (int i = array.length - 1; i >= 0; i--) {
            sorted = true;
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    int tmp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = tmp;
                    sorted = false;
                }
            }
            if(sorted) {
                return;
            }
        }
    }

    public void print(){
        for(int n : array){
            System.out.print(" " +n);
        }
        System.out.println();
    }
}
