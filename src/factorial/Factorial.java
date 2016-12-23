package factorial;

/**
 * Created by csh9196 on 2016-12-23.
 */

public class Factorial {
    Factorial(){}

    public double factorialFunction(int number){
        if(number < 0){
            return -1;
        }
        double result = 1;
        for(int i = number; i > 0; i--){
            result *= i;
        }
        return result;
    }
}
