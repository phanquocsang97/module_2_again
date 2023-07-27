package algorithm.bai6;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String str = "a";
        System.out.println(findChar(str));
    }

    public static List<String> findChar(String str) {
        String[] newStr = str.split("");
        List<String> stringList = new ArrayList<>();
        for (int i = 0; i < newStr.length; i++) {
            for (int j = i + 1; j < newStr.length; j++) {
                if (newStr[i].equals(newStr[j])) {
                    stringList.add(newStr[i]);
                }
            }
        }
        return stringList;
    }
}
