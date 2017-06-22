package mergesort;

/**
 * Created by csh9196 on 2017-03-21.
 */
public class MergeSort {
    private int[] array;


    MergeSort(int[] array) {
        this.array = array;
    }

    public void mergeSort(int[] array, int p, int r) {
        if(p < r){
            int q = (p + r) / 2;
            System.out.println("p : "+p +" | q : " + q + " | r : " + r);
            mergeSort(array, p, q);
            mergeSort(array, q + 1, r);
            merge(array, p, q, r);
            System.out.print("array : ");
            for(int i : array) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    public void merge(int[] array, int p, int q, int r) {
        int[] tmp = new int[array.length];
        int i,j,t;
        i = p;
        j = q+1;
        t = 0;

        while(i <= q && j <= r){
            if(array[i] <= array[j]){
                tmp[t++] = array[i++];
            }else{
                tmp[t++] = array[j++];
            }
        }

        while (i <= q) {
            tmp[t++] = array[i++];
        }

        while (j <= r) {
            tmp[t++] = array[j++];
        }

        i = p;
        t = 0;

        while (i <= r) {
            array[i++] = tmp[t++];
        }
    }

    public void print(){
        for(int n : array){
            System.out.print(" " +n);
        }
    }
}
