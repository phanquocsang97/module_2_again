package ss19_string_regex.view;

import ss19_string_regex.common.ReadAndWrite;
import ss19_string_regex.validate.Validate;

import java.util.List;
import java.util.Scanner;

public class Run {
    public static Scanner scanner = new Scanner(System.in);
    public static final String PATH_FILE_EMAIL = "D:\\CodeGym\\module_2_again\\src\\ss19_string_regex\\data\\email.csv";
    public static void main(String[] args) {
        List<String> stringList = ReadAndWrite.readFileBook(PATH_FILE_EMAIL);
        for (String s : stringList) {
            if (Validate.validateEmail(s)){
                System.out.println(s + " enter correct format");
            }else {
                System.out.println(s +" enter wrong format");
            }
        }
    }
}
