package multiplication;

import java.util.Scanner;

/**
 * Created by csh9196 on 2016-12-23.
 */
public class MultiplicationEx {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Multiplication multiplication = new Multiplication();
        System.out.println(multiplication.multiplicationFunction(scanner.nextInt(), scanner.nextInt(), scanner.nextInt()));
        scanner.close();
    }
}
