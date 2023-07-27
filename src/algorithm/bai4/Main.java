package algorithm.bai4;

import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        String str = "CodeMarathon";
        System.out.println(amendTheSentence(str));
    }

    public static String amendTheSentence(String str) {
        String[] str1 = str.split("");
        String newStr = "";
        for (int i = 0; i < str1.length; i++) {
            if (str1[i].equals(" ")){
                continue;
            }
            if (str1[i].equals(str1[i].toUpperCase()) && i > 0){
                newStr += " " ;
            }
            newStr += str1[i].toLowerCase();
        }
        return newStr;
    }
}
