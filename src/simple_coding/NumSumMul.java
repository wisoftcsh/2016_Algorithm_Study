package simple_coding;

import java.math.BigInteger;

/**
 * Created by csh9196 on 2017-05-26.
 * 1~100 까지 곱셈, 덧셈 구하기 !
 */
public class NumSumMul {
    public static void main(String[] args) {
        int num = 1;
        int sum = 0;
        BigInteger mul = new BigInteger("1");

        while(num != 101) {
            sum = sum + num;
            mul = mul.multiply(BigInteger.valueOf(num));
            num++;
        }

        System.out.println(sum);
        System.out.println(mul);
    }
}


