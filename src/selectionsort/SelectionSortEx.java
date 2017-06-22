package selectionsort;

/**
 * Created by csh9196 on 2017-03-28.
 */
public class SelectionSortEx {
    public static void main(String[] args) {
        int[] array = {1,0,12, 70, 30, 20, 55, 25, 40, 50};
        SelectionSort selectionSort = new SelectionSort(array);
        selectionSort.selectionSort();
        selectionSort.print();
    }
}
