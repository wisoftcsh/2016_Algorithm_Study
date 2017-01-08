package stringcaselength;

/**
 * Created by csh9196 on 2017-01-08.
 */
public class StringCaseLengthEx {
    public static void main(String[] args) {
        String[] words = {"hello", "wonderful", "linq", "beautiful", "world"};
        StringCaseLength stringCaseLength = new StringCaseLength(words);
        stringCaseLength.initArrayList();
        stringCaseLength.setArrayLists();
        stringCaseLength.arrayListSort();
        stringCaseLength.printAll();
    }
}
