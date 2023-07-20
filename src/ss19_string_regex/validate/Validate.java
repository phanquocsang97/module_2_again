package ss19_string_regex.validate;

import static ss19_string_regex.view.Run.scanner;

public class Validate {
    public static boolean validateEmail(String str){
        return str.matches("^[A-Za-z0-9_?]{6,32}[@][a-z]{2,12}[.][a-z]{2,12}$");
    }

}
