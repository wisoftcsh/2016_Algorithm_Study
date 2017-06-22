package insertsort;

/**
 * Created by csh9196 on 2017-03-28.
 */
public class InsertSortEx {
    public static void main(String[] args) {
        int[] array = {12, 70, 30, 20, 55, 25, 40, 50};
        InsertSort insertSort = new InsertSort(array);
        insertSort.insertSort();
        insertSort.print();
    }
}
