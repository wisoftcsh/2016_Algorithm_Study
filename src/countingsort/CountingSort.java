package countingsort;

/**
 * Created by csh9196 on 2017-04-14.
 */
public class CountingSort {
    private int[] array;
    private int[] tempArray;
    private int k;

    CountingSort(int[] array, int k) {
        this.array = array;
        this.k = k+1;
        this.tempArray = new int[array.length + 1];
    }

    void countingSort() {
        int[] countingArray = new int[k];

        for (int i = 0; i < k; i++) {
            countingArray[i] = 0;
        }
        for (int anArray : array) {
            countingArray[anArray]++;
        }
        for (int i = 1; i < k; i++) {
            countingArray[i] += countingArray[i-1];
        }
        System.out.println();
        for(int i = array.length -1; i >= 0; i--) {
            tempArray[countingArray[array[i]]--] = array[i];
        }
    }

    public void print() {
        System.out.println("array : ");
        for(int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("tempArray : ");
        for(int i = 1 ; i < tempArray.length; i++){
            System.out.print(tempArray[i] + " ");
        }
        System.out.println();
    }
}
