package factorial;

import java.util.Scanner;

/**
 * Created by csh9196 on 2016-12-23.
 */
public class FactorialEx {
    public static void main(String[] args){
        Factorial factorial = new Factorial();
        Scanner scanner = new Scanner(System.in);
        System.out.println("정수를 입력하십시오.");
        System.out.println("결과 : " + factorial.factorialFunction(scanner.nextInt()));
        scanner.close();
    }
}
