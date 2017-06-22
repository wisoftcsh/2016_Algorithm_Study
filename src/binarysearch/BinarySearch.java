package binarysearch;

/**
 * Created by csh9196 on 2017-04-21.
 */
public class BinarySearch {
    int[] array =  {4,6,1,2,3,6,8,2,7};

    void binarySearch() {
        int left,right,mid;
        int target = 8;
        left = 0;
        right = array.length-1;

        while(left <= right) {
            mid = (left+right) /2;
            if(target == array[mid]){
                System.out.println("target index = " + mid);
                return;
            }else if(target > array[mid]) {
                left = mid +1;
            }else {
                right = mid -1;
            }
        }
    }
}
