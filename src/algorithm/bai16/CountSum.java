package algorithm.bai16;

public class CountSum {
    public static int[] prefixSum(String str){
        String[] array = str.split(",");
        int[] arrInt = new int[array.length];
        int[] arrStr = new int[array.length];
        for (int i = 0; i < arrInt.length; i++) {
            arrInt[i] = Integer.parseInt(array[i]);
        }
        for (int i = 1; i < arrStr.length; i++) {
            arrStr[0] =arrInt[0];
            arrStr[i] = arrStr[i - 1] +arrInt[i];
        }
        return arrStr;
    }
}
