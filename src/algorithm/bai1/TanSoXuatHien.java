package algorithm.bai1;

import java.util.HashMap;
import java.util.Map;

public class TanSoXuatHien {
    public static void main(String[] args) {
        String arr = "1";
        System.out.println(checkEqualFrequency(arr));

    }

    public static boolean checkEqualFrequency(String arr) {
        String[] newArr = arr.split(",");
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < newArr.length; i++) {
            if (!map.keySet().contains(newArr[i])) {
                map.put(newArr[i], 1);
            } else {
                map.put(newArr[i], map.get(newArr[i]) + 1);
            }
        }
        int a = map.get(newArr[0]);
        for (Map.Entry<String, Integer> m : map.entrySet()) {
            if (!m.getValue().equals(a)) {
                return false;
            }

        }
        if (map.size() < 2) {
            return false;
        } else {
            return true;

        }
    }
}
