package reversestring;

/**
 * Created by csh9196 on 2016-12-25.
 */
public class ReverseFunction {
    ReverseFunction() {
    }

    public String reverse(String string) {
        String reverseString = ""; // 타입의 문제
        for (int i = string.length() - 1 ; i >= 0; i--) {
            reverseString += string.charAt(i);
        }
        return reverseString;
    }
}
