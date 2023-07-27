package algorithm.bai18;

import java.util.ArrayList;
import java.util.List;

public class NewArray {
    public static int[] makeArrayConsecutive(String str){
        String[] arr = str.split(",");
        List<Integer> list = new ArrayList<>();
        int max = Integer.parseInt(arr[0]);
        int min = Integer.parseInt(arr[0]);
        for (int i = 0; i < arr.length; i++) {
            int num = Integer.parseInt(arr[i]);
            if (max < num){
                max = num;
            }
            if (min > num){
                min = num;
            }
            list.add(num);
        }
        int[] newArr = new int[max - min + 1 - arr.length];
        int index = 0;
        for (int i = min; i < max; i++) {
            if (!list.contains(i)){
                newArr[index] = i;
                index++;
            }
        }
        return newArr;
    }
}
