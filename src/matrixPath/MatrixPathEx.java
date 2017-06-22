package matrixPath;

/**
 * Created by csh9196 on 2017-05-30.
 */
public class MatrixPathEx {
    public static void main(String[] args) {
        int[][] matrix  = new int[][]{
                {6, 7, 12, 5},
                {5, 3, 11, 18},
                {7, 17, 3, 3},
                {8, 10, 14, 9}
        };
        MatrixPath matrixPath = new MatrixPath(matrix, 4);
        int max = matrixPath.matrixPath(4,4);
        matrixPath.printf();
        System.out.println("MAX : " + max);
        matrixPath.pathTracking();
    }
}
