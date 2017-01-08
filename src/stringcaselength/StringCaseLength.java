package stringcaselength;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by csh9196 on 2017-01-08.
 */
public class StringCaseLength {
    String[] strings;
    int maxsize = 0;
    ArrayList<ArrayList> arrayLists = new ArrayList<>();

    StringCaseLength(String[] strings) {
        this.strings = strings;
    }

    public void setMaxsize() {
        for (int i = 0; i < strings.length; i++) {
            if (strings[i].length() > maxsize) {
                maxsize = strings[i].length();
            }
        }
    }

    public void initArrayList() {
        setMaxsize();
        for (int i = 0; i < maxsize + 1; i++) {
            arrayLists.add(null);
        }
    }

    public void arrayListSort() {
        for (int i = 0; i < maxsize + 1; i++) {
            if(arrayLists.get(i) != null){
                Collections.sort(arrayLists.get(i));
            }
        }
    }

    public void setArrayLists() {
        for (int i = 0; i < strings.length; i++) {
            if (arrayLists.get(strings[i].length()) == null) {
                arrayLists.set(strings[i].length(), new ArrayList<String>());
            }
            arrayLists.get(strings[i].length()).add(strings[i]);
        }
    }

    public void printAll() {
        for (int i = arrayLists.size() - 1; i > 0; i--) {
            if (arrayLists.get(i) != null) {
                System.out.println("Worlds of length " + i);
                for (int j = 0; j < arrayLists.get(i).size(); j++) {
                    System.out.println(arrayLists.get(i).get(j));
                }
            }
        }
    }
}
