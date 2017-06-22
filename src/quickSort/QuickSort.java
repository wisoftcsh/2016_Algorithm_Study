package quickSort;

/**
 * Created by csh9196 on 2017-04-05.
 */

class QuickSort {
    private int[] array;

    QuickSort(int[] array) {
        this.array = array;
    }

    void quickSort(int[] array, int p, int r) {
        if (p < r) {
            System.out.println("시작 인덱스 : " + p + " | 마지막 인덱스 : " +r);
            int q = partition(array, p, r);
            System.out.println("Pivot 인덱스 : " + q);
            quickSort(array, p, q - 1);
            quickSort(array, q + 1, r);
        }
    }

    private int partition(int[] array, int p, int r) {
        int pivot = array[r];
        System.out.println("Pivot : " + pivot);
        int i = p - 1;
        for (int j = p; j <= r - 1; j++) {
            System.out.println("2구역 설정 j : " + j);
            if (array[j] <= pivot) {
                System.out.println("1구역 설정 i : " + i);
                int tmp = array[++i];
                array[i] = array[j];
                array[j] = tmp;
            }
        }
        int tmp = array[i+1];
        array[i+1] = array[r];
        array[r] = tmp;
        return i+1;
    }

    void print() {
        for (int n : array) {
            System.out.print(" " + n);
        }
        System.out.println();
    }
}
