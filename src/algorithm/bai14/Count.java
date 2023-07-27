package algorithm.bai14;

import java.util.HashSet;
import java.util.Set;

public class Count {
    public static int countWord(String str){
        String[] array = str.split("");
        Set<String> set = new HashSet<>();
        for (String s : array) {
            set.add(s);
        }
        return set.size();
    }
//    public static Set<String> countSet(String str){
//        String[] array = str.split("");
//        Set<String> set = new HashSet<>();
//        for (String s : array) {
//            set.add(s);
//        }
//        return set;
//    }
}
