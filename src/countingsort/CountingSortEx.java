package countingsort;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by csh9196 on 2017-04-14.
 */
public class CountingSortEx {
    public static void main(String[] args) {
        int[] array;
        int k;
        Scanner scanner = new Scanner(System.in);
        System.out.println("배열의 크기를 입력해주세요.");
        array = new int[scanner.nextInt()];
        System.out.println("K값을 입력하세요.");
        k = scanner.nextInt();
        Random random = new Random();
        for(int i = 0; i < array.length; i++){
            array[i] = random.nextInt(k+1);
        }
        CountingSort countingSort = new CountingSort(array, k);
        countingSort.countingSort();
        countingSort.print();
    }
}
