package algorithm.bai11;

public class Num {
    public static int minumunNum(int x,int y,int z){
        int result = 0;
        int num1 = x;
        int num2 = y;
        int start = 1;
        int end = x + y;
        while (z >= result){
            x = num1;
            y = num2;
            x *= start;
            y *= start;
            for (int i = 0; i < end; i++) {
                    if (x + y + i >= z){
                    result = x + i;
                    return result;
                }
            }
            start++;
        }
        return -1;
    }
}
