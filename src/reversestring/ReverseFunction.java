package reversestring;

/**
 * Created by csh9196 on 2016-12-25.
 */
public class ReverseFunction {
    ReverseFunction() {
    }

    public String reverse(String string) {
        String reverseString = "";
        int j = 0;
        char tmp;
        for (int i = string.length() - 1 ; i >= 0; i--) {
            tmp = string.charAt(i);
            reverseString += tmp;
        }
        return reverseString;
    }
}
