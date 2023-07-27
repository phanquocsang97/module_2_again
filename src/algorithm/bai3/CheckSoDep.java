package algorithm.bai3;

public class CheckSoDep {
    public static void main(String[] args) {
        String str = "1,2,-1,2";
        System.out.println(checkBeautifulArray(str));
    }

    public static boolean checkBeautifulArray(String str) {
        String[] arr = str.split(",");
        int sum1;
        int sum2;
        for (int i = 1; i < arr.length; i++) {
            sum1 = 0;
            sum2 = 0;
            for (int j = 0; j < i; j++) {
                sum1 += Integer.parseInt(arr[j]);
            }
            for (int j = i + 1; j < arr.length; j++) {
                sum2 += Integer.parseInt(arr[j]);
            }
            if (sum1 == sum2) {
                return true;
            }
        }
        return false;
    }
}
