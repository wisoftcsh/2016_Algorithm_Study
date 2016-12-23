package fibonacci;

import java.util.ArrayList;

/**
 * Created by csh9196 on 2016-12-23.
 */
public class Fibonacci {
    ArrayList<Integer> arrayList = new ArrayList<>();

    Fibonacci() {
    }

    public void fibonacciFunction(int number) {
        int first = 0;
        arrayList.add(1);
        arrayList.add(1);

        while(arrayList.size() != number) {
            arrayList.add(arrayList.get(first) + arrayList.get(first + 1));
            first++;
        }
        System.out.println(arrayList);
    }

    public int findFibonacci(int index) {
        int tmp = index -1;
        return arrayList.get(tmp);
    }
}
