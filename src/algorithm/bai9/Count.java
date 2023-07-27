package algorithm.bai9;

import java.util.ArrayList;
import java.util.List;

public class Count {
    public static boolean checkCircleNum(int a) {
        String s = String.valueOf(a);
        if (s.charAt(0) == s.charAt(s.length() -1)){
            return true;
        }
        return false;
    }
    public static int checkCircleNum(int a,int b){
        int count = 0;
        for (int i = a; i < b; i++) {
            if (checkCircleNum(i)){
                count++;
            }
        }
        return count;
    }
}
