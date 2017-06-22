package shingle;

/**
 * Created by csh9196 on 2017-05-30.
 */
public class ShingleEx {
    public static void main(String[] args) {
        int[][] matrix = new int[][] {
                {6,7,12,-5,5,3,11,3},
                {-8,10,14,9,7,13,8,5},
                {11,12,7,4,8,-2,9,4}
        };

        Shingle shingle = new Shingle(matrix, 3,8,8);
        System.out.println("\nMax = " + shingle.pebbleSum());
        shingle.pathTracking();
    }
}
