package ss10_list.fruit_utils;

public class Regex {
    private static final String REGEX_DAY = "^[0-9]{1,2}\\/[0-9]{1,2}\\/[0-9]{4}$";

    public static boolean validateDay(String day) {
        return day.matches(REGEX_DAY);
    }
}
