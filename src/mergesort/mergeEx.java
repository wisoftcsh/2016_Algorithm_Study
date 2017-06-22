package mergesort;

/**
 * Created by csh9196 on 2017-03-21.
 */
public class mergeEx {
    public static void main(String[] args) {
        int[] array = {12, 70, 30, 20, 55, 25, 40, 50};
        MergeSort mergeSort = new MergeSort(array);
        mergeSort.mergeSort(array, 0, array.length -1);
        mergeSort.print();
    }
}
