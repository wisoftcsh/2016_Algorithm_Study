package shingle;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by csh9196 on 2017-05-30.
 */
public class Shingle {
    int[][] peb;
    int[][] w;
    int[][] matrix;
    int size;
    int[] patten1 = {1, 2};
    int[] patten2 = {0, 2, 3};
    int[] patten3 = {0, 1};
    int[] patten4 = {1};

    ArrayList<Integer> arrayList;

    Shingle(int[][] matrix, int row, int col, int size) {
        this.matrix = matrix;
        this.w = new int[row + 1][col];
        this.peb = new int[row + 1][col];
        this.size = size;
        setW(col);
    }

    void setW(int col) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < col; j++) {
                w[i][j] = matrix[i][j];
                System.out.print("   " + w[i][j]);
            }
            System.out.println();
        }
        for (int j = 0; j < col; j++) {
            w[3][j] = w[0][j] + w[2][j];
            System.out.print("   " + w[3][j]);
        }
        System.out.println();
    }

    public int pebbleSum() {
        for (int p = 0; p < 4; p++) {
            peb[p][0] = w[p][0];
        }
        for (int i = 1; i < size; i++) {
            for (int p = 0; p < 4; p++) {
                peb[p][i] = w[p][i] + max(i - 1, p);
            }
        }
        System.out.println();
        return max(size - 1, -1);
    }

    public int max(int i, int p) {
        arrayList = new ArrayList<>();
        System.out.println("i = " + i);
        System.out.println("p = " + p);
        if (p == 0) {
            for (int index : patten1) {
                System.out.println("index : " + index);
                arrayList.add(peb[index][i]);
            }
        } else if (p == 1) {
            for (int index : patten2) {
                System.out.println("index : " + index);
                arrayList.add(peb[index][i]);
            }
        } else if (p == 2) {
            for (int index : patten3) {
                System.out.println("index : " + index);
                arrayList.add(peb[index][i]);
            }
        } else if (p == 3) {
            for (int index : patten4) {
                System.out.println("index : " + index);
                arrayList.add(peb[index][i]);
            }
        } else {
            for (int j = 0; j < 4; j++) {
                arrayList.add(peb[j][i]);
            }
        }
        System.out.println(arrayList);
        return Collections.max(arrayList);
    }

    public void pathTracking() {
        ArrayList<Integer> maxList = new ArrayList<>();
        ArrayList<Integer> pathList = new ArrayList<>();
        for(int i = 0; i < 10; i++){
            maxList.add(-99999);
        }
        int i = size-1;
        while(i >= 0){
            if(i == size -1){
                for (int j = 0; j < 4; j++) {
                    maxList.set(j, peb[j][size - 1]);
                }
                i--;
            }
            if (maxList.indexOf(Collections.max(maxList)) == 0) {
                pathList.add(1);
                for(int k = 0; k < 10; k++){
                    maxList.set(k,-99999);
                }
                for (int index : patten1) {
                    maxList.set(index,peb[index][i]);
                }
            } else if (maxList.indexOf(Collections.max(maxList)) == 1) {
                pathList.add(2);
                for(int k = 0; k < 10; k++){
                    maxList.set(k,-99999);
                }
                for (int index : patten2) {
                    maxList.set(index,peb[index][i]);
                }
            } else if (maxList.indexOf(Collections.max(maxList)) == 2) {
                pathList.add(3);
                for(int k = 0; k < 10; k++){
                    maxList.set(k,-99999);
                }
                for (int index : patten3) {
                    maxList.set(index,peb[index][i]);
                }
            } else if (maxList.indexOf(Collections.max(maxList)) == 3) {
                pathList.add(4);
                for(int k = 0; k < 10; k++){
                    maxList.set(k,-99999);
                }
                for (int index : patten4) {
                    maxList.set(index,peb[index][i]);
                }
            }
            i--;
        }
        pathList.add(maxList.indexOf(Collections.max(maxList))+1);

        System.out.print("경로 추적 : ");
        Collections.reverse(pathList);
        System.out.println(pathList);
    }
}