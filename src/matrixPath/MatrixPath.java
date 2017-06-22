package matrixPath;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by csh9196 on 2017-05-30.
 */
public class MatrixPath {
    int[][] matrix;
    int[][] c;
    int size;
    ArrayList<String> arrayList = new ArrayList<>();

    MatrixPath(int[][] matrix, int size) {
        this.matrix = matrix;
        this.size = size;
        this.c = new int[size][size];
    }

    public int matrixPath(int i, int j) {
        c[0][0] = matrix[0][0];
        for (i = 1; i < size; i++) {
            c[i][0] = matrix[i][0] + c[i - 1][0];
        }
        for (j = 1; j < size; j++) {
            c[0][j] = matrix[0][j] + c[0][j - 1];
        }
        for (i = 1; i < size; i++) {
            for (j = 1; j < size; j++) {
                c[i][j] = matrix[i][j] + max(c[i - 1][j], c[i][j - 1]);
            }
        }
        return c[size - 1][size - 1];
    }

    public int max(int a, int b) {
        return a > b ? a : b;
    }

    public void printf() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void pathTracking() {
        int i =3 , j = 3;

        arrayList.add("{ "+ i + "," + j + " }");
        while(i >= 0 && j >= 0){
            if(i == 0){
                j--;
            }else if(j == 0) {
                i--;
            }else {
                if(c[i-1][j] > c[i][j-1]){
                    i--;
                }else {

                    j--;
                }
            }
            if(i >= 0 && j >= 0){
                arrayList.add("{ "+ i + "," + j + " }");
            }
        }
        Collections.reverse(arrayList);
        System.out.println(arrayList);
    }
}
