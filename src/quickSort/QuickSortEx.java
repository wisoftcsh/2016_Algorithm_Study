package quickSort;

/**
 * Created by csh9196 on 2017-03-28.
 */
public class QuickSortEx {
    public static void main(String[] args) {
        int[] array = {12, 70, 30, 20, 55, 25, 40, 50};
        QuickSort quickSort = new QuickSort(array);
        quickSort.quickSort(array, 0, array.length-1);
        quickSort.print();
    }
}
