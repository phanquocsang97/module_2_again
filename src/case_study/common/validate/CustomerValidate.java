package case_study.common.validate;

import case_study.common.exception.CustomerException;

public class CustomerValidate {
    public static boolean checkIdCustomer(String id) throws CustomerException {
        final String REGEX_ID = "KH-[0-9]{4}$";
        if (!id.matches(REGEX_ID)){
            throw new CustomerException("Id not true!!!");
        }
        return true;
    }
//    public static boolean checkIdCustomer1(String id){
//        final String REGEX_ID = "KH-[0-9]{4}$";
//        return id.matches(REGEX_ID);
//    }
    public static boolean checkNameCustomer(String name) throws CustomerException {
        final String REGEX_NAME = "^([A-Z][a-z]+\\s)+[A-Z][a-z]*$";
        if (!name.matches(REGEX_NAME)){
            throw new CustomerException("Name not true!!!");
        }
        return true;
    }
    public static boolean checkDateCustomer(String date) throws CustomerException {
        final String REGEX_DATE = "^([0-2]\\d|30|31)\\-([0]\\d|10|11|12)\\-(200[0-5]|19[6-9][0-9])$";
        if (!date.matches(REGEX_DATE)){
            throw new CustomerException("Date not true!!!");
        }
        return true;
    }
    public static boolean checkIdentifyCustomer(String identify) throws CustomerException {
        final String REGEX_IDENTIFY = "^\\d{9,12}$";
        if (!identify.matches(REGEX_IDENTIFY)){
            throw new CustomerException("Identify not true!!!");
        }
        return true;
    }
    public static boolean checkPhoneCustomer(String phoneNumber) throws CustomerException {
        final String REGEX_PHONE = "^0[0-9]{9}$";
        if (!phoneNumber.matches(REGEX_PHONE)){
            throw new CustomerException("Phone number not true!!!");
        }
        return true;
    }
}
