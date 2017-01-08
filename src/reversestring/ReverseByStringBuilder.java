package reversestring;

/**
 * Created by csh9196 on 2017-01-08.
 */
public class ReverseByStringBuilder {
    ReverseByStringBuilder(){}

    public StringBuilder reverse(StringBuilder string) {
        StringBuilder reverseString = new StringBuilder("");
        for (int i = string.length() - 1 ; i >= 0; i--) {
            reverseString.append(string.charAt(i));
        }
        return reverseString;
    }
}
