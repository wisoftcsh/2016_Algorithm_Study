package fibonacci;

import java.util.Scanner;

/**
 * Created by csh9196 on 2016-12-23.
 */
public class FibonacciEx {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Fibonacci fibonacci = new Fibonacci();

        System.out.println("피보나치 수열 횟수 설정");
        fibonacci.fibonacciFunction(scanner.nextInt());

        System.out.println("몇 번째 수열을 검색하시겠습니까?");
        System.out.println(fibonacci.findFibonacci(scanner.nextInt()));

        scanner.close();
    }
}
