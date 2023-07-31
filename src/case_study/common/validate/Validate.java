package case_study.common.validate;

import static case_study.view.Run.scanner;

public class Validate {
    public static String validateIdEmployee() {
        final String REGEX_ID = "^NV-[0-9]{4}$";
        boolean check = true;
        String id = null;
        do {
            try {
                System.out.println("Input id in the format 'NV-XXXX'");
                id = scanner.nextLine();
                check = id.matches(REGEX_ID);
            } catch (Exception e) {
                System.out.println("Input Again!!");
            }
        } while (!check);
        return id;
    }

    public static String validateIdCustomer() {
        final String REGEX_ID = "KH-[0-9]{4}$";
        boolean check = true;
        String id = null;
        do {
            try {
                System.out.println("Input id in the format 'KH-XXXX'");
                id = scanner.nextLine();
                check = id.matches(REGEX_ID);
            } catch (Exception e) {
                System.out.println("Input Again!!");
            }
        } while (!check);
        return id;
    }

    public static String validateNameAndType() {
        final String REGEX_NAME_TYPE = "^([A-Z][a-z]+\\s)+[A-Z][a-z]*$";
        boolean check = true;
        String name = null;
        do {
            try {
                System.out.println("Enter the name with the first letter capitalized");
                name = scanner.nextLine();
                check = name.matches(REGEX_NAME_TYPE);
            } catch (Exception e) {
                System.out.println("Input Again!!");
            }
        } while (!check);
        return name;
    }

    public static String validateDate() {
        final String REGEX_DATE = "^([0-2]\\d|30|31)\\-([0]\\d|10|11|12)\\-(200[0-5]|19[6-9][0-9])$";
        boolean check = true;
        String date = null;
        do {
            try {
                System.out.println("Enter date of birth at least 18 years old");
                date = scanner.nextLine();
                check = date.matches(REGEX_DATE);
            } catch (Exception e) {
                System.out.println("Input Again!!");
            }
        } while (!check);
        return date;
    }
    public static String validateGender(){
        String gender = "";
        do {
            System.out.println("Enter your gender" +
                    "\n1.Man"+
                    "\n2.Lady"+
                    "\n3.Another");
            String select = scanner.nextLine().toLowerCase().trim();
            switch (select){
                case "1":
                    gender = "man";
                    return gender;
                case "2":
                    gender = "lady";
                    return gender;
                case "3":
                    gender = "another";
                    return gender;
                default:
                    System.out.println("Input Again!!!");
            }
        }while (true);
    }

    public static String validateIdentifyNumber() {
        final String REGEX_IDENTIFY = "^\\d{9,12}$";
        boolean check = true;
        String identify = null;
        do {
            try {
                System.out.println("Enter your identity card number from 9 to 12 numbers");
                identify = scanner.nextLine();
                check = identify.matches(REGEX_IDENTIFY);
            } catch (Exception e) {
                System.out.println("Input Again!!");
            }
        } while (!check);
        return identify;
    }

    public static String validatePhoneNumber() {
        final String REGEX_PHONE_NUMBER = "^0[0-9]{9}$";
        boolean check = true;
        String phoneNumber = null;
        do {
            try {
                System.out.println("Enter your phone number start with 0 and enough 10 numbers");
                phoneNumber = scanner.nextLine();
                check = phoneNumber.matches(REGEX_PHONE_NUMBER);
            } catch (Exception e) {
                System.out.println("Input Again!!");
            }
        } while (!check);
        return phoneNumber;
    }

    public static int validateSalary() {
        int salary;
        do {
            System.out.println("Enter your salary bigger than 0");
            try {
                salary = Integer.parseInt(scanner.nextLine());
                if (salary > 0) {
                    return salary;
                }
                throw new NumberFormatException("Input Again!!!");
            } catch (NumberFormatException e) {
                System.out.println(e.getMessage());
            } catch (Exception e) {
                System.out.println();
            }
        } while (true);
    }

    public static String validateIdFacility() {
        final String REGEX_ID = "SV+(VL|HO|RO)-[0-9]{4}$";
        boolean check = true;
        String id = null;
        do {
            try {
                System.out.println("Enter your id facility with format :'SVXX-YYYY'");
                id = scanner.nextLine();
                check = id.matches(REGEX_ID);
            } catch (Exception e) {
                System.out.println("Input Again!!");
            }
        } while (!check);
        return id;
    }
    public static String validateEmail(){
        final String REGEX_EMAIL = "^[a-zA-Z0-9]\\w{5,31}@[a-z]{1,11}\\.[a-z]{1,11}(\\.[a-z]{1,11})?$";
        boolean check = true;
        String email = null;
        do {
            try {
                System.out.println("Enter your email");
                email = scanner.nextLine();
                check = email.matches(REGEX_EMAIL);
            }catch (Exception e){
                System.out.println("Input Again!!!");
            }
        }while (!check);
        return email;
    }
    public static String validateLevel(){
        String level = "";
        do {
            System.out.println("Enter level" +
                    "\n1.Intermediate" +
                    "\n2.College" +
                    "\n3.University" +
                    "\n4.After university");
            String select = scanner.nextLine();
            switch (select){
                case "1":
                    level = "Intermediate";
                    return level;
                case "2":
                    level = "College";
                    return level;
                case "3":
                    level = "University";
                    return level;
                case "4":
                    level = "After university";
                    return level;
                default:
                    System.out.println("Input Wrong!!");
                    break;
            }
        }while (true);
    }
    public static String validatePosition(){
        String position = "";
        do {
            System.out.println("Enter position" +
                    "\n1.Receptionist" +
                    "\n2.Serve" +
                    "\n3.Expert" +
                    "\n4.Supervisor" +
                    "\n5.Administrator" +
                    "\n6.General Manager");
            String select = scanner.nextLine();
            switch (select){
                case "1":
                    position = "Receptionist";
                    return position;
                case "2":
                    position = "Serve";
                    return position;
                case "3":
                    position = "Expert";
                    return position;
                case "4":
                    position = "Supervisor";
                    return position;
                case "5":
                    position = "Administrator";
                    return position;
                case "6":
                    position = "General Manager";
                    return position;
                default:
                    System.out.println("Input Wrong!!");
                    break;
            }
        }while (true);
    }
    public static String ValidateKindOfCustomer(){
        String kindOfCustomer = "";
        do {
            System.out.println("Enter kind of customer" +
                    "\n1.Diamond" +
                    "\n2.Platinum" +
                    "\n3.Gold" +
                    "\n4.Silver" +
                    "\n5.Member");
            String select = scanner.nextLine();
            switch (select){
                case "1":
                    kindOfCustomer = "Diamond";
                    return kindOfCustomer;
                case "2":
                    kindOfCustomer = "Platinum";
                    return kindOfCustomer;
                case "3":
                    kindOfCustomer = "Gold";
                    return kindOfCustomer;
                case "4":
                    kindOfCustomer = "Silver";
                    return kindOfCustomer;
                case "5":
                    kindOfCustomer = "Member";
                    return kindOfCustomer;
                default:
                    System.out.println("Input Wrong!!");
                    break;
            }
        }while (true);
    }
}
