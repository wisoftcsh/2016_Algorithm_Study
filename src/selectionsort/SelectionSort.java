package selectionsort;

/**
 * Created by csh9196 on 2017-03-28.
 */

public class SelectionSort {
    private int[] array;

    SelectionSort(int[] array) {
        this.array = array;
    }

    public void selectionSort() {
        for (int i = array.length - 1; i > 0; i--) {
            int k = theLargest(array, i);
            int tmp = array[i];
            array[i] = array[k];
            array[k] = tmp;
            print();
        }
    }

    private int theLargest(int[] array, int last) {
        int largestIndex = 0;
        for (int i = 1; i <= last; i++) {
            if (array[i] > array[largestIndex]) {
                largestIndex = i;
            }
        }
        System.out.println(array[largestIndex]);
        return largestIndex;
    }

    public void print(){
        for(int n : array){
            System.out.print(" " +n);
        }
        System.out.println();
    }
}
