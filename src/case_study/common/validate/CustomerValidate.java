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
}
