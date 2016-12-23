package multiplication;

/**
 * Created by csh9196 on 2016-12-23.
 */
public class Multiplication {
    Multiplication() {
    }

    public double multiplicationFunction(int number, int count, int remainder) {
        double result = 1;
        if (number > 2147483647 || count > 2147483647 || remainder > 2147483647) {
            return -1;
        }
        for (int i = count; i > 0; i--) {
            result *= number;
        }
        return result % remainder;
    }
}
