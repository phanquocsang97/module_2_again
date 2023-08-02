package case_study.common.validate;

import case_study.common.exception.EmployeeException;

public class EmployeeValidate {
    public static boolean checkIdEmployee(String id) throws EmployeeException {
        final String REGEX_ID = "NV-[0-9]{4}$";
        if (!id.matches(REGEX_ID)){
            throw new EmployeeException("Id not true!!!");
        }
        return true;
    }
    public static boolean checkNameEmployee(String name) throws EmployeeException{
        final String REGEX_NAME = "^([A-Z][a-z]+\\s)+[A-Z][a-z]*$";
        if (!name.matches(REGEX_NAME)){
            throw new EmployeeException("Name not true!!!");
        }
        return true;
    }
    public static boolean checkDateEmployee(String date)throws EmployeeException{
        final String REGEX_DATE = "^([0-2]\\d|30|31)\\-([0]\\d|10|11|12)\\-(200[0-5]|19[6-9][0-9])$";
        if (!date.matches(REGEX_DATE)){
            throw new EmployeeException("Date not true!!!");
        }
        return true;
    }
    public static boolean checkIdentifyEmployee(String identify) throws EmployeeException{
        final String REGEX_IDENTIFY = "^\\d{9,12}$";
        if (!identify.matches(REGEX_IDENTIFY)){
            throw new EmployeeException("Identify not true!!!");
        }
        return true;
    }
    public static boolean checkPhoneEmployee(String phoneNumber) throws EmployeeException{
        final String REGEX_PHONE = "^0[0-9]{9}$";
        if (!phoneNumber.matches(REGEX_PHONE)){
            throw new EmployeeException("Phone number not true!!!");
        }
        return true;
    }
    public static boolean checkSalaryEmployee(int salary) throws EmployeeException{
        do {
            try {
                if (salary > 0){
                    return true;
                }
                throw new EmployeeException("Salary not true!!!");

            }catch (EmployeeException e){
                System.out.println(e.getMessage());
                return false;
            }
        }while (true);
    }
}
