package algorithm.bai7;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 8, 43}, {9, 49, 11, 7}, {11, 23, 4, 0}, {1, 2, 6, 51}};
        System.out.println(Arrays.toString(checkNumberArrPrime(arr)));
    }

    public static boolean checkPrime(int number) {
        if (number < 2) {
            return false;
        } else {
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public static int[] checkNumberArrPrime(int[][] arr) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (checkPrime(arr[i][j])) {
                    list.add(arr[i][j]);
                }
            }
        }
        List<Integer> newList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (!newList.contains(list.get(i)) ) {
                newList.add(list.get(i));
            }
        }
        Collections.sort(newList);
        int index = 0;
        int[] array = new int[newList.size()];
        for (int i = 0; i < newList.size(); i++) {
                array[index] = newList.get(i);
                index++;
        }
        return array;
    }
}
