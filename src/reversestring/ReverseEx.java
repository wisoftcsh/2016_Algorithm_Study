package reversestring;

/**
 * Created by csh9196 on 2016-12-25.
 */
public class ReverseEx {
    public static void main(String[] args) {
        ReverseByStringBuilder reverseByStringBuilder = new ReverseByStringBuilder();
        System.out.println(reverseByStringBuilder.reverse(new StringBuilder("This is the test.")));
    }
}
