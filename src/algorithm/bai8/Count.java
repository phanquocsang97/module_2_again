package algorithm.bai8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Count {
    public static int checkOccurrence(String str1, String str2){
        String[] newStr1 = str1.split(",");
        String[] newStr2 = str2.split(",");
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        for (int i = 0; i < newStr1.length; i++) {
            list1.add(Integer.valueOf(newStr1[i]));
        }
        for (int i = 0; i < newStr2.length; i++) {
            list2.add(Integer.valueOf(newStr2[i]));
        }
        List<Integer> list3 = new ArrayList<>();
        for (int i = 0; i < list1.size(); i++) {
            for (int j = 0; j < list2.size(); j++) {
                if (list1.get(i) == list2.get(j)){
                    list3.add(list2.get(j));
                }
            }
        }
        for (int i = 0; i < list3.size(); i++) {
            if (!list3.contains(list2.get(i))){
                return 0;
            }
        }
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < list3.size(); i++) {
            if (!map.containsKey(list3.get(i))){
                map.put(list3.get(i),1);
            }else {
                map.put(list3.get(i),map.get(list3.get(i)) + 1);
            }
        }
        int min = map.get(list3.get(0));
        for (Map.Entry<Integer,Integer> key: map.entrySet()) {
            if (min > key.getValue()){
                min = key.getValue();
            }
        }
        return min;
    }
}
