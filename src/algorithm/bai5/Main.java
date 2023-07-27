package algorithm.bai5;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] str = {-1, 150, 165, 170, -1, -1, 160, 180};
        System.out.println(Arrays.toString(sortByHeight(str)));
    }

    public static int[] sortByHeight(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] < arr[j] && arr[i] != -1) {
                    int a = arr[i];
                    arr[i] = arr[j];
                    arr[j] = a;
                }
            }
        }
        return arr;
    }
}
