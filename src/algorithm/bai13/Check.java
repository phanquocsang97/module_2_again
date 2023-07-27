package algorithm.bai13;

import java.util.ArrayList;
import java.util.List;

public class Check {
    public static int findNumberPosition(String str) {
        String[] newStr = str.split(",");
        int[] arr = new int[newStr.length];
        for (int i = 0; i < newStr.length; i++) {
            arr[i] = Integer.parseInt(newStr[i]);
        }

        int maxIndex = 0;
        int secondMaxIndex = -1;
        if (arr.length < 2) {
            return -1;
        }
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[maxIndex]) {
                secondMaxIndex = maxIndex;
                maxIndex = i;
            } else if (secondMaxIndex == -1 || arr[i] > arr[secondMaxIndex]) {
                if (arr[i] < arr[maxIndex]) {
                    secondMaxIndex = i;
                }
            }
        }
        if (secondMaxIndex == -1) {
            return -1;
        }
        return secondMaxIndex;
    }
}
